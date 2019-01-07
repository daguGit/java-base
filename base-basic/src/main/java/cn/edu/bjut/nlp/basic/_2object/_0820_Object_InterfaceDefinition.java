package cn.edu.bjut.nlp.basic._2object;

/*
接口：
接口：拓展功能的。  usb接口.。。
接口的定义格式：	
	interface 接口名{
	
	}
接口要注意的事项 ：
	1. 接口是一个特殊的类。
	2. 接口的成员变量默认的修饰符为： public static final 。那么也就是说接口中的成员变量都是常量。
	3. 接口中 的方法都是抽象的方法，默认的修饰符为： public abstract。
	4. 接口不能创建wei对象。因为其方法都为抽象的
	5. 接口是没有构造方法的。因为构造方法主要用来被子类使用，初始化成员等，然而接口没有初始化的必要
	6. 接口是给类去实现使用的，非抽象类实现一个接口的时候，必须要把接口中所有方法全部实现。

实现接口的格式：

	class  类名 implements 接口名{
	
	}

*//*
一个类最多只能有一个直接的父类。但是有多个间接的父类。

java是单继承。

*/
public class _0820_Object_InterfaceDefinition implements A {
	@Override
	public void print() {
		System.out.println("this is print fangfa");
		
	}
	public static void main(String[] args){
		new _0820_Object_InterfaceDefinition().print();
	}
}
interface A{
	int a =0;
	public void print();
}