package cn.edu.bjut.nlp.basic._2object;

/*

 匿名内部类：没有类名的类就称作为匿名内部类。

 匿名内部类的好处：简化书写。

 匿名内部类的使用前提：必须存在继承或者实现关系才能使用。

 匿名内部类一般是用于实参。

 */
abstract class Animal7 {

	public abstract void run();

	public abstract void sleep();
}

class Outer2 {

	public void print() {
		// 需求： 在方法内部定义一个类继承Animal类，然后调用run方法与sleep()。

		/*// 局部内部类----一般方法一------
		class Dog extends Animal7 {

			public void run() {
				System.out.println("狗在跑..");
			}

			public void sleep() {
				System.out.println("狗趴在睁开眼睛睡..");
			}
			// 创建对象

		}
		Dog d = new Dog();
		d.run();
		d.sleep();*/
		
		//-----方法二-------//匿名内部类 ：匿名内部类只是没有类名，其他的一概成员都是具备的。
		Animal7 animal7 = new Animal7() {
			
			public void run() {
				System.out.println("狗在跑..");
			}

			public void sleep() {
				System.out.println("狗趴在睁开眼睛睡..");
			}
			//特有的方法
			public void bite(){
				System.out.println("狗在咬人..");
			}
		};
		//}.run();
		//animal7 .bite();访问特有方法时只能用方法一了
		animal7.run();
		animal7.sleep();
	}
}

public class _0827_Object_AnonymousInnerClassByExtents {
	public static void main(String[] args){
		Outer2 outer2 = new Outer2();
		outer2.print();
	}
}