package cn.edu.bjut.nlp.capture;

/*
 jdk1.5新特性之-----枚举
 
 问题：某些方法所接收的数据必须是在固定范围之内的， 
 
解决方案： 这时候我们的解决方案就是自定义一个类,然后是私有化构造函数，在自定义类中创建本类的对象对外使用。

jdk1.5对以上问题提出了新的解决方案： 就是使用枚举类解决。

一些方法在运行时，它需要的数据不能是任意的，而必须是一定范围内的值，Java5以后可以直接使用枚举予以解决。
 	比如： 方向 , 性别 、 季节 、 星期......
 
 */
/*

枚举：一些方法在运行时，它需要的数据不能是任意的，而必须是一定范围内的值，可以直接使用枚举予以解决。

枚举类的定义格式：
	
	enum 类名{
		//枚举值
	}
	
枚举要注意的细节：
	1. 枚举类也是一个特殊的类。
	2. 枚举值默认的修饰符是public static final。
	3. 枚举值是枚举值所属的类的类型， 然后枚举值是指向了本类的对象的。
	4. 枚举类的构造方法默认的修饰符是private的。
	5. 枚举类可以定义自己的成员变量与成员函数。
	6. 枚举类可以自定义构造函数，但是构造函数的修饰符必须是private。
	7. 枚举类可以存在抽象 的方法，但是枚举值必须要实现抽象 的方法。
	8. 枚举值必须要位置枚举类 的第一个语句。
	
	
 */
enum Sex{
	man("man") {
		@Override
		public void run() {
			System.out.println("man run");
		}
	},womam("woman") {
		@Override
		public void run() {
		System.out.println("woman run");
			
		}
	};
  //public static final Sex man = new Sex(); 
	
	//枚举类可以定义自己的成员变量与成员函数
	String value;
	public void getValue(){
		System.out.println(this.value);
	}
	
	//枚举类的构造方法默认的修饰符是private的。
	private Sex(String value){
		this.value = value;
	}
	public abstract void run();
}
public class _05Enum {
	
	public static void main(String[] args) {
		//枚举值是枚举值所属的类的类型， 然后枚举值是指向了本类的对象的。
		Sex sex = Sex.man;
		sex.getValue();
		sex.run();
	}

}
