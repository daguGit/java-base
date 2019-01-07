package cn.edu.bjut.nlp.thread;
/*
进程 ：  正在执行的程序称作为一个进程。  进程负责了内存空间的划分。

问题： windows号称是多任务的操作系统,那么windows是同时运行多个应用程序吗？
	
	从宏观的角度： windows确实是在同时运行多个应用程序。
	
	从微观角度： cpu是做了一个快速切换执行的动作，由于速度态度，所以我感觉不到在切换 而已。

线程： 线程在一个进程 中负责了代码的执行，就是进程中一个执行路径，

多线程： 在一个进程中有多个线程同时在执行不同的任务。

疑问 ：线程负责了代码 的执行，我们之前没有学过线程，为什么代码可以执行呢？
	运行任何一个java程序，jvm在运行的时候都会创建一个main线程执行main方法中所有代码。

一个java应用程序至少有几个线程？
	至少有两个线程， 一个是主线程负责main方法代码的执行，一个是垃圾回收器线程,负责了回收垃圾。

多线程的好处：
	1. 解决了一个进程能同时执行多个任务的问题。
	2. 提高了资源的利用率。

多线程 的弊端：
	1. 增加cpu的负担。
	2. 降低了一个进程中线程的执行概率。
	3. 引发了线程安全 问题。
	4. 出现了死锁现象。
	
如何创建多线程：
	
	创建线程的方式：
	
		方式一：
			1. 自定义一个类继承Thread类。
			2. 重写Thread类的run方法 , 把自定义线程的任务代码写在run方法中
				疑问： 重写run方法的目的是什么？  
			   每个线程都有自己的任务代码，jvm创建的主线程的任务代码就是main方法中的所有代码, 自定义线程的任务代码就写在run方法中，自定义线程负责了run方法中代码。	
			3. 创建Thread的子类对象，并且调用start方法开启线程。
				
			注意：	一个线程一旦开启，那么线程就会执行run方法中的代码，run方法千万不能直接调用，直接调用run方法就相当调用了一个普通的方法而已
				并没有开启新的线程。
		方式二：
			1. 自定义一个类实现Runnable接口。
			2. 实现Runnable接口 的run方法，把自定义线程的任务定义在run方法上。
			3. 创建Runnable实现类对象。
			4. 创建Thread类 的对象，并且把Runnable实现类的对象作为实参传递。
			5. 调用Thread对象 的start方法开启一个线程。


问题1： 请问Runnable实现类的对象是线程对象吗？
	Runnable实现类的对象并 不是一个线程对象，只不过是实现了Runnable接口 的对象而已。
	只有是Thread或者是Thread的子类才是线程 对象。

问题2： 为什么要把Runnable实现类的对象作为实参传递给Thread对象呢？作用是什么？
	作用就是把Runnable实现类的对象的run方法作为了线程的任务代码去执行了。

推荐使用： 第二种。 实现Runable接口的。 
原因： 因为java单继承 ,多实现的。


			
*/
class Demo1 extends Thread{
	@Override  //把自定义线程的任务代码写在run方法中。
	public void run() {
		for(int i  = 0 ; i < 100 ; i++){
			System.out.println("自定义线程："+i);
		}
	}
}
class Demo3 implements Runnable{
	@Override  //把自定义线程的任务代码写在run方法中。

	public void run() {
		System.out.println("this" + this);//这种方式显示的是DEMO3这个对象
		System.out.println("current"+Thread.currentThread().getName());//这种方式现实的是狗娃这个线程所以Runnable实现类的对象并 不是一个线程对象，只不过是实现了Runnable接口 的对象而已。
		for(int i  = 0 ; i < 100 ; i++){
			System.out.println("自定义线程："+i);
		}
	}
	
}
public class _01ThreadCreate {
	public static void main(String[] args) {
		/*
		 Demo1 demo1 = new Demo1();
		demo1.start();
		*/
		
		//创建Runnable实现类的对象
		Demo3 d = new Demo3();
		//创建Thread类的对象， 把Runnable实现类对象作为实参传递。
		
		Thread thread = new Thread(d,"狗娃");  //Thread类使用Target变量记录了d对象，
		//调用thread对象的start方法开启线程。
		thread.start();
		for(int i  = 0 ; i < 100 ; i++){
			System.out.println("main线程："+i);
		}

	}

}
