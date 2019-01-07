package cn.edu.bjut.nlp.basic._1basic;
/*
算术运算符:
	+ (正数、加法、连接符)
	连接符的作用： 让任何的数据都可以与字符串进行拼接。
	如果+号用于字符串的时候，那么+号就是一个连接符，并不是 做加法功能了。

	连接符要注意：任何类型的数据与字符串使用连接符连接，那么结果都是字符串类型的数据。
	-
	*
	/ (除法)
	%(取模、取余数)

*/

/*
	++ （自增） :  自增就是相当于操作数+1.

	前自增：++位于操作数的前面。  比如： ++a；
	
	前自增：先自增，后使用。
				

	后自增： 先使用，后自增。
	

*/

/*
自减： 操作数-1.

前自减: --位于操作数的前面。  --操作数

前自减： 先自减，后使用。

----------------------------------------------

后自减：--位于操作数的后面。 操作数--；

后自减： 先使用，后自减。

*/
public class _0401_Operator_ArithmeticOperator {
	public static void main(String[] args){
		/*int i = 1;
		int j = 2;
		System.out.print(i + j);
		
		System.out.println(1+2+3 + "world" +1+2+3);//6world123,每次只取两个进行计算
		
		int a = 10;//double a = 12;
		int b = 3;
		System.out.println(a/b);//3  4.0
		
		System.out.println(a%b);//1
		//在java中做取模 运算的时，结果的正负号是取决于被除数。
		System.out.println(10%3);//1
		System.out.println(10%-3);//1
		System.out.println(-10%3);//-1
		System.out.println(-10%-3);//-1
       */		
		
		int a = 0;
		//int sum = ++a; //前自增。 a = a+1  ， sum = a
		int sum = a++; //后自增  sum = 0 , a = a+1
		System.out.println("sum= "+ sum+ " a = "+ a); //1 


		/*后自增在jvm的运行原理：
			
			因为后自增要使用 到没有+1之前 的值，那么jvm会先声明一个变量用于保存没有+1之前的值。
			int i = 0;
			i = temp;
			原理：
				1. int temp = i; // 声明了一个临时变量用于记录了i没有加1之前的值。
				2. 自增。  i = i+1;   i = 1;
				3. temp把用作了表达式 的结果。
			i的值发生了几次变化：
					i = 0 -----> 1----> 0
		*/
		int i = 0;
		i = i++; // 后自增...  后自增要使用到没有+1之前的值。
		System.out.println("sum ="+ sum+ "i= "+i);//0
	}
		
		

}
