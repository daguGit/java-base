package cn.edu.bjut.nlp.collection._01collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 集合：集合是存储对象数据的集合容器。

 集合比数组的优势：
 1. 集合可以存储任意类型的对象数据，数组只能存储同一种数据类型 的数据。
 2. 集合的长度是会发生变化的，数组的长度是固定的。

 -------| Collection  单例集合的跟接口。 
 ----------| List  如果是实现了List接口的集合类，具备的特点： 有序，可重复。
 ----------| Set   如果是实现了Set接口的集合类，具备特点： 无序，不可重复。

 Collection接口中的方法：	
 增加
 add(E e)  添加成功返回true，添加 失败返回false.
 addAll(Collection c)  把一个集合 的元素添加到另外一个集合中去。	
 删除
 clear() 
 remove(Object o) 

 removeAll(Collection  c) //删除与c相同的元素
 retainAll(Collection  c) //保留与c相同元素，其他删除
 查看
 size() 
 判断
 isEmpty() 
 contains(Object o) 
 containsAll(Collection<?> c) 
 迭代
 toArray() 
 iterator() 
 */
class Person {

	int id;

	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "{编号：" + this.id + " 姓名：" + this.name + "}";
	}
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		return this.id == p.id ;
	}
	//java规范： 一般重写equlas方法我们都会重写hashCode方法的。
	@Override
	public int hashCode() {
		return this.id;
	}
}

public class _01Collection {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("令计划");
		c.add("徐才厚");
		c.add("周永康");
		System.out.println("添加成功吗？"+c.add("郭美美"));
		
		
		//创建集合
		Collection c2 = new ArrayList();
		c2.add("徐才厚");
		c2.add("郭美美");
		c2.add("狗娃");
	
		//c.addAll(c2); // 把c2的元素的添加到c集合 中去。
				
		/*
		 删除方法:
		c.clear(); //clear()清空集合中的元素
		System.out.println("删除成功吗？"+c.remove("美美"));  // remove 指定集合中的元素删除，删除成功返回true，删除失败返回false.
		
		c.removeAll(c2); //删除c集合中与c2的交集元素。
		
		c.retainAll(c2); //保留c集合与c2的交集元素，其他的元素一并删除。
		
		System.out.println("查看元素个数："+c.size());
		
		System.out.println("集合的元素："+ c);
		
		
		//判断
		System.out.println("判断集合是否为空元素："+ c.isEmpty());
		System.out.println("判断集合中是否存在指定的元素："+ c.contains("薄熙来"));
		//集合添加自定义的元素
		Collection c3 = new ArrayList();
		c3.add(new Person(110,"狗娃"));
		c3.add(new Person(119,"狗剩"));
		c3.add(new Person(120,"铁蛋"));
		//如果在现实生活中，只要身份证编号一致，那么就为同一个人。
		System.out.println("存在该元素吗？"+c3.contains(new Person(120,"陈铁蛋"))); // 其实contains方法内部是依赖于equals方法进行比较的。		
		
		Collection c4 = new ArrayList();
		c4.add(new Person(110,"狗娃"));
		c4.add(new Person(119,"狗剩"));
		c4.add(new Person(120,"陈狗剩"));
				
				
		System.out.println("c集合有包含c2集合中的所有元素吗？"+ c3.containsAll(c4));
	*/
		//迭代
		Object arr[] = c.toArray();
		//System.out.println(Arrays.toString(arr));
		//需求： 把编号是110的人信息 输出。
		for(int i = 0 ; i<arr.length ; i++){
			Person p = (Person) arr[i];  //从Object数组中取出的元素只能使用Object类型声明变量接收，如果需要其他 的类型需要进行强制类型转换。
				if(p.id==110){
						System.out.println(p);
					}
				}
	}
}
