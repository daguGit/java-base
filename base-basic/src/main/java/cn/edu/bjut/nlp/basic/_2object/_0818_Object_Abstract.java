package cn.edu.bjut.nlp.basic._2object;
/*
抽象类：

目前存在的问题：
	1. 动物类的run方法描述的不正确。
	2. 没有强制要子类一定要重写run方法。

抽象类的应用场景：
	我们在描述一类事物的时候，发现该种事物确实存在着某种行为，
但是这种行为目前是不具体的，那么我们可以抽取这种行为 的声明，但是
不去实现该种行为，这时候这种行为我们称作为抽象的行为，我们就需要使用抽象类。

抽象类的好处: 强制要求子类一定要实现指定的方法。


抽象类要注意的细节：
	1. 如果一个函数没有方法体，那么该函数必须要使用abstract修饰,把该函数修饰成抽象 的函数。。
	2. 如果一个类出现了抽象的函数，那么该类也必须 使用abstract修饰。
	3. 如果一个非抽象类继承了抽象类，那么必须要把抽象类的所有抽象方法全部实现。
	4. 抽象类可以存在非抽象方法，也可以存在抽象的方法.
	5. 抽象类可以不存在抽象方法的。 
	5. 抽象类是不能创建对象的。
		疑问：为什么抽象类不能创建对象呢？
		因为抽象类是存在抽象方法的，如果能让抽象类创建对象的话，那么使用抽象的对象
		调用抽象方法是没有任何意义的。
	6. 抽象类是存在构造函数的，其构造函数是提供给子类创建对象的时候初始化父类的属性的。



*/
public class _0818_Object_Abstract {
	public static void main(String[] args){
		Dog3 dog3 = new Dog3("name", "color");
		dog3.run();
	}
}
//动物类--->抽象类
abstract class Animal4{
	String name;
	String color;
	public Animal4(String name,String color){
		this.name= name;
		this.color = color;
	}
	//非抽象的方法
	public void eat(){
		System.out.println("eat for");
	}
	public abstract void run();
}
class Dog3 extends Animal4{

	public Dog3(String name, String color) {
		super(name, color);	
	}
	public void run(){
		System.out.println("run for ");
	}
}