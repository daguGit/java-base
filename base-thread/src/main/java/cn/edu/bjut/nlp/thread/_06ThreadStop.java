package cn.edu.bjut.nlp.thread;
/*
线程的停止：
	1. 停止一个线程 我们一般都会通过一个变量去控制的。
	2. 如果需要停止一个处于等待状态下的线程，那么我们需要通过变量配合notify方法或者interrupt()来使用。
*/
class Demo6 extends Thread{
	boolean flag = true;
	public Demo6(String name){
		super(name);
	}
	@Override
	public synchronized void run() {
		int i = 0;
		
		while(flag){
			System.out.println(Thread.currentThread().getName()+"  " +i);
			try {
				this.wait();
			} catch (InterruptedException e) {
				System.out.println("接收到了异常了....");
			}
			i++;
		}
		
	}
}
public class _06ThreadStop {
	public static void main(String[] args) {
		Demo6 demo6 = new Demo6("name");
		demo6.start();

		for(int i = 0 ; i<100 ; i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			//当主线程的i是80的时候停止狗娃线程。
			if (i == 80) {
				demo6.flag = false;
				/*synchronized (demo6) {
					demo6.notify();
				}*/
				//把线程的等待状态强制清除，被清除状态的线程会接收到一个InterruptedException。
				demo6.interrupt();//
			}
			
			
		}
	}

}
