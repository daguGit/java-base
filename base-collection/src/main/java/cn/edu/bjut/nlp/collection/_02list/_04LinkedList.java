package cn.edu.bjut.nlp.collection._02list;

import java.util.Iterator;
import java.util.LinkedList;

/*

集合的体系：
----------| Collection  单列集合的根接口
----------------| List 如果实现了List接口的集合类，具备的特点： 有序，可重复。
--------------------| ArrayList   ArrayList 底层是维护了一个Object数组实现 的， 特点: 查询速度快，增删慢。
什么时候使用ArrayList: 如果目前的数据是查询比较多，增删比较少的时候，那么就使用ArrayList存储这批数据。  比如 ：高校的 图书馆

--------------------| LinkedList   LinkedList底层是使用了链表数据结构实现的，  特点： 查询速度慢，增删快。

--------------------| Vector(了解即可)

----------------| Set  如果实现了Set接口的集合类， 具备的特点： 无序，不可重复。

笔试题: 说出ArrayLsit与Vector的区别?
	相同点： ArrayList与Vector底层都是使用了Object数组实现的。
	
	不同点： 
		1. ArrayList是线程不同步的，操作效率高。 
		   Vector是线程同步的，操作效率低。
		2. ArrayList是JDK1.2出现，Vector是jdk1.0的时候出现的。

Linkedlist特有的方法：
	1：方法介绍
	            addFirst(E e) 
				addLast(E e) 
		
				getFirst() 
				getLast() 
				
				removeFirst() 
				removeLast() 
	
	2：数据结构
				1：栈 （1.6）  : 主要是用于实现堆栈数据结构的存储方式。
					先进后出
					push() 
					pop()
				2：队列（双端队列1.5）： 主要是为了让你们可以使用LinkedList模拟队列数据结构的存储方式。
					先进先出
					offer()添加到队wei
					poll()删除队首
					
	3：返回逆序的迭代器对象      
			descendingIterator()   返回逆序的迭代器对象
*/

public class _04LinkedList {
	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
/*
		list.addFirst("狗娃"); //把元素添加到集合的首位置上。
		list.addLast("狗剩");  //把元素添加到集合的末尾处。
		

		System.out.println("获取集合中首位置的元素:"+list.getFirst());
		System.out.println("获取集合中末尾的元素："+ list.getLast());
	
		System.out.println("删除集合中的首位置元素并返回："+ list.removeFirst());
		System.out.println("删除集合中的末尾素并返回："+ list.removeLast());
			
		
		list.push("狗娃");   //将该元素插入此集合的开头处。 
		System.out.println("删除集合的首元素："+list.pop()); // 移除并返回集合中的第一个元素 

		
		list.offer("狗剩");
		System.out.println("删除集合的首元素: "+list.poll());
	
		System.out.println("集合中的元素："+ list);
*/
		Iterator it = list.descendingIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
