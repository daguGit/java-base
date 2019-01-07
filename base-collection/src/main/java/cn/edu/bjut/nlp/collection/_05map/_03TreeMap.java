package cn.edu.bjut.nlp.collection._05map;

import java.util.Comparator;
import java.util.TreeMap;
/*
双列集合：
-------------| Map  如果是实现了Map接口的集合类，具备的特点： 存储的数据都是以键值对的形式存在的，键不可重复，值可以重复。
----------------| HashMap  底层也是基于哈希表实现 的。
HashMap的存储原理：
	往HashMap添加元素的时候，首先会调用键的hashCode方法得到元素 的哈希码值，然后经过运算就可以算出该
	元素在哈希表中的存储位置。 
	情况1： 如果算出的位置目前没有任何元素存储，那么该元素可以直接添加到哈希表中。
	
	情况2：如果算出 的位置目前已经存在其他的元素，那么还会调用该元素的equals方法与这个位置上的元素进行比较
	，如果equals方法返回 的是false，那么该元素允许被存储，如果equals方法返回的是true，那么该元素被视为
	重复元素，不允存储。

----------------| TreeMap   TreeMap也是基于红黑树（二叉树）数据结构实现 的， 特点：会对元素的键进行排序存储。

TreeMap 要注意的事项：
	1.  往TreeMap添加元素的时候，如果元素的键具备自然顺序，那么就会按照键的自然顺序特性进行排序存储。
	2.  往TreeMap添加元素的时候，如果元素的键不具备自然顺序特性， 那么键所属的类必须要实现Comparable接口，把键
	的比较规则定义在CompareTo方法上。
	
	3. 往TreeMap添加元素的时候，如果元素的键不具备自然顺序特性，而且键所属的类也没有实现Comparable接口，那么就必须
	在创建TreeMap对象的时候传入比较器。
	

----------------| Hashtable(了解) 底层也是依赖了哈希表来实现的，实现方式和hashmap是一致，但是HashTable是线程安全的，操作效率低。 
*/
class Emp {//implements Comparable<Emp>{
	
	String name;
	int salary;
	public Emp(String name, int salary) {
		this.name = name;
		this.salary = salary ;
	}
	@Override
	public String toString() {
		return "[姓名："+this.name+" 薪水："+ this.salary+"]";
	}
	/*@Override
	public int compareTo(Emp o) {
		return this.salary - o.salary;
	}*/
}
class MyComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		
		return o1.salary - o2.salary;
	}
	
}
public class _03TreeMap {

	public static void main(String[] args) {
		/*TreeMap<String, Integer> map = new TreeMap<String,Integer>();
		map.put("a",1);
		map.put("b",2);
		map.put("c",3);
		map.put("d",4);
		System.out.println(map);*/
		//创建一个自定义比较器
		MyComparator comparator = new MyComparator();
		TreeMap<Emp, String> map = new TreeMap<Emp,String>(comparator);
		map.put(new Emp("a",100), "001");
		map.put(new Emp("b",200), "002");
		map.put(new Emp("c",500), "002");
		map.put(new Emp("d",50), "004");
		System.out.println(map);
	}

}
