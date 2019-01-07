package cn.edu.bjut.nlp.basic._2object;
/*
this关键字调用其他的构造函数要注意的事项：
	1. this关键字调用其他的构造函数时，this关键字必须要位于构造函数中 的第一个语句。
	2. this关键字在构造函数中不能出现相互调用 的情况，因为是一个死循环。

 */
public class _0808_Object_ThisInvokeConstruction {
	public static void main(String[] args) {
		Student2 s = new Student2(110, "铁蛋");
		System.out.println("编号：" + s.id + " 名字：" + s.name);
		/*
		 * 
		 * Student s2 = new Student("金胖子"); System.out.println("名字：" + s2.name);
		 */
	}
}

class Student2 {
	int id;
	String name;

	// 目前情况：存在同名 的成员 变量与局部变量，在方法内部默认是使用局部变量的
	public Student2(int id, String name) {
		// this(); //调用了本类无参的 构造方法。
		// 调用了本类的一个参数的构造方法
		this(name);
		this.id = id;
		System.out.println("两个参数的构造方法被调用了...");

	}

	public Student2(String name) {
		this.name = name;
		System.out.println("一个参数的构造方法被调用了...");
	}
}