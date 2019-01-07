package cn.edu.bjut.nlp.capture;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.out;
import static java.util.Collections.binarySearch;
import static java.util.Collections.max;

/*
 jdk1.5新特性之-------静态导入

 静态导入的作用： 简化书写。

 静态导入可以作用一个类的所有静态成员。

 静态导入的格式：
 import static 包名.类名.静态的成员；

 静态导入要注意的事项：
 1. 如果静态导入的成员与本类的成员存在同名的情况下，那么默认使用本类的静态成员，如果需要指定使用静态导入的成员，那么需要在静态成员前面加上类名

 */
/*import static java.util.Collections.sort;
import static java.util.Collections.binarySearch;
import static java.util.Collections.max;*/
public class _01StaticImport {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);		
		list.add(5);
		
		//调用了Collections的sort方法。
		//需要指定使用静态导入的成员，那么需要在静态成员前面加上类名

		Collections.sort(list);
		//Sysout里的out也是静态方法
		out.println(list);
		out.println(binarySearch(list, 3));
		out.println(max(list));
		

	}
	//如果静态导入的成员与本类的成员存在同名的情况下，那么默认使用本类的静态成员
	public static void sort(ArrayList<Integer>list){
		System.out.println("this is local function");
	}

}
