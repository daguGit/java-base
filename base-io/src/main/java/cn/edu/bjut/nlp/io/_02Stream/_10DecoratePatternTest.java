package cn.edu.bjut.nlp.io._02Stream;

/*练习：
 一家三口每个人都会工作，儿子的工作就是画画，母亲的工作就是在儿子的基础上做一个增强，不单止可以画画，还可以上涂料。
 爸爸的工作就是在妈妈基础上做了增强，就是上画框。
 */
interface Work {
	public void work();
}

class Dad implements Work {
	// 需要被增强的类的引用
	Work worker;

	public Dad(Work worker) {
		this.worker = worker;
	}

	@Override
	public void work() {
		worker.work();
		System.out.println("上画框...");
	}

}

class Mom implements Work {
	// 需要被增强的类。
	Work worker;

	public Mom(Work worker) {
		this.worker = worker;
	}

	@Override
	public void work() {
		worker.work();
		System.out.println("给画上颜色..");
	}

}

class Son implements Work {

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("画画...");
	}
}

public class _10DecoratePatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Son s = new Son();
		// s.work();
		Mom m = new Mom(s);
		// m.work();
		Dad f = new Dad(s);
		f.work();

	}

}
