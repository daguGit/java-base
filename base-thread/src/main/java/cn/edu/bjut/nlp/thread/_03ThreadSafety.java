package cn.edu.bjut.nlp.thread;

/*
 需求： 模拟3个窗口同时在售50张 票 。

 问题1 ：为什么50张票被卖出了150次？

 出现 的原因： 因为num是非静态的，非静态的成员变量数据是在每个对象中都会维护一份数据的,三个线程对象就会有三份。

 解决方案：把num票数共享出来给三个线程对象使用。使用static修饰。

 问题2： 出现了线程安全问题 ?

 线程 安全问题的解决方案：sun提供了线程同步机制让我们解决这类问题的。

 java线程同步机制的方式：

 方式一：同步代码块

 同步代码块的格式：

 synchronized(锁对象){
 需要被同步的代码...
 }

 同步代码块要注意事项：
 1. 任意的一个对象都可以做为锁对象。
 2. 在同步代码块中调用了sleep方法并不是释放锁对象的。
 3. 只有真正存在线程安全问题的时候才使用同步代码块，否则会降低效率的。
 4. 多线程操作的锁 对象必须 是唯一共享 的。否则无效。


 需求： 一个银行账户5000块，两夫妻一个拿着 存折，一个拿着卡，开始取钱比赛，每次只能取一千块，要求不准出现线程安全问题。


 出现线程安全问题的根本原因：
 1. 存在两个或者两个以上 的线程对象,而且线程之间共享着一个资源。
 2. 有多个语句操作了共享资源。
 
方式二：同步函数  ：  同步函数就是使用synchronized修饰一个函数。
	
	同步函数要注意的事项 ：
		1. 如果是一个非静态的同步函数的锁 对象是this对象，如果是静态的同步函数的锁对象是当前函数所属的类的字节码文件（class对象）。
		2. 同步函数的锁对象是固定的，不能由你来指定的。

	
	推荐使用： 同步代码块。
		原因：
			1. 同步代码块的锁对象可以由我们随意指定，方便控制。同步函数的锁对象是固定 的，不能由我们来指定。
			2. 同步代码块可以很方便控制需要被同步代码的范围，同步函数必须是整个函数 的所有代码都被同步了。
			


 */
class SaleTicket extends Thread {
	static int num = 50;//票数  非静态的成员变量,非静态的成员变量数据是在每个对象中都会维护一份数据的。
	static Object object;
	public SaleTicket(String name) {
		super(name);
	}

	@Override
	public void run() {
		while (true) {
			/*
			 * 任意的对象都可以作为所对象，凡是对象内部都维护了一个状态。java同步价值就是使用了对象中的状态最为了锁的标志
			 *  例 ：state = 0 开  state=1 关
			 *  注意这个这个对象必须保证是共享的。使用“ ”这样创建的字符串也可以，因为这样创建的字符串在常量池中，只创建了一次。
			 *  使用new关键字则不可以。 
			 * */
			synchronized (" ") {
	//			synchronized (object) {
				if (num > 0) {
					System.out.println(Thread.currentThread().getName()
							+ "售出了第" + num + "号票");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					num--;
				} else {
					System.out.println("售罄了..");
					break;
				}
			}
		}

	}

}

class BanckThread extends Thread{
	

	static int count = 5000;
	public BanckThread(String name){
		super(name);
	}
	
	/*
	//1.如果是一个非静态的同步函数的锁 对象是this对象
	// 这样就使得锁对象的是两个this---thread1 和 thread2 根本就锁不住
	@Override
	public synchronized void run() {
		while(true){
			if(count > 0){
				System.out.println(Thread.currentThread().getName()+"取走了1000块,还剩余"+(count-1000)+"元");
				count -=1000;
			}else{
				System.out.println("取光了...");
				break;
			}
		}
	}
	*/
	
	@Override
	public synchronized void run() {
		getMoney();//使用这种方式的话，就会造成一个人取光所有的钱
	}
	//2.静态的同步函数的锁对象是当前函数所属的类的字节码文件（class对象）
	//静态的函数---->函数所属 的类的字节码文件对象--->BankThread.class  此锁对象是唯一的。创建一个Class类的对象，把类文件的信息全部保存到该对象中。
	public static synchronized  void getMoney(){
		while(true){
			if(count > 0){
				System.out.println(Thread.currentThread().getName()+"取走了1000块,还剩余"+(count-1000)+"元");
				count -=1000;
			}else{
				System.out.println("取光了...");
				break;
			}
		}
	}
}

public class _03ThreadSafety {

	public static void main(String[] args) {
		/*
		    // 创建三个线程对象，模拟三个窗口
			SaleTicket thread1 = new SaleTicket("窗口1");
			SaleTicket thread2 = new SaleTicket("窗口2");
			SaleTicket thread3 = new SaleTicket("窗口3");
			// 开启线程售票
			thread1.start();
			thread2.start();
			thread3.start();
		*/
		BanckThread thread1 = new BanckThread("老公");
		BanckThread thread2 = new BanckThread("老婆");
		thread2.start();thread1.start();
		
		
	}

}
