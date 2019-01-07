package cn.edu.bjut.nlp.basic._2object;

public class MyArrays {


	public static String toString(int[] arr){
		String result = "";
		for(int i = 0 ; i < arr.length ; i++){
			if(i==0){
				result +="["+ arr[i]+",";
			}else if(i==arr.length-1){
				result += arr[i]+"]";
			}else{
				result += arr[i]+",";
			}
		}
		return result;
	}
}
