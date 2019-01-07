package cn.edu.bjut.nlp.basic._2object;

public class _0810_Object_StaticFunctionTest {
	public static void main(String[] args) {
		int[] a = {1,4,22,2,7,6};
		ArrayTool.sort(a);
		System.out.println(ArrayTool.toString(a));
	}
}
class ArrayTool{
	public static int[] sort(int[] array){
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j+1];
						array[j+1] = array[j];
						array[j] = temp;
				}
			}
		}
		return array;
		}
	public static String toString(int[] array){
		String result="[";
		int i = 0;
		for (; i < array.length-1; i++) {
			result += array[i] + ",";
		}
		result += array[i]+"]";
		return result;
		}
}