package cn.edu.bjut.nlp.collection._06util;

import java.util.List;
import java.util.Arrays;

/*

	1，	复制数组。
	 copyOf(boolean[] original,int newLength);
	 	original:原数组
	 	newLength:新数组长度
	2，	复制部分数组。
	copyOfRange(boolean[] original,int from,int to):
	3，	比较两个数组是否相同。
	equals(int[],int[]);
	4，	将数组变成集合。
	List asList(T[]);

 */
public class _02Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] arr = {1,2,3};
		//复制数组。
		Integer[] arr2 = Arrays.copyOf(arr, 6);
		//复制部分数组。
		Integer[] arr3 = Arrays.copyOfRange(arr, 1,3);
		//1,2,3 ,0 ,0   换成Internet 则变成null
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		//比较两个数组是否相同。
		System.out.println(Arrays.equals(arr, arr2));
		//将数组变成集合。
		List<Integer> list =  Arrays.asList(arr);
		System.out.println(list);
		list.toArray();
	}

}
