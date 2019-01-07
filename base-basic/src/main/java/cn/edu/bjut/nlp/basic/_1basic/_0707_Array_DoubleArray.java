package cn.edu.bjut.nlp.basic._1basic;
import java.util.Arrays;

/*
二维数组： 二维数组就是数组中的数组。

二维数组 的定义格式：
	
	数据类型[][] 变量名 = new 数据类型[长度1][长度2];

	长度1：一条烟有多少盒。

	长度2： 一盒烟有多少根。


二维数组 的初始化方式：
	
	动态初始化:
		
		数据类型[][] 变量名 = new 数据类型[长度1][长度2];


	静态初始化：

		数据类型[][]  变量名 = {{元素1,元素2...},{元素1,元素2...},{元素1,元素2...} ..}


*/
/*
数组的特点：
	1. 数组只能存储同一种 数据类型的数据。
	2. 数组是会给存储到数组中 的元素分配一个索引值的，索引值从0开始，最大的索引值是length-1；
	3. 数组一旦初始化，长度固定。
	4. 数组中的元素与元素之间的内存地址是连续的。

*/
public class _0707_Array_DoubleArray {
	public static void main(String[] args){
		int[][]  arr=  new int[3][4];
		System.out.println(arr.length);
		System.out.println(arr[1].length);
		int[][] arr2 = {{1,2,3},{4,5,6},{4,8}};
		System.out.println(arr2[2].length);
		
		new _0707_Array_DoubleArray().clearZero();
	}
	
	//练习：清空数组中的零元素
	private void clearZero(){
		int[] arr = {0,0,12,1,0,4,6,0};
		int count = 0 ;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count ++;
			}
		}
		int arr2[] = new int[arr.length - count];
		int key =0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr2[key] = arr[i];
				key++;
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}
