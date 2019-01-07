package cn.edu.bjut.nlp.advance._03Clone;

/*
 对象的克隆

 对象的浅克隆:

 对象浅克隆要注意的细节： 
 1. 如果一个对象需要调用clone的方法克隆，那么该对象所属的类必须要实现Cloneable接口。
 2. Cloneable接口只不过是一个标识接口而已，没有任何方法。
 3. 对象的浅克隆就是克隆一个对象的时候，如果被克隆的对象中维护了另外一个类的对象，这时候只是克隆另外一个对象的地址，而没有把
 		另外一个对象也克隆一份。
 4. 对象的浅克隆也不会调用到构造方法的。

 对象的深克隆：

 */
class Address {

	String city;

	public Address(String city) {
		this.city = city;
	}

}
//如果一个对象需要调用clone的方法克隆，那么该对象所属的类必须要实现Cloneable接口。
class Person implements Cloneable {

	int id;

	String name;

	Address address;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public Person(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println("=======构造方法调用了===");
	}

	@Override
	public String toString() {
		return "编号：" + this.id + " 姓名：" + this.name + " 地址：" + address.city;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class _01CloneShallow {

	public static void main(String[] args) throws Exception {
		Address address  = new Address("Bj");
		Person person = new Person(1, "Simon",address);
		Person person2 = (Person)person.clone();//clone() 克隆了一个对象。
		
		//对象的浅克隆就是克隆一个对象的时候，如果被克隆的对象中维护了另外一个类的对象，这时候只是克隆另外一个对象的地址，而没有把 另外一个对象也克隆一份。
		// 对象的浅克隆也不会调用到构造方法的。
		person2.id = 2;
		person2.name = "amonda";
		person2.address.city="TJ";
		System.out.println("person :"+person);//person :编号：1 姓名：Simon 地址：TJ
		System.out.println("person2 :"+person2);//	person2 :编号：2 姓名：amonda 地址：TJ


		
		
	}

}
