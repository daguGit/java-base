package cn.edu.bjut.nlp.collection._02list;

import java.util.LinkedList;

/*
 1：栈 （1.6）  : 主要是用于实现堆栈数据结构的存储方式。
 先进后出
 push() 
 pop()
 2：队列（双端队列1.5）： 主要是为了让你们可以使用LinkedList模拟队列数据结构的存储方式。
 先进先出
 offer()
 poll()

 机试题目： 使用LinkedList实现堆栈数据结构的存储方式与队列的数据结构存储方式。	
 */
class Stack {
	LinkedList linkedList;

	public Stack() {
		linkedList = new LinkedList();
	}

	public void add(Object o) {
		linkedList.push(o);
	}

	public Object remove() {
		Object o = linkedList.pop();
		return o;
	}

	public int size() {
		return linkedList.size();
	}
}

class Sequence {
	LinkedList linkedList;

	public Sequence() {
		linkedList = new LinkedList();
	}

	public void add(Object o) {
		linkedList.offer(o);
	}

	public Object remove() {
		Object o = linkedList.poll();
		return o;
	}

	public int size() {
		return linkedList.size();
	}
}

public class _04LinkedlistTest_StackSequence {

	public static void main(String[] args) {
		//Stack list = new Stack();
		Sequence list = new Sequence();
		list.add("李嘉诚");
		list.add("马云");
		list.add("王健林");

		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(list.remove());
		}

	}

}
