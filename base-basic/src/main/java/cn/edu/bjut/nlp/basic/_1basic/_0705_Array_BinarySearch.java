package cn.edu.bjut.nlp.basic._1basic;
/*
 需求：定义一个函数接收一个数组对象和一个要查找的目标元素，函数要返回该目标元素在
 数组中的索引值，如果目标元素不存在数组中，那么返回-1表示。


 折半查找法(二分法): 使用前提必需是有序的数组。


 */
//折半查找
public class _0705_Array_BinarySearch {
	public static void main(String[] args) {
		int array[] = { 12, 16, 19, 23, 54 };
		_0705_Array_BinarySearch BinarySearch = new _0705_Array_BinarySearch();
		 int tag = BinarySearch.binarySearch(array, 54);
		 System.out.println("the tag is : " + tag);
		 
		 //将数组翻转
		 char[] arr = {'a','b','c','d','e'};
		 BinarySearch.reverse(arr);
	}

	private int binarySearch(int array[], int flag) {
		// TODO Auto-generated method stub
		//定义三个变量分别记录最大、最小、中间的查找范围索引值
		int min = 0;
		int max = array.length - 1;
		int mid;
		while (min <= max) {
			mid = (min + max) / 2;
			if (array[mid] == flag) {
				return mid;
			} else if (array[mid] > flag) {
				max = mid - 1;
			} else if (array[mid] < flag) {
				min = mid + 1;
			} 
		}
		return -1;
	}
	private void reverse(char arr[]){
		int length = arr.length;
		char temp;
		for (int i = 0; i < arr.length -1-i; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i -1] ;
			arr[arr.length -i -1] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"   ");
		}
		
	}
}
