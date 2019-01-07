package cn.edu.bjut.nlp.basic._1basic;
/*
需求： 定义一个函数做加法功能。

函数的重载：在一个类中出现两个或者两个以上的同名函数，这个称作为函数的重载。

函数重载的作用： 同一个函数名可以出现了不同的函数，以应对不同个数或者不同数据类型的参数。

函数重载的要求：
	1. 函数名一致。
	2. 形参列表不一致。（形式参数的个数或者是对应的数据类型不一致）
	3. 与函数的返回值类型是无关的。

*/
public class _0603_Function_Overload {
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		//add1(1,2);
		add(1,2.0);
	}

// 这些函数都是在做加法运算。
	public static double add(int a, int b){
		System.out.println("两个参数的总和: "+ (a+b));
		return 3.14;
	}
	
	//重复定义
	public static int add(int a, double b){
		System.out.println("double参数的总和: "+ (a+b));
		return 12;
	}

	
/*
	public static void add(int a , int b , int c){
		System.out.println("三个参数的总和: "+ (a+b+c));
	}


	public static void add(int a , int b , int c,int d){
		System.out.println("四个参数的总和: "+ (a+b+c+d));
	}

*/
}
