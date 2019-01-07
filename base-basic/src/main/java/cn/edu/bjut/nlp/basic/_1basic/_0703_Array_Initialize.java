package cn.edu.bjut.nlp.basic._1basic;
/* 
数组的初始化方式：
	
	动态初始化:
		数据类型[] 变量名 = new 数据类型[长度];

	静态初始化：	
		数据类型[] 变量名 = {元素1，元素2.....};


如果程序一开始你就已经确定了数据，那么这时候建议使用静态初始化。如果
数据一开始还不太明确，这时候就建议使用动态初始化。


*/
public class _0703_Array_Initialize {
	public static void main(String[] args){
		//动态初始化
		int[] arr = new int[10];
		//静态初始化
		int[] arr1 = {1,2,3,4,5};
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		int max = new _0703_Array_Initialize().getMax(arr1);
		System.out.println(max);
	}
	
	public int getMax(int[] array){
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
}
