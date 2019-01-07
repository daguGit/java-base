package cn.edu.bjut.nlp.basic._2object;
/*
需求： 统计一个类被使用了多少次创建对象，该类对外显示被创建的次数。
*/
public class _0809_Object_StaticTest {
	public static void main(String[] args){
		new Emp();
		new Emp();
		new Emp();
		new Emp("nihao").printCount();
	}
	
}
class Emp{
	String name;
	static int count;
	{
		count++;
	}
	public Emp(){
		System.out.println("zhixing  " + count);
	}
	public Emp(String name){
		this();
		this.name = name;
		System.out.println("zhixing  " + count);
	}
	public void printCount(){
		System.out.println(count);
	}
}