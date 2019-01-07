package cn.edu.bjut.nlp.collection._04genericity;

class MyArray{
	//元素翻转
	public <T>T[] reverse(T[] arr){
		T temp;
		for (int i = 0; i <= arr.length/2; i++) {
			temp = arr[arr.length-1-i];
			arr[arr.length-1 -i] = arr[i];
			arr[i] = temp;
		}
		return arr;
		
	}

	public <T> String toString(T[] array) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			if(i==0){
				sb.append("[" + array[i]+" ,");
			}else if(i == (array.length -1)){
				sb.append(array[i] + "]");
			}else{
				sb.append(array[i]+" ,");
			}
			
		}
		return sb.toString() ;
	}
}
public class _02GenericityFunctionTest_ArrayUtil {


	public static void main(String[] args) {
		//泛型里面不能用基本类型的数据
		Integer[]  arr = {1,2,3,4,6};
		MyArray myArray = new MyArray();
		
		
		myArray.reverse(arr);
		System.out.println(myArray.toString(arr));

	}

}
