package cn.edu.bjut.nlp.advance._03Clone;

/*
 对象的深克隆： 对象的深克隆就是利用对象的输入输出流把对象先写到文件上，然后再读取对象的
 信息这个过程就称作为对象的深克隆。

 ObjectInputStream
 ObjectOutputStream 

 */

import java.io.*;

class Address1 implements Serializable {

	String city;

	public Address1(String city) {
		this.city = city;
	}

}

class Person1 implements Cloneable, Serializable {

	int id;

	String name;

	Address1 address;

	public Person1(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public Person1(int id, String name, Address1 address) {
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

public class _02CloneDeep {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Address1 address  = new Address1("Bj");
		Person1 person = new Person1(1, "Simon",address);
		writeObj(person);
		Person1 person2 = readObj();//clone() 克隆了一个对象。
		
		person2.id = 2;
		person2.name = "amonda";
		person2.address.city="TJ";
		System.out.println(person);
		System.out.println(person2);
	}

	private static Person1 readObj( ) throws ClassNotFoundException, IOException {
		Person1 person;
		File file = new File("F://person.txt");
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
		person = (Person1)inputStream.readObject();
		return person;
	}

	private static void writeObj(Person1 person) throws FileNotFoundException, IOException {
		File file = new File("F://person.txt");
		ObjectOutputStream objectOutputStream  = new ObjectOutputStream(new FileOutputStream(file));
		objectOutputStream.writeObject(person);
		objectOutputStream.close();
	}

}
