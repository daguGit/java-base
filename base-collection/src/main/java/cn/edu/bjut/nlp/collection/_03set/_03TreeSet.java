package cn.edu.bjut.nlp.collection._03set;

import java.util.Comparator;
import java.util.TreeSet;

/*
集合 的体系：
------------| Collection 单例集合的根接口
----------------| List  如果是实现了List接口的集合类，具备的特点： 有序，可重复。 
-------------------| ArrayList  ArrayList 底层是维护了一个Object数组实现的。 特点： 查询速度快，增删慢。
-------------------| LinkedList LinkedList 底层是使用了链表数据结构实现的， 特点： 查询速度慢，增删快。
-------------------| Vector(了解即可)  底层也是维护了一个Object的数组实现的，实现与ArrayList是一样的，但是Vector是线程安全的，操作效率低。

----------------| Set  如果是实现了Set接口的集合类，具备的特点： 无序，不可重复。
-------------------| HashSet  底层是使用了哈希表来支持的，特点： 存取速度快. 
-------------------| TreeSet   如果元素具备自然顺序 的特性，那么就按照元素自然顺序的特性进行排序存储。
							   存储原理：底层使用二叉树数据结构实现，来进行比较，左小右大。当三次没有形成二叉树，则将位置进行调整。
		treeSet添加自定义元素:

		treeSet要注意的事项：
			1. 往TreeSet添加元素的时候，如果元素本身具备了自然顺序的特性，那么就按照元素自然顺序的特性进行排序存储。
			2. 往TreeSet添加元素的时候，如果元素本身不具备自然顺序的特性，那么该元素所属的类必须要实现Comparable接口，把元素
			的比较规则定义在compareTo(T o)方法上。 
			3. 如果比较元素的时候，compareTo方法返回 的是0，那么该元素就被视为重复元素，不允许添加.(注意：TreeSet与HashCode、equals方法是没有任何关系。)
			4. 往TreeSet添加元素的时候, 如果元素本身没有具备自然顺序 的特性，而元素所属的类也没有实现Comparable接口，那么必须要在创建TreeSet的时候传入一个
			比较器。
			5.  往TreeSet添加元素的时候，如果元素本身不具备自然顺序的特性，而元素所属的类已经实现了Comparable接口， 在创建TreeSet对象的时候也传入了比较器
			那么是以比较器的比较规则优先使用。
			
			如何自定义定义比较器： 自定义一个类实现Comparator接口即可，把元素与元素之间的比较规则定义在compare方法内即可。
				自定义比较器的格式 ：
					class  类名  implements Comparator{
					}
			
			推荐使用：使用比较器(Comparator)。 
*/

//所属的类实现了comparable接口
//class Emp implements Comparable{

//所属的类没有实现comparable接口 ，需要自定义一个比较器实现comparator接口
class Emp {
	int id;
	String name;
	int salary;
	public Emp(int id, String name,int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "{ 编号："+  this.id+" 姓名："+ this.name+" 薪水："+ this.salary+"}";
	}
	
	/*@Override
	public int compareTo(Object o) {
		Emp emp =(Emp)o;
		return this.salary - emp.salary;
		
	}*/
}
class MyComparator implements Comparator<Emp>{

	
	/*@Override
	public int compare(Object o1, Object o2) {
		Emp emp1 = (Emp) o1;
		Emp emp2 = (Emp) o2;
		return emp1.salary - emp2.salary;
	}*/

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.id - o2.id;
	}
	
}
public class _03TreeSet {

	
	public static void main(String[] args) {
		
		//元素本身具备自然属性
		/*TreeSet tree0 = new TreeSet();
			tree0.add(1);
			tree0.add(10);
			tree0.add(7);
			tree0.add(19);
			tree0.add(9);
					
			System.out.println(tree0);
			*/
		
		//元素本身不具备自然属性类实现了comparable接口
		//TreeSet tree = new TreeSet();
		
		//元素本身不具备自然属性类没有实现了comparable接口，自定义一个比较器
		TreeSet tree = new TreeSet(new MyComparator());
		
		tree.add(new Emp(110, "老陆", 100));
		tree.add(new Emp(113, "老钟", 200));
		tree.add(new Emp(220, "老汤", 300));
		tree.add(new Emp(120, "老蔡", 500));
		System.out.println("集合的元素："+tree);
		
	}

}

