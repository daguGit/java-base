package cn.edu.bjut.nlp.collection._03set;

import java.util.HashSet;

/*
集合 的体系：
------------| Collection 单例集合的根接口
----------------| List  如果是实现了List接口的集合类，具备的特点： 有序，可重复。 
-------------------| ArrayList  ArrayList 底层是维护了一个Object数组实现的。 特点： 查询速度快，增删慢。
-------------------| LinkedList LinkedList 底层是使用了链表数据结构实现的， 特点： 查询速度慢，增删快。
-------------------| Vector(了解即可)  底层也是维护了一个Object的数组实现的，实现与ArrayList是一样的，但是Vector是线程安全的，操作效率低。

----------------| Set  如果是实现了Set接口的集合类，具备的特点： 无序，不可重复。
-------------------| HashSet  底层是使用了哈希表来支持的，特点： 存取速度快. 

hashSet的实现原理：桶式结构
	往Haset添加元素的时候，HashSet会先调用元素的hashCode方法得到元素的哈希值 ，
	然后通过元素 的哈希值经过移位等运算，就可以算出该元素在哈希表中 的存储位置。
	
	情况1： 如果算出元素存储的位置目前没有任何元素存储，那么该元素可以直接存储到该位置上。

	情况2： 如果算出该元素的存储位置目前已经存在有其他的元素了，那么会调用该元素的equals方法与该位置的元素再比较一次
	，如果equals返回的是true，那么该元素与这个位置上的元素就视为重复元素，不允许添加，如果equals方法返回的是false，那么该元素运行 添加。
	
-------------------| TreeSet  如果元素具备自然顺序 的特性，那么就按照元素自然顺序的特性进行排序存储。
*/
class Person{
	int id;
	String name;
	public Person(int id,String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "{ 编号:"+ this.id+" 姓名："+ this.name+"}";
	}
	@Override
	public int hashCode() {
		//System.out.println("=======hashCode=====");
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("======equals======");
		Person p = (Person)obj;
		return this.id==p.id;
	}
	
}
public class _02HashSet {
	
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(new Person(1, "name"));
		set.add(new Person(2, "name1"));
		set.add(new Person(3, "name2"));
		set.add(new Person(1, "name"));//内存地址不同
		
		System.out.println(new Person(1, "name").hashCode());//不重写hashcode的话，也不同
		System.out.println(new Person(1, "name").hashCode());
		System.out.println(set);
		
		
		
		String str1 = "hello";
		String str2 = new String("hello");
		System.out.println("两个是同一个对象吗？"+(str1==str2));//false
		System.out.println("str1的hashCode："+ str1.hashCode());//两个hashcode相同
		System.out.println("str2的hashCode:"+ str2.hashCode());
		/* 
		 * HashCode默认情况下表示的是内存地址，String 类已经重写了Object的hashCode方法了。
		 	
		 	注意： 如果两个字符串的内容一致，那么返回的hashCode 码肯定也会一致的。 
		 	
		 *
		 */
	}

}
