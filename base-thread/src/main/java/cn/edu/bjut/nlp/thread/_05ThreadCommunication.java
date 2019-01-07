package cn.edu.bjut.nlp.thread;

/*
 线程通讯： 一个线程完成了自己的任务时，要通知另外一个线程去完成另外一个任务.

 生产者与消费者


 wait():  等待   如果线程执行了wait方法，那么该线程会进入等待的状态，等待状态下的线程必须要被其他线程调用notify方法才能唤醒。
 notify()： 唤醒    唤醒线程池等待线程其中的一个。
 notifyAll() : 唤醒线程池所有等待 线程。
// wait ：一个线程如果执行了wait方法，该线程就会进去一个以锁对象为标识符的线程池中等待。执行此方法会释放锁
	// notify ：如果一个线程执行notify方法，那么就会唤醒以锁对象为标识符的线程中等待线程中其中一个

 wait与notify方法要注意的事项：
 1. wait方法与notify方法是属于Object对象 的。
 2. wait方法与notify方法必须要在同步代码块或者是同步函数中才能 使用。
 3. wait方法与notify方法必需要由锁对象调用。

 问题一：出现了线程安全问题。 价格错乱了...

 */
class Product {
	String name; // 名字
	double price; // 价格
	boolean flag = true;
}

class Producter extends Thread {
	Product product;
	int i = 0;

	public Producter(Product product) {
		this.product = product;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (product) {
				if (product.flag == false) {
					if (i % 2 == 0) {
						product.name = "苹果";
						product.price = 6.5;
					} else {
						product.name = "香蕉";
						product.price = 2.0;
					}
					i++;
					product.flag = true;
					// notify ：如果一个线程执行notify方法，那么就会唤醒以锁对象为标识符的线程中等待线程中其中一个
					product.notify(); //唤醒消费者去消费
				} else {
					try {
						// wait ：一个线程如果执行了wait方法，该线程就会进去一个以锁对象为标识符的线程池中等待。执行此方法会释放锁
						product.wait(); //生产者等待
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

		}
	}

}

class Consumer extends Thread {
	Product product;

	public Consumer(Product product) {
		this.product = product;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (product) {
				if (product.flag) {
					System.out.println("消费者消费了" + product.name + " 价格："
							+ product.price);
					product.flag = false;
					product.notify();// 唤醒生产者去生产
				} else {
					try {
						product.wait();//消费者也等待了...
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}

			}

		}
	}
}

public class _05ThreadCommunication {

	// wait ：一个线程如果执行了wait方法，该线程就会进去一个以锁对象为标识符的线程池中等待。执行此方法会释放锁
	// notify ：如果一个线程执行notify方法，那么就会唤醒以锁对象为标识符的线程中等待线程中其中一个
	public static void main(String[] args) {
		Product p = new Product();
		Producter producter = new Producter(p);
		Consumer consumer = new Consumer(p);
		producter.start();
		consumer.start();

	}

}
