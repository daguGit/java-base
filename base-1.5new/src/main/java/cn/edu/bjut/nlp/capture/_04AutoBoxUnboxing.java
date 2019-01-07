package cn.edu.bjut.nlp.capture;

import java.util.ArrayList;

/*
 jdk1.5新特性之-----自动装箱与自动拆箱。
 
 java是面向对象 的语言，任何事物都可以使用类进行描述，sun就使用了
 一些类描述java中八种基本数据类型数据
 
 	基本数据类型            包装类型
 	byte     	  Byte
	short      	  Short
	int           Integer
	long          Long 
	
	float          Float
	double         Double 
	
	boolean        Boolean 
	
	char          Character

基本数据类型数据有了对应 的包装 类型的好处：
	
 */
public class _04AutoBoxUnboxing {
	public static void main(String[] args) {
		String string ="12";
		//字符串转换成int类型数据。 可以把字符串转换成对应的数字
		int i = Integer.parseInt(string);
		System.out.println(i);
		//把数字转换成字符串
		System.out.println(Integer.toString(i));
		//把整数转换成对应的进制形式
		System.out.println("10的二进制"+Integer.toBinaryString(10));
		System.out.println("10的十六进制"+Integer.toHexString(10));
		System.out.println("10的ba进制"+Integer.toOctalString(10));
		//可以把字符串当成对应的进行数据帮你转换
		String data ="10";
		int a = Integer.parseInt(data,2);
		System.out.println(a);
		//集合： 集合是可以存储任意对象类型数据的容器。
		ArrayList list = new ArrayList();
		list.add(1);//Integer
		list.add(2);
		list.add(3);
		//自动装箱： 自动把java的基本数据类型数据转换成对象类型数据。
		int temp = 10;  //基本数据类型
		Integer b =temp; //把a存储的值赋予给b变量。
		
		//自动拆箱： 把引用类型的数据转换成基本类型的数据
		Integer c = new Integer(13);
		int d = c; //
		System.out.println(d);
		//引用的数据类型s
		Integer e = 128;
		Integer f = 128; 
		System.out.println("同一个对象吗？"+(e==f)); 
		// Integer类内部维护 了缓冲数组，该缓冲数组存储的-128~127 这些数据在一个数组中。如果你获取的数据是落入到这个范围之内的，那么就直接从该缓冲区中获取对应的数据。
	}

}
