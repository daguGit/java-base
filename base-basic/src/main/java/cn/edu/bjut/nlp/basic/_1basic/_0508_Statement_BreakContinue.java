package cn.edu.bjut.nlp.basic._1basic;
/*
break、 

break适用范围：只能用于switch或者是循环语句中。

break作用：
	1. break用于switch语句的作用是结束一个switch语句。
	2. break用于循环语句中的作用是结束当前所在的循环语句。

笔试题目：break目前位于内层的for循环，如何才能让break作用于外层 的for循环。
	可以标记解决


标记的命名只要符合标识符的命名规则即可。




 */
/*
 continue关键字

 continue的适用范围： continue只能用于循环语句。

 continue的作用：continue的作用是跳过本次的循环体内容。继续下一次。

 continue要注意的事项：
 1. 在一种情况下，continue后面不能跟有其他语句，因为是永远都无法执行到。
 2. continue 也可以配合标记使用的。

 */

public class _0508_Statement_BreakContinue {
	public static void main(String[] args) {
		aaa: for (int j = 0; j < 3; j++) { // j=0 外层for循环
			bbb: for (int i = 0; i < 2; i++) { // i=0 内层for循环
				System.out.println("hello world"); // 1
				break aaa;
			}

		}
		/*
		  for(int i = 0 ; i<5 ; i++){ // i=1 2 if(i==1){ continue; }
		  System.out.println("hello "+i); }
		  
		  
		 
		  outer:for(int i = 0 ; i<3; i++){ // i= 0; i =1 i=2 3 inner:for(int j
		  = 0 ; j<2 ; j++){ //j=0 System.out.println("hello"); //1 2 3 continue
		  outer; } }
		  
		  需求： 计算1-100的偶数总和.
		 */

		int sum = 0;
		for (int num = 1; num <= 100; num++) {
			if (num % 2 != 0) {
				continue; // 如果是奇数就跳过本次循环。
			}

			sum = sum + num;
		}

		System.out.println("总和：" + sum);

	}

}
