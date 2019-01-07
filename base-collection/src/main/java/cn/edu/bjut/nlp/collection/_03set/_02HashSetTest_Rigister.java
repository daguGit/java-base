package cn.edu.bjut.nlp.collection._03set;

import java.util.HashSet;
import java.util.Scanner;

/*
 需求： 接受键盘录入用户名与密码，如果用户名与密码已经存在集合中，那么就是视为重复元素，不允许添加到HashSet中。

 */
class User {

	String userName;

	String password;

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "{ 用户名："+this.userName+" 密码："+ this.password+"}";
	}

	@Override
	public boolean equals(Object obj) {
		User user = (User)obj;
		return this.userName.equals(user.userName)&&this.password.equals(user.password);
	}
	@Override
	public int hashCode() {
		
		return userName.hashCode()+password.hashCode();
	}
}

public class _02HashSetTest_Rigister {

	public static void main(String[] args) {
		String userName;
		String password;
		User user;
		HashSet hashSet = new HashSet();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("userName: ");
			userName = scanner.next();
			System.out.println("password: ");
			password = scanner.next();
			user = new User(userName, password);
			if (hashSet.add(user)) {
				System.out.println("注册成功...");
				System.out.println("当前的用户有：" + hashSet);
			} else {
				System.out.println("注册失败...");
			}
		}

	}

}
