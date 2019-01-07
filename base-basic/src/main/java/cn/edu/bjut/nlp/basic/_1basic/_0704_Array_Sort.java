package cn.edu.bjut.nlp.basic._1basic;
/*
需求： 定义一个函数接收一个int类型的数组对象, 把数组中的最大值放在数组中的第一位。

选择排序(直接排序)：使用一个元素与其他 的元素挨个比较一次，符合条件交换位置。

 */
public class _0704_Array_Sort {
	public static void main(String[] args) {
		int[] arr = { 12, 5, 17, 8, 9 }; // 对于5元素的数组，只需要找出4个最大值就可以排序了。
		_0704_Array_Sort sort = new _0704_Array_Sort();
		//sort.selectSort(arr);
		sort.bubbleSort(arr);
		sort.printArr(arr);
	}

//把最大值放在首位置
	private void selectSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[i] < arr[j + 1]) {
					temp = arr[i];
					arr[i] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}
/*
需求： 定义一个函数接收一个int类型的数组对象, 把数组中的最大值放在数组中的最后一位。

冒泡排序：冒泡排序的思想就是使用相邻的两个 元素挨个比较一次，符合条件交换位置。

*/

	private void bubbleSort(int[] arr){
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for(int j = 0;j < arr.length -i -1;j++){
				if (arr[j] < arr[j+1]) {
				temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j]= temp;
				}
			}
		}
		
	}

	private void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
