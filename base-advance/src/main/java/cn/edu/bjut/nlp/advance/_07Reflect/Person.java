package cn.edu.bjut.nlp.advance._07Reflect;

public class Person {
	
	private int id;
	
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public Person(){}
	
	
	public void eat(int num){
		System.out.println(name+"吃很"+num+"斤饭");
	}
	
	private static void sleep(int num){
		System.out.println("明天睡上"+num+"小时");
	}
	
	
	public static void  sum(int[] arr){
		System.out.println("长度是："+ arr.length);
	}
	
	
	@Override
	public String toString() {
		return " 编号："+ this.id +" 姓名："+ this.name;
	}
	
}
