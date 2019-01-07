package cn.edu.bjut.nlp.basic._1basic;
/*
比较运算符： 比较运算符的结果都是返回一个布尔值的。

	== (判断是否等于)
	==用于比较两个基本数据类型数据的时候，比较的是两个变量所存储的值是否一致.
	==用于比较两个引用类型变量的数据时候，比较的是两个 引用类型变量所记录的内存地址是否一致. 

	!= (不等于)
	> (大于)
	< (小于)
	>= (大于等于)
	<= (小于等于)
*/
public class _0403_Operator_CompareOperator {
	public static void main(String[] args)
	{
		int a = 10;
		int b = 10;
		System.out.println(a==b);
		
		byte c  = 10;
		long l = 30;
		System.out.println(l>c); //两个不同类型的数据是否可以比较呢.,可以的，但是两个不同类型的数据必须是兼用的数据。
		//这个比较的过程会先把c转换了long类型的数据，然后再进行比较 。

		System.out.println('a'>50);
	}
}
