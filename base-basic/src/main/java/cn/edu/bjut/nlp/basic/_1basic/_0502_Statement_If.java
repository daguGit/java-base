package cn.edu.bjut.nlp.basic._1basic;
import java.util.Scanner;

/*
控制流程语句之（if）判断语句

if判断语句的格式：
	
格式1：适用于一种情况使用。

	if(判断的条件){
		符合条件执行的代码;		
	}


格式2 : 适用于两种情况下去使用的。
	
	if(判断条件){
		符合条件执行的代码
	}else{
		不符合条件执行的代码；
	}


三元运算符的格式：布尔表达式？值1：值2;

if-else 与三元运算符非常像：

	三元运算符的优点： 结构比较简洁。
	
	三元运算符的缺点： 符合条件必须要返回一个结果，不能执行语句。



格式三： 适用于多种情况下去使用的。
	
	if(判断条件1){
		符合条件1执行的代码
	}else if(判断条件2){
		符合条件2执行的代码
	}else if(判断条件3){
		符合条件3执行的代码
	}......else{
		都不符合上述 的条件执行的代码	
	}



if语句要注意的细节：
	1. 如果符合条件后只有一个语句需要执行，那么可以省略大括号。但是建议不要省略，因为结构不清晰。
	2. if语句的判断条件后不能添加分号，否则会影响到执行的效果的，


需求1：工作经验要两年或者两年以上。

需求2：根据一个变量所记录的数字输出对应的星期。 0 ---星期天  1 星期一


*/
public class _0502_Statement_If {
	public static void main(String[] args) 
	{
		int workage = 1;
		if(workage >=2)
		{
			System.out.println("Well done!");
			
		}else if(workage == 2){
			System.out.println("Sorry.");
		}else {
			System.out.println("Get out");
		}
		
		String tag = workage>=2?"Well done":"Sorry";
		System.out.println(tag);
		new _0502_Statement_If().ifTest();
	}
	
	public void ifTest(){
		System.out.println("please input the score: ");
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
	
		
		if (score>=90 && score<=100) {
			System.out.println("Congratulation A!");
		}else if (score >= 80) {
			System.out.println("good B!");
		}else if (score >= 70) {
			System.out.println("just soso C!");
		}else if (score >= 60 ) {
			System.out.println("workhard D!");
		}else{
			System.out.println("Bad!");
		}
	}
}
