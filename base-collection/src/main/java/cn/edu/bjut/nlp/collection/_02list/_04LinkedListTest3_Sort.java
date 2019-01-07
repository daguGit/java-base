package cn.edu.bjut.nlp.collection._02list;

import java.util.LinkedList;

//编写一个函数根据人的年龄及逆行排序存储。
class Person {

	String name;

	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "{ 名字：" + this.name + " 年龄：" + this.age + "}";
	}

}

public class _04LinkedListTest3_Sort {

	public static void sort(LinkedList list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size() ; j++) {
				Person p1 = (Person) list.get(i);
				Person p2 = (Person) list.get(j);
				if (p1.age > p2.age) {
					list.set(i, p2);
					list.set(j, p1);
				}
			}
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Person("狗娃", 7));
		list.add(new Person("狗剩", 17));
		list.add(new Person("铁蛋", 3));
		list.add(new Person("美美", 30));

		// 编写一个函数根据人的年龄排序存储。
		sort(list);
		System.out.println(list);

	}

}
