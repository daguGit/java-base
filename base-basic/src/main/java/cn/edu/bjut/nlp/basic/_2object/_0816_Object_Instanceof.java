package cn.edu.bjut.nlp.basic._2object;
/*
instanceof 关键字

instanceof关键字的作用：判断一个对象是否属于指定的类别。

instanceof关键字的使用前提：判断的对象与指定的类别必须要存在继承或者实现的关系。

instanceof关键字的使用格式：
		
		对象  instanceof 类别

instanceof关键字的作用： 目前没用。但是后天我们学习 到了多态之后就非常有用。
一般我们做强制类型转换之前都会使用该关键字先判断一把，然后在进行转换的。


*/
public class _0816_Object_Instanceof {
	public static void main(String[] args){
		Dog dog = new Dog("nam", "color");
		System.out.println(dog instanceof Dog);
		Ani ani = new Ani("", "");
		System.out.println(ani instanceof Dog);
		System.out.println(dog instanceof Ani);
	}
}
class Ani{
	String name;
	String color;
	public Ani(String name,String color){
		this.name = name;
		this.color = color;
	}
}
class Dog extends Ani{
	public Dog(String name,String color){
		super(name, color);
	}
	public void bite(){
		System.out.println("bite");
	}
}