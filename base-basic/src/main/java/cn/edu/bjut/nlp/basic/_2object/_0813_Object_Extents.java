package cn.edu.bjut.nlp.basic._2object;
/*
目前存在的问题：
	1. 无法描述清楚这两个类之间的继承关系。
	2. 存在着重复代码。

面向对象的三大特征：
	1. 封装
	2. 继承
	3. 多态.

继承：继承是通过关键字extends体现的。

继承的格式：

	class 类名1 extends 类名2{
	
	}


继承要注意的事项：
	1. 千万不要为了减少重复代码而去继承，只有真正存在着继承关系的时候才去继承。
	2. 父类私有的成员不能被继承。
	3. 父类的构造函数不能被继承。
	4. 创建子类对象时默认会先调用父类无参的构造函数。

*/
/*
疑问： 为什么要调用父类的构造方法啊？这样子做的意义在那？

	调用父类 的构造方法是可以初始化从父类继承下去的属性的。

*/ 
//人类 
public class _0813_Object_Extents {
	public static void main(String[] args){
		Student4 student4 = new Student4();
		student4.study();
		student4.name = "nihao";
		System.out.println(student4.name);
	}
}
class Person3{
	String name;
	public Person3(){
		System.out.println("Person类的构造方法被调用了....");
	}
	public  Person3(String name){
		this.name = name;
	}
	public void  eat() {
		System.out.println("eat");
	}
}
class Student4 extends Person3{
	int num;
	public Student4(){
		System.out.println("Student类的构造方法被调用了....");
	}
	public Student4(String name){
		super(name);
	}
	public void study(){
		System.out.println("study");
	}
}
