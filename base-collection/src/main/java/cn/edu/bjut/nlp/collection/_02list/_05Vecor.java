package cn.edu.bjut.nlp.collection._02list;

import java.util.Enumeration;
import java.util.Vector;

/*
集合 的体系：
------------| Collection 单例集合的根接口
----------------| List  如果是实现了List接口的集合类，具备的特点： 有序，可重复。 
-------------------| ArrayList  ArrayList 底层是维护了一个Object数组实现的。 特点： 查询速度快，增删慢。
-------------------| LinkedList LinkedList 底层是使用了链表数据结构实现的， 特点： 查询速度慢，增删快。
-------------------| Vector(了解即可)  底层也是维护了一个Object的数组实现的，实现与ArrayList是一样的，但是Vector是线程安全的，操作效率低。

----------------| Set  如果是实现了Set接口的集合类，具备的特点： 无序，不可重复。

笔试题: 说出ArrayLsit与Vector的区别?
	相同点： ArrayList与Vector底层都是使用了Object数组实现的。
	
	不同点： 
		1. ArrayList是线程不同步的，操作效率高。 
		   Vector是线程同步的，操作效率低。
		2. ArrayList是JDK1.2出现，Vector是jdk1.0的时候出现的。
*/
public class _05Vecor {

	public static void main(String[] args) {
		Vector v  =  new Vector();
		//添加元素
		v.addElement("张三");
		v.addElement("李四");
		v.addElement("王五");
		//迭代该集合
		Enumeration e = v.elements(); //获取迭代器
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
	}

}
