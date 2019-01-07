package cn.edu.bjut.nlp.collection._02list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*

 迭代器在变量元素的时候要注意事项： 在迭代器迭代元素 的过程中，不允许使用集合对象改变集合中的元素 个数，如果需要添加或者删除只能使用迭代器的方法进行操作。

 如果使用过了集合对象改变集合中元素个数那么就会出现ConcurrentModificationException异常。	

 迭代元素 的过程中: 迭代器创建到使用结束的时间。

 */
public class _02ListIteratorNotes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		ListIterator it = list.listIterator();
		/*while(it.hasNext()){
			System.out.println(it.next()+" , ");
			//it.add("aa")
			//list.add("aa");error
		}*/
		
		it.next();list.add("aa");
		System.out.println(list);
	}

}
