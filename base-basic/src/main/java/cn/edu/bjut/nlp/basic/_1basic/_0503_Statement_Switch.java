package cn.edu.bjut.nlp.basic._1basic;
import java.util.Scanner;

/*
控制流程语句之----switch选择判断语句 

switch语句的格式：
	
	switch(你的选择){
		
		case 值1：
			符合值1执行的代码
			break;
		case 值2：
			符合值 2执行的代码
			break;
		case 值3：
			符合值 3执行的代码
			break;
		case 值4：
			符合值 4执行的代码
			break;
		......

		default: 
			你的选择都符合上述的选项时执行的代码;
			break;
	}


switch语句要注意的事项：
	1. switch语句使用的变量只能是byte、 char、 short、int、 String数据类型，String数据类型是从jdk7.0的时候开始支持的。
	2. case后面跟 的数据必须是一个常量。	
	3. switch的停止条件：
		switch语句一旦匹配上了其中的一个case语句，那么就会执行对应的case中的语句代码，执行完毕之后如果没有
		遇到break关键字或者是结束switch语句的大括号，那么switch语句不会再判断，按照代码的顺序从上往下执行
		所有的代码。直到遇到break或者是结束siwitch语句的大括号为止。

	4. 在switch语句中不管代码的顺序如何，永远都是会先判断case语句，然后没有符合的情况下才会执行default语句。



if--else if---else if 语句与switch语句非常的相似：
	
	switch语句的优点：switch语句的结构清晰。

	switch缺点：如果 判断的条件是一个区间范围的，使用switch操作就非常的麻烦了。



判断以下那些不是计算机语言( D  )
	
	A java    B C#   C javascript   D android
	
*/
public class _0503_Statement_Switch {
	public static void main(String[] args)
	{
		
		int option = 0;
		//long option; XXXX
		switch ( option) {

			case 1://case 后必为常量
				System.out.println("java");
				break;
			case 2:
				System.out.println("java");
				break;
			case 3:
				System.out.println("java");
				break;
			case 4:
				System.out.println("java");
				break;
			default://无论default在哪里，都先执行case语句
				System.out.println("sorry");
				break;
		}
		new _0503_Statement_Switch().testSeason();
	}
	public void testSeason()
	{
		System.out.println("please input the season");
		Scanner scanner = new Scanner(System.in);
		
		int season = scanner.nextInt();
		switch (season) {
		case 3:
		case 4:
		case 5:
			System.out.println("chuantian");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("xiatian");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("qiutian");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("dongtian");
			break;
		default:
			System.out.println("sorry");
			break;
		}
	}
}
