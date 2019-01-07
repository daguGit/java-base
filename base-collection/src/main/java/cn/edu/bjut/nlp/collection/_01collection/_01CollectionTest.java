package cn.edu.bjut.nlp.collection._01collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

class Person1 {
	int id;
	String pw;

	public Person1(int id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	@Override
	public String toString() {
		return this.id + "  " + this.pw;
	}

	@Override
	public boolean equals(Object obj) {
		Person1 person = (Person1) obj;
		return this.id == person.id;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}
}

class Login {
	Collection collection = new ArrayList();
	Scanner scanner = new Scanner(System.in);

	public void choose() {
		while (true) {
			System.out.println("------------A(resign)");
			System.out.println("------------B(login)");

			char c = scanner.next().toUpperCase().toCharArray()[0];
			switch (c) {
			case 'A':
				resign();
				break;
			case 'B':
				Login();
				break;
			default:
				System.out.println("sorry");
				break;
			}

		}

	}

	public void Login() {
		int id;
		String pw;
		Person1 person1;
		Person1 temp;
		System.out.println("ID: ");
		id = scanner.nextInt();
		System.out.println("PW: ");
		pw = scanner.next();
		person1 = new Person1(id, pw);

		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			temp = (Person1) iterator.next();
			if (temp.id == person1.id && temp.pw.equals(person1.pw) ) {
				System.out.println("congratulations");
				return;
			}
		}
		System.out.println("sorry");
	}

	public void resign() {
		int id;
		String pw;
		Person1 person1;
		System.out.println("ID: ");
		id = scanner.nextInt();
		System.out.println("PW: ");
		pw = scanner.next();
		person1 = new Person1(id, pw);
		while (collection.contains(person1)) {
			System.out.println("again:");
			System.out.println("ID: ");
			id = scanner.nextInt();
			System.out.println("PW: ");
			pw = scanner.next();

		}
		person1 = new Person1(id, pw);
		collection.add(person1);
		System.out.println("resign success");
		print();
	}

	public void print() {
		Object[] arr = collection.toArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println((Person1) arr[i]);
		}

	}

}

public class _01CollectionTest {

	public static void main(String[] args) {
		Login login = new Login();
		login.choose();
	}

}
