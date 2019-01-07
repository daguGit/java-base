package cn.edu.bjut.nlp.thread;
class SaleTicket2 implements Runnable{
	int num = 50;//这里不用static也行，因为这里只声明了一个对象，让四个线程去执行这个对象里的程序。
	@Override
	public void run() {
		while (true) {
			synchronized (" ") {
					if (num >0 ) {
					System.out.println(Thread.currentThread().getName()+" " + num);
					num--;
				}else{
					System.out.println("OUT");
					break;
				}
			}
			
		}
		
	}
}
public class _01ThreadCreateTest {

	public static void main(String[] args) {
		SaleTicket2 saleTicket2 = new SaleTicket2();
		Thread thread1 = new Thread(saleTicket2);
		Thread thread2 = new Thread(saleTicket2);
		Thread thread3 = new Thread(saleTicket2);
		Thread thread4 = new Thread(saleTicket2);
		thread1.start();
		thread2.start();

		thread3.start();
		thread4.start();
	}

}
