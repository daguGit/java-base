package cn.edu.bjut.nlp.basic._2object;
/*
super关键字：

super关键字代表了父类空间的引用。

super关键字的 作用：
	1. 子父类存在着同名的成员时，在子类中默认是访问子类的成员，可以通过super关键字指定访问父类的成员。
	2. 创建子类对象时，默认会先调用父类无参的构造方法，可以通过super关键字指定调用父类的构造方法。

super关键字调用父类构造方法要注意的事项：
	1. 如果在子类的构造方法上没有指定调用父类的构造方法，那么java编译器会在子类的构造方法上面加上super()语句。
	2. super关键字调用父类的构造函数时，该语句必须要是子类构造函数中的第一个语句。
	3. super与this关键字不能同时出现在同一个构造函数中调用其他的构造函数。因为两个语句都需要第一个语句。


super关键字与this关键字的区别：
	1. 代表的事物不一致。
			1. super关键字代表的是父类空间的引用。	
			2. this关键字代表的是所属函数的调用者对象。
	2. 使用前提不一致。
			1. super关键字必须要有继承关系才能使用。
			2. this关键字不需要存在继承关系也可使用。
	3. 调用构造函数的区别：
			1. super关键字是调用父类的构造函数。
			2. this关键字是调用本类的构造函数。
*/
public class _0814_Object_Super {
	public static void main(String[] args) {
		Zi zi = new Zi("dfb",34);
		zi.eat();
	}
}

class Fu{
		
	int x = 10;

	String name;

	public Fu(){
		System.out.println("Fu类无参的构造方法..");
	}

	public Fu(String name){
		this.name = name;
		System.out.println("Fu类带参的构造方法..");
	}

	public void eat(){
		System.out.println("小头爸爸吃番薯..");
	}
}

class Zi extends Fu{
	
	int x = 20; 

	int num;
	
	public Zi(String name,int num){
		super(name); //指定调用了父类带参的 构造方法...
		//this(); // 调用本类无参构造方法..
		//super(); //指定调用了父类无参构造方法。。。
		System.out.println("Zi类带参的构造方法..");
	}

	public Zi(){
		System.out.println("Zi类无参的构造方法..");
	}


	public void print(){
		System.out.println("x = " +super.x);
	}

	public void eat(){
		System.out.println("大头儿子吃龙虾..");
	}
}
