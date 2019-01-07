package cn.edu.bjut.nlp.collection._02list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
练习： 使用三种方式遍历集合的元素. 	
第一种： 使用get方法遍历。
第二种： 使用迭代器正序遍历。
第三种： 使用迭代器逆序遍历。

*/
public class _01ListTest {

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
		System.out.println(list);

		System.out.println("======get方法遍历=======");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("\r\n======使用迭代器正序遍历==========");
		ListIterator it = list.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("\r\n======使用迭代器逆序遍历==========");
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
	}

}
