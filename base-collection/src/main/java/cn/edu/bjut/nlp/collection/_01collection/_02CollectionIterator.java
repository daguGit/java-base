package cn.edu.bjut.nlp.collection._01collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
------| Collection 单例集合的根接口
----------| List  如果是实现了 List接口的集合类，该集合类具备 的特点： 有序、可重复。
----------| Set   如果是实现了Set接口的集合类，该集合具备的特点： 无序，不可 重复。
 
Collection---迭代的方法：
	toArray() 
	iterator()		
迭代器的作用：就是用于抓取集合中的元素。
迭代器的方法：
	hasNext()   问是否有元素可遍历。如果有元素可以遍历，返回true，否则返回false 。        	
 	next()    获取元素...   	  
 	remove()  移除迭代器最后一次返回 的元素。
NoSuchElementException 没有元素的异常。 
出现的原因： 没有元素可以被迭代了。。。	
 */
public class _02CollectionIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("狗娃");
		c.add("狗剩");
		c.add("铁蛋");
		c.add("美美");
	
		/*//遍历集合的元素------>方式一： 可以使用toArray方法。
		Object[] object = c.toArray();
		System.out.println(Arrays.toString(object));*/
		
		//要求使用iterator迭代器遍历。
		Iterator it = c.iterator();
		//疑问：iterator()方法返回的是一个接口类型，为什么接口又可以调用方法可以使用呢？  iterator 实际 上返回的是iterator接口的实现类对象。
		
		
	
		it.next();
		it.remove();  //删除迭代器最后一次返回的元素。必须之前先有一次迭代
		
		while(it.hasNext()){
			System.out.println(it.next());	
		}
		//清空集合 的元素
				while(it.hasNext()){
					it.next();
					it.remove();
				}
	}

}
