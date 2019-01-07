package cn.edu.bjut.nlp.strings.string;
/*
String 字符串类:
 
笔试题目：new String("abc")创建了几个对象？
 两个对象， 一个对象是 位于字符串常量池中，一个对象是位于堆内存中。

 
*/
public class _01StringDefinition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
	
		System.out.println("str1==str2?"+(str1==str2));  // true  
		//String str = "hello"这种方式创建字符串的时候，jvm首先会检查字符串常量池是否存在该字符串的对象，
		//如果已经存在，那么就不会在字符串常量池中在创建了，直接返回该字符串在字符串常量池中内存地址，
		//如果该字符串还不存在字符串常量池中，那么就会在字符串长连发个池中先创建该字符串对象
		
		System.out.println("str2==str3?"+(str2==str3));  //false
		System.out.println("str3==str4?"+(str3==str4));  // false
		//new String（“hello”） 这种方式创建字符串对象的时候，jvm首先会检查字符串常量池中是否存在hello的字符串
		//如果已经存在，就不会再常量池中创建了。如果还没有存在，就会在字符串常量池中创建，然后还会去堆内存中在创建一份字符串的对象，
		//吧字符串常量池中的hello字符串拷贝到内存中的字符串对象，然后返回堆内存中字符串对象的内存地址。
		
		System.out.println("str3.equals(str2)?"+(str3.equals(str4))); //true
		//是String类重写了Object的equals方法，比较的是两个字符串对象 的内容 是否一致。
		// "=="用于比较 引用数据类型数据的时候比较的是两个对象 的内存地址，equals方法默认情况下比较也是两个对象 的内存地址。
		
		test(null);
	}
	
	public static void test(String str){
		//将常量写在前面，保证非空
		if("中国".equals(str))
		{
			System.out.println("回答正确");
		}else{
			System.out.println("回答错误");
		}
		

	}
}
