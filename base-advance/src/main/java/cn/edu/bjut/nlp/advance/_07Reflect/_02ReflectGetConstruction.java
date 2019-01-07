package cn.edu.bjut.nlp.advance._07Reflect;

import java.lang.reflect.Constructor;

/*
 如何通过Class对象获取构造方法。
 */
public class _02ReflectGetConstruction {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("_07Reflect.Person");
		
		//通过Class对象获取对应的构造方法
		Constructor[] constructors = clazz.getConstructors();// getConstructors()获取一个类的所有公共的构造方法
		for(Constructor constructor :constructors){
			System.out.println(constructor);
		}
		
		System.out.println();
		Constructor[] constructors2 = clazz.getDeclaredConstructors();//获取到一个类的所有构造方法，包括私有的在内 
		for(Constructor constructor:constructors2){
			System.out.println(constructor);
		}
		
		System.out.println();
		Constructor constructor = clazz.getConstructor(int.class,String.class);// getConstructor 获取单个指定的构造方法。
		Person p = (Person)constructor.newInstance(1,"simon");// newInstance()创建一个对象
		System.out.println(p);
		
		//获取私有的构造函数
		Constructor constructor2 = clazz.getConstructor(null);
		//暴力反射
		constructor2.setAccessible(true);
		Person person1 = (Person) constructor2.newInstance(null);
		System.out.println(person1);
	}

}
