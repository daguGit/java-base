package cn.edu.bjut.nlp.thread;

/*作业1：有一个水池，水池的容量是固定 的500L,一边为进水口,一边为出水口.要求,进水与放水不能同时进行.

 水池一旦满了不能继续注水,一旦放空了,不可以继续放水. 进水的速度5L/s ,  放水的速度2L/s  
 */
class Pool {
	int capcity = 0;
	boolean flag = false;

}

class In extends Thread {
	Pool pool;

	public In(Pool pool) {
		this.pool = pool;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (pool) {
				if (pool.capcity <= 45) {
					System.out.println("In + 5");
					pool.capcity += 5;
					// pool.flag = false;
					pool.notify();
				} else {
				//	pool.notify();

					try {
						pool.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		}
	}
}

class Out extends Thread {
	Pool pool;

	public Out(Pool pool) {
		this.pool = pool;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (pool) {
				if (pool.capcity >= 2) {
					System.out.println("Out - 2");
					pool.capcity -= 2;
					pool.notify();
				} else {
					//pool.notify();
					// pool.flag = true;
					try {
						pool.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}
	}
}

public class _05ThreadCommunicationTest {

	public static void main(String[] args) {
		Pool pool = new Pool();
		Out out = new Out(pool);
		In in = new In(pool);
		in.start();
		out.start();

	}

}
