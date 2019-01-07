package cn.edu.bjut.nlp.collection._02list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
迭代
	listIterator() 
	

ListIterator特有的方法：
	
	添加：
		hasPrevious()  判断是否存在上一个元素。
		previous()    当前指针先向上移动一个单位，然后再取出当前指针指向的元素。
		
		next();  先取出当前指针指向的元素，然后指针向下移动一个单位。
		
---------------------------	
	
		add(E e)   把当前有元素插入到当前指针指向的位置上。
		set(E e)   替换迭代器最后一次返回的元素。
		
	
*/
public class _02ListIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		
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
