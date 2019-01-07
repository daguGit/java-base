package cn.edu.bjut.nlp.basic._2object;

/*
 面向对象的三大特征：
 1. 封装
 2. 继承。
 3. 多态
 多态：一个对象具备多种形态。(父类的引用类型变量指向了子类的对象)
 或者是接口 的引用类型变量指向了接口实现类的对象)
 多态的前提：必须存在继承或者实现 关系。
 动物  a  = new   狗();
 多态要注意 的细节：
 1.  多态情况下，子父类存在同名的成员变量时，访问的是父类的成员变量。
 2.  多态情况下，子父类存在同名的非静态的成员函数时，访问的是子类的成员函数。
 3.  多态情况下，子父类存在同名的静态的成员函数时，访问的是父类的成员函数。

 4.  多态情况下，不能访问子类特有的成员。

 总结：多态情况下，子父类存在同名的成员时，访问的都是父类的成员，除了在同名非静态函数时才是访问子类的。
 编译看左边，运行不一定看右边。
 编译看左边：java编译器在编译的时候，会检查引用类型变量所属的类是否具备指定的成员，如果不具备马上编译报错。

 */

//动物类
abstract class Animal5 {
	String name;
	String color = "动物色";

	public Animal5(String name) {
		this.name = name;
	}

	public abstract void run();

	public  void eat() {
		System.out.println("动物在吃..");
	}
	public  static void eat2() {
		System.out.println("动物在吃..");
	}
}

class Mouse extends Animal5 {
	String color = "黑色";
	public Mouse(String name) {
		super(name);
	}

	public void eat() {
		System.out.println("老鼠在偷吃..");
	}
	public  static void eat2() {
		System.out.println("老鼠在偷吃...");
	}
	// 老鼠特有方法---打洞
	public void dig() {
		System.out.println("老鼠在打洞..");
	}

	public void run() {
		System.out.println(name + "四条腿慢慢的走!");
	}
}

class Fish extends Animal5 {

	public Fish(String name) {
		super(name);
	}

	public void run() {
		System.out.println(name + "摇摇尾巴游..");
	}
}

public class _0822_Object_PolymorphicByExtents {
	public static void main(String[] args){
		Animal5 animal5 = new Mouse("mouse");
		//1.  多态情况下，子父类存在同名的成员变量时，访问的是父类的成员变量。
		System.out.println(animal5.color);
		//2.  多态情况下，子父类存在同名的非静态的成员函数时，访问的是子类的成员函数。
		animal5.eat();
		//3.  多态情况下，子父类存在同名的静态的成员函数时，访问的是父类的成员函数。
		animal5.eat2();
		// 4.  多态情况下，不能访问子类特有的成员。
		//animal5.dig();
		
	}
}
