package cn.edu.bjut.nlp.basic._1basic;
/*
数组：数组是存储同一种数据类型数据的集合容器。

数组的定义格式：
	数据类型[]  变量名 = new 数据类型[长度];

分析数组：   
	 左边： int[] arr    声明了一个int类型的的数组变量，变量名为arr。
		int : 表示该数组容器只能存储int类型的数据。
		[] ： 这是一个数组类型。
		arr ： 变量名.
	
	右边：new int[50]; 创建了一个长度为50的int类型数组对象。
		new ： 创建数组对象的关键字。
		int:  表示该数组对象只能存储int类型数据。
		[]： 表示是数组类型。
		50 : 该数组最多能存储50个数据。数组的容量。

		
数组的好处： 对分配到数组对象中每一个数据都分配一个编号（索引值、角标、下标）,索引值的范围是从0开始，最大是： 长度-1.



局部变量： 如果一个变量是在一个方法（函数）的内部声明的，那么该变量就是一个局部变量。

成员变量： 成员变量就是定义在方法之外，类之内的.


*/
public class _0701_Array_Definition {
	public static void main(String[] args) 
	{
		//定义一个数组
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 30;
		arr[2] = 50;
		arr[3] = 90; 
		
		//System.out.println("数组的容量："+ arr.length);	//数组的有一个length 的属性，可以查看数组 的容量。
		//System.out.println("arr[2] = "+ arr[2]);
		
		//查看数组中的所有数据。
		for(int index = 0 ; index<arr.length ; index++){
			System.out.println(arr[index]);
		}
		new _0701_Array_Definition().testArray();
	}
	//此函数测试数组的内存分析
	public void testArray(){
		int[] arr1 = new int[2];
		int[] arr2 = new int[2];
		arr1[1] = 10;
		arr2 = arr1;
		arr2[1] = 20;
		System.out.println(arr2[1]);
	}
}
