package cn.edu.bjut.nlp.basic._1basic;
/*
控制流程语句----do while循环语句

格式：
	do{
	
	}while(判断条件);

需求： 在控制上打印五句hello world.


while循环语句与do-while循环语句的区别：
	while循环语句是先判断后执行循环语句的，do-while循环语句
	是先执行，后判断。不管条件是否满足至少会执行一次。

 */
public class _0505_Statement_DoWhile {
	public static void main(String[] args) {
		/*
		  int count =0; while(count<5){ System.out.println("Hello World!");
		  count++; }
		  
		  在java中，java编译器是不允许写废话。
		  
		  boolean flag = false; while(flag){
		  System.out.println("Hello World!"); }
		  
		  
		  boolean flag = false; do{ System.out.println("Hello World!");
		  }while(flag);
	 */

		int count = 0;
		do {
			System.out.println("hello world");
			count++;
		} while (count < 5);
		System.out.println(new _0505_Statement_DoWhile().sum());
	}
	
	public int sum(){
		int sum = 0;
		int count = 0;
		do{
			if (count % 2 == 0 ) {
				sum += count;
			}
			count ++;
		}while(count <=100);
		return sum;
	}
}
