package cn.edu.bjut.nlp.basic._2object;

public class _0808_Object_ThisTest {
	public static void main(String[] args){
		Person2 p1 = new Person2(110,"狗娃",17);
		Person2 p2 = new Person2(119,"铁蛋",9);
		p1.compareAge(p2);
	}
}
class Person2{
	int id;
	String name;
	int age;
	
	public  Person2(int id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void compareAge(Person2 person){
		if (this.age > person.age) {
			System.out.println(this.name + " bigger");
		}else if (this.age < person.age) {
			System.out.println(person.name +"bigger");
		}else {
			System.out.println("they are the same");
		}
	}
}