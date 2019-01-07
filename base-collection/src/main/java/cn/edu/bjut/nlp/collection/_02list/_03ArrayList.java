package cn.edu.bjut.nlp.collection._02list;

import java.util.ArrayList;
import java.util.ListIterator;

/*

集合的体系：
----------| Collection  单列集合的根接口
----------------| List 如果实现了List接口的集合类，具备的特点： 有序，可重复。
--------------------| ArrayList   ArrayList 底层是维护了一个Object数组实现 的， 特点: 查询速度快，增删慢。
什么时候使用ArrayList: 如果目前的数据是查询比较多，增删比较少的时候，那么就使用ArrayList存储这批数据。  比如 ：高校的 图书馆


--------------------| LinkedList
--------------------| Vector(了解即可)

----------------| Set  如果实现了Set接口的集合类， 具备的特点： 无序，不可重复。

ArrayList 特有的方法：

	ensureCapacity(int minCapaci上ty)
	trimToSize()  

笔试题目： 使用ArrayList无参的构造函数创建一个 对象时， 默认的容量是多少? 如果长度不够使用时又自增增长多少？
	ArrayList底层是维护了一个Object数组实现 的，使用无参构造函数时，Object数组默认的容量是10，当长度不够时，自动增长0.5倍。

 */

//需求： 编写一个函数清除集合中重复元素。 如果书号是一样就视为重复元素。  要求： 遍历集合元素的时候必须使用迭代器。  get 迭代器
class Book{
	int id;
	String name;
	public Book (int id,String name){
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" " + this.name;
	}
	@Override
	public boolean equals(Object obj) {
		Book book = (Book)obj;
		
		return this.id==book.id;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
}
public class _03ArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrayList= new ArrayList();
		arrayList.add(new Book(110,"java编程思想"));
		arrayList.add(new Book(220,"java核心技术"));
		arrayList.add(new Book(330,"深入javaweb"));
		arrayList.add(new Book(110,"javas神书"));
		ListIterator iterator= arrayList.listIterator();
		ArrayList newArr = new ArrayList();
		Book book;
		while(iterator.hasNext()){
			book =(Book) iterator.next();
			if (!newArr.contains(book)) {
				newArr.add(book);
			}
		}
		System.out.println(newArr);
	}

}
