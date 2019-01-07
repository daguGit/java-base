package cn.edu.bjut.nlp.basic._2object;
/*
static(静态)

需求：描述一下传智学生类。  都是中国人....


目前存在的问题： 所有的学生都是中国 的，有n个学生就会有n份中国的 数据存内存中，这样子
会浪费内存。

目前方案： 把“中国”这个数据移动 到数据共享区中，共享这个数据给所有的Student对象使用即可。

问题2： 如何才能把这个数据移动 到数据共享区中共享呢？

解决方案： 只需要使用static修饰该数据即可。


静态的成员变量只会在数据共享区中维护一份，而非静态成员变量的数据会在每个对象中都维护一份的。。

*/
/*
static(静态\修饰符)

	1. static修饰成员变量 ：如果有数据需要被共享给所有对象使用时，那么就可以使用static修饰。
		
		静态成员变量的访问方式：
				
				方式1： 可以使用对象进行访问。
					格式： 对象.变量名。
				
				方式二： 可以使用类名进行访问。
					格式： 类名.变量名;
	
			注意： 
				1. 非静态的成员变量只能使用对象进行访问，不能使用类名进行访问。
				2. 千万不要为了方便访问数据而使用static修饰成员变量，只有成员变量的数据是真正需要被共享的时候
				才使用static修饰。
			
		static修饰成员变量的应用场景： 如果一个数据需要被所有对象共享使用的时候，这时候即可好实用static修饰。


	2. static修饰成员函数:

*/
public class _0809_Object_Static {
	public static void main(String[] args) 
	{
		Student3 s1 = new Student3("张三");
		Student3 s2 = new Student3("陈七");

		s1.country = "小日本";
		System.out.println("姓名："+s1.name+" 国籍："+ s1.country); //  中国   
		System.out.println("姓名："+s2.name+" 国籍："+ s2.country); // 小日本
		
		//访问静态成员变量用类名或对象名都可以
		System.out.println(Student3.country); // 小日本
	}
}
class Student3{
	String name;
	//使用了static修饰country，那么这时候country就是一个共享的数据。
	static String country = "CN";
	public Student3(String name){
		this.name = name;
	}
			
	
}