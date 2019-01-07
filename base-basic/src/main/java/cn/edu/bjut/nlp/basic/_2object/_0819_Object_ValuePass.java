package cn.edu.bjut.nlp.basic._2object;
class Pers{

	int x =10;
}

public class _0819_Object_ValuePass {
	public static void main(String[] args) 
	{
		/*
		int a = 3;
		int b = 5; 
		changeValue(a,b);
		System.out.println("交换之后的值：a = "+a +" b="+b); 

		int[] arr = {23,10,9};
		changeArr(arr,1,2);
		System.out.println("数的元素："+ Arrays.toString(arr));// 9 ,10
			*/
		Pers p = new Pers();
		changeObj(p,20);
		System.out.println("x = "+ p.x);
	}
	
	public static void changeObj(Pers p ,int x){
		p.x = x;
	}



	
	//需求2： 定义一个函数交换数组中两个 元素的位置。
	public  static void changeArr(int[] arr , int index1,  int  index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	
	}



	//需求1：定义一个函数交换两个基本类型变量的值。 
	public static void changeValue(int a , int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println("方法内部交换的值：a = "+a +" b="+b);
	}
}
