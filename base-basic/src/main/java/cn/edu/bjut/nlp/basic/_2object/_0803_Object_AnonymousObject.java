package cn.edu.bjut.nlp.basic._2object;
/*
匿名对象：没有引用类型变量指向的对象称作为匿名对象。

需求： 使用 java类描述一个学生类。

匿名对象要注意的事项：
	1. 我们一般不会给匿名对象赋予属性值，因为永远无法获取到。
	2. 两个匿名对象永远都不可能是同一个对象。


匿名对象好处：简化书写。可以更好的被垃圾收集器回收


匿名对象的应用场景：
	1. 如果一个对象需要调用一个方法一次的时候，而调用完这个方法之后，该对象就不再使用了，这时候可以使用
	匿名对象。
	
	2. 可以作为实参调用一个函数。

*/

public class _0803_Object_AnonymousObject {
	public static void main(String[] args) 
	{
			//创建一个学生对象
		//Student s = new Student();  不是匿名对象
		//new Student().name = "狗娃"; //匿名对象 
		//System.out.println(new Student().name); //null
		System.out.println(new Student() == new Student()) ;  // "==" 用于引用类型变量时，比较的是内存地址。判断两个 对象是否为同一个对象
		
		//需求： 调用Student的study方法。
		
		
		Student s = new Student();
		s.study();
		
		new Student().study();

	}

}
//学生类
class Student{
	
	int num; //学号

	String name; //名字
	
	public void study(){
		System.out.println("好好学习，为将来称为高帅富做准备!");
	}
}
