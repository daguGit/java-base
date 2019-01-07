package cn.edu.bjut.nlp.collection._06util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*集合工具类（Collections）
 笔试题：说出Collection与Collections的区别？
 	1.Collection 是一个单例集合的根接口，Collections是操作集合对象的工具类。
 Collections的常见方法：
 	1，对list进行二分查找
 		int binarSearch(list,key);
 		int binarSearch(list,key,Comparator);
 	2，对list集合进行排序
 		sort(list);
 		sort(list,Comparator);
 	3，对集合取最大值和最小值
 		max(Collection);
 		max(Collection,Comparator);
 		mix(Collection);
 		mix(Collection,Comparator);
  	4，对list集合进行反转
  		reverse(list)
 	5，可以将不同步的集合变成同步的集合
		Set synchronizedSet(Set<T> s)
		Map synchronizedMap(Map<K,V> s)
		List synchronizedList(List<T> list)
 */

//person类
class Person3{
	int id;
	String name;
	public Person3(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return  "[编号："+this.id+" 姓名："+ this.name+"]";
	}
}
//自定义比较器
class AgeComparetor implements Comparator<Person3>{

	@Override
	public int compare(Person3 o1, Person3 o2) {
		return o1.id - o2.id;
	}
	
}
public class _01Collections {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(12);
		list.add(2);
		list.add(19);
		
		//排序 
		Collections.sort(list);
		System.out.println(list);
		ArrayList<Person3> list2 = new ArrayList<Person3>();
	
		list2.add(new Person3(1, "a"));
		list2.add(new Person3(2, "b"));
		list2.add(new Person3(3, "d"));
		list2.add(new Person3(3, "c"));
		//传入比较器进行排序
		Collections.sort(list2,new AgeComparetor());
		
		//二分查找
		Collections.binarySearch(list,12);
		//需要传入比较器
		Collections.binarySearch(list2,new Person3(3, "c"),new AgeComparetor());
		
		//获取最大最小值
		System.out.println("MAX"+Collections.max(list));
		System.out.println("MIN"+Collections.min(list));
		System.out.println("MAX"+Collections.max(list2,new AgeComparetor()));
		System.out.println("MIN"+Collections.min(list2,new AgeComparetor()));
		
		//翻转
		Collections.reverse(list);
		Collections.reverse(list2);
		
		//保证线程同步
		ArrayList<Integer> array=(ArrayList<Integer>)Collections.synchronizedList(list);
		
	}

}
