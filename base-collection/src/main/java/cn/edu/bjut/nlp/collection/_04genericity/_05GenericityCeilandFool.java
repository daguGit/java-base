package cn.edu.bjut.nlp.collection._04genericity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
泛型的上下限：

需求1： 定义一个函数可以接收接收任意类型的集合对象， 要求接收的集合对象只能存储Integer或者是Integer的父类类型数据。

需求2： 定义一个函数可以接收接收任意类型的集合对象， 要求接收的集合对象只能存储Number或者是Number的子类类型数据。

泛型中通配符： ？ 
	
	? super Integer : 只能存储Integer或者是Integer父类元素。  泛型 的下限
	
	? extends Number ： 只能存储Number或者是Number类型的子类数据。 泛型上限
	
*/
public class _05GenericityCeilandFool {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Number> list2 = new ArrayList<Number>();
		
		HashSet<String> set = new HashSet<String>();
		//getData(set);
		
	}
	
	//泛型的上限
	public static void getData(Collection<? extends Number> c){
		
		
	}
	
	//泛型的下限
	public static void print(Collection<? super Integer> c){
		
	}
	
}
