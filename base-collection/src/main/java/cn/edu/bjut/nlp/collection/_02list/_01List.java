package cn.edu.bjut.nlp.collection._02list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 集合的体系：

 ----------| Collection 单列集合 的根接口
 --------------|  List  如果是实现了List接口的集合类，该集合类具备的特点：有序，可重复。
 --------------|  Set   如果是实现了Set接口的集合类，该集合类具备的特点： 无序，不可重复。

 有序： 集合的有序不是指自然顺序，而是指添加进去的顺序与元素出来的顺序是一致的。

 List接口中特有方法：

 添加
 add(int index, E element) 
 addAll(int index, Collection<? extends E> c) 
 获取：
 get(int index) 
 indexOf(Object o) 
 lastIndexOf(Object o) 
 subList(int fromIndex, int toIndex) 
 修改：
 set(int index, E element) 

 迭代
 listIterator() 
 List接口中特有的方法具备的特点： 操作的方法都存在索引值。	
	ListIterator特有的方法：
	
	添加：
		hasPrevious()  判断是否存在上一个元素。
		previous()    当前指针先向上移动一个单位，然后再取出当前指针指向的元素。
		
		next();  先取出当前指针指向的元素，然后指针向下移动一个单位。
		
	
		add(E e)   把当前有元素插入到当前指针指向的位置上。
		set(E e)   替换迭代器最后一次返回的元素。
		
		
 只有List接口下面的集合类才具备索引值。其他接口下面的集合类都没有索引值。

 ctrl + shift + /  添加多行注释

 ctrl  + shift + \  取消多行注释.

 */
public class _01List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		// 添加方法
		list.add("c");// 把元素添加到集合的末尾处。
		list.add(1, "d"); // 把元素添加到集合中的指定索引值位置上。
		List list2 = new ArrayList();
		list2.add("e");
		list.add(list2);
		System.out.println(list);
		
		// 获取的方法
		System.out.println(list.get(0));
		
		// 使用get方法遍历集合的元素：
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		
		System.out.println(list.indexOf("b"));
		System.out.println(list.lastIndexOf("b"));
		
		List list3 = new ArrayList<>();
		//指定开始与结束的索引值截取集合中的元素。
		list3 = list.subList(0, 2);
		// 使用指定的元素替换指定索引值位置的元素。
		list.set(3, "赵本山"); 
		System.out.println(list3);
		
		ListIterator it = list.listIterator();
		System.out.println("有上一个元素吗？"+ it.hasPrevious());
		it.next();
		System.out.println(it.previous());
		
		while(it.hasNext()){
			it.next();
		}
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
		
		it.next();//一开始光标的初始位置为第一个元素
		it.next();
		it.add("张三");//将数据插入到光标所在位置
		
		it.next();
		//替换迭代器最后一次返回的元素。
		it.set("fdsfas");//必须先next或preview下
		System.out.println(list);
	}

}
