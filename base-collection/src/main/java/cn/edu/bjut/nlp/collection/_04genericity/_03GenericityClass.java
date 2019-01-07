package cn.edu.bjut.nlp.collection._04genericity;
/*
需求： 编写一个数组 的工具类

泛型类：

泛型类的定义格式：
	
	class 类名<声明自定义泛型>{
	
	}

泛型类要注意的事项：
	1. 在类上自定义泛型的具体数据类型是在使用该类的时候创建对象时候确定的。
	2. 如果一个类在类上已经声明了自定义泛型，如果使用该类创建对象 的时候没有指定 泛型的具体数据类型，那么默认为Object类型
	3.在类上自定义泛型不能作用于静态的方法，如果静态的方法需要使用自定义泛型，那么需要在方法上自己声明使用。

*/
class MyArray2<T>{
	//元素翻转
	public T[] reverse(T[] arr){
		T temp;
		for (int i = 0; i <= arr.length/2; i++) {
			temp = arr[arr.length-1-i];
			arr[arr.length-1 -i] = arr[i];
			arr[i] = temp;
		}
		return arr;
		
	}

	public String toString(T[] array) {
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
	public static <T>void print(){}
}
public class _03GenericityClass {

	
	public static void main(String[] args) {
		
		Integer[]  arr = {1,2,3,4,6};
		//在类上自定义泛型的具体数据类型是在使用该类的时候创建对象时候确定的。
		MyArray2<Integer> myArray = new MyArray2<Integer>();
		//使用该类创建对象 的时候没有指定 泛型的具体数据类型，那么默认为Object类型
		MyArray myArray2 = new MyArray();
		
		MyArray2<String> tool = new MyArray2<String>();
		String[] arr2 = {"aaa","bbb","ccc"};
		tool.reverse(arr2);
				
		
		myArray.reverse(arr);
		System.out.println(myArray.toString(arr));
		System.out.println(tool.toString(arr2));
		
	}

}
