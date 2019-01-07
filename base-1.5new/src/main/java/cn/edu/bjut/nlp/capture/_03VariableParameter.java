package cn.edu.bjut.nlp.capture;

/*
jdk1.5新特性之------->可变参数

需求： 定义一个函数做加法功能（函数做几个数据 的加法功能是不确定）。

可变参数的格式：
	
	数据类型... 变量名

可变参数要 注意的细节： 
	1. 如果一个函数 的形参使用上了可变参数之后，那么调用该方法的时候可以传递参数也可以不传递参数。
	2. 可变参数实际上是一个数组对象。
	3. 可变参数必须位于形参中的最后一个参数。
	4. 一个函数最多只能有一个可变 参数，因为可变参数要位于形参中最后一个位置上。
	

 
 */
public class _03VariableParameter {

	
	public static void main(String[] args) {
		
		System.out.println(add(1,2,3));
	}
	public static int add(int... arr){
		int sum =0;
		for(int a : arr){
			sum +=a;
		}
		return sum;
	}

}
