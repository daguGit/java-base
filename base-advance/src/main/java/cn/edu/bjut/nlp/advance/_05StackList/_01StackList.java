package cn.edu.bjut.nlp.advance._05StackList;

import java.util.Arrays;
/*
内存泄露

需求：编写一个类使用数组模拟堆栈的存储方式。  

堆栈存储特点： 先进后出，后进先出。

注意： 不再使用的对象，应该不要让变量指向该对象，要让该对象尽快的被垃圾回收期回收。
*/
class StackList {
	Object[] elements;
	int index = 0;//当前的索引值

	public StackList() {
		elements = new Object[3];
	}
	//添加内容
	public void add(Object o) {
		ensureCapcity();//添加元素之前应该要先检查是否容量够用。
		elements[index++]=o;
	}
	//出栈: 删除集合的元素，并且返回。
	/*只这样做，并不会是的当前位置的元素为空，让垃圾收集器收集，终会导致内存溢出
	 * public Object pop() {
		
		return elements[--index];
	}*/
	public Object pop() {
		
		Object object = elements[--index];
		elements[index]=null;//让该位置不再 引用着指定的对象,让垃圾回收期赶快回收该垃圾。
		return object;
	}
	// 检查当前的数组使用够用。
	public void ensureCapcity() {
		if (index == elements.length) {
			elements = Arrays.copyOf(elements, elements.length*2);
		}
	}

	public int size() {
		return index;

	}

}

public class _01StackList {

	public static void main(String[] args) {
		StackList list = new StackList();
		list.add("狗娃");
		list.add("狗剩");
		list.add("铁蛋");
		list.add("美美");
	
		int size = list.size();
		for(int i = 0 ; i<size ; i++){
			System.out.println(list.pop());
		}
		System.out.println(list.elements[2]);
	}

}
