package cn.edu.bjut.nlp.basic._1basic;
import java.util.Random;
import java.util.Scanner;

/*
循环语句----while循环语句

while循环 语句的格式:

	while(循环的条件){
		循环语句；
	}

while循环语句要注意的事项：
	1. while循环语句一般是通过一个变量控制其循环的次数。
	2. while循环语句的循环体代码如果只有一个语句的时候，那么可以省略大括号。但是也是不建议大家省略。
	3. while循环语句的判断条件后面不能跟有分号，否则会影响到执行的效果。



需求： 在控制上打印五句hello world.

 */
public class _0504_Statement_While {
	public static void main(String[] args) {
		int count = 0;
		while (count < 5) {
			System.out.println("Hello World!");
			count++;
		}
		System.out.println(new _0504_Statement_While().countSum());
		System.out.println(new _0504_Statement_While().count7Sum());
		new _0504_Statement_While().guessNumber();
	}

	public int countSum() {
		int sum = 0;
		int count = 0;
		while (count <= 100) {
			sum += count;
			count++;
		}
		return sum;
	}
	
	public int count7Sum() {
		int sum = 0;
		int count = 0;
		while (count <= 100) {
			if (count%7 == 0) {
				sum += count;
			}
			count++;
		}
		return sum;
	}
	
	public void guessNumber() {
		Random random = new Random();
		int key = random.nextInt(10);
			System.out.println(key);
		System.out.println("please input the number: ");
	
		Scanner scanner = new Scanner(System.in);
		
		boolean flag = true;
		int count = 0;
		int top = 3;
	while(flag && count<=top){
			int temp = scanner.nextInt();
			if (temp < key) {
				System.out.println("xiao");
				count ++;
				if (count == 2) {
					System.out.println("the last time;");
				}
				System.out.println("please input the number again: ");
			}else if(temp >key){
				System.out.println("big");
				count ++;
				if (count == 2) {
					System.out.println("the last time;");
				}
				System.out.println("please input the number again: ");
			}else {
				System.out.println("congratulations!");
				flag = false;
			}
		}
		
		
	}
}
