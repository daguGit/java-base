package cn.edu.bjut.nlp.thread;
/*
守护线程（后台线程）:在一个进程中如果只剩下 了守护线程，那么守护线程也会死亡。

需求： 模拟QQ下载更新包。

一个线程默认都不是守护线程。

*/
class Demo7 extends Thread{
	
	public Demo7(String name){
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println("更新包目前下载"+i+"%");
			if(i==100){
				System.out.println("更新包下载完毕,准备安装..");
			}
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
public class _07ThreadDaemon  {
	

	public static void main(String[] args) {
		 Demo7 demo7 = new Demo7("后台线程");
		
		demo7.setDaemon(true);//setDaemon() 设置线程是否为守护线程，true为守护线程， false为非守护线程。
		System.out.println(demo7.isDaemon());//判断线程是否为守护线程。
		demo7.start();
		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName()+ " " + i );
		}

	}

}
