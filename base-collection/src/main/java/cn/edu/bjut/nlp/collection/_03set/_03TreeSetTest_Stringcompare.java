package cn.edu.bjut.nlp.collection._03set;

import java.util.TreeSet;
/*
TreeSet是可以对字符串进行排序 的， 因为String已经实现了Comparable接口。

字符串的比较规则：
	
	情况一： 对应位置有不同的字符出现， 就比较的就是对应位置不同的字符。

	情况 二：对应位置上 的字符都一样，比较的就是字符串的长度。

 */

public class _03TreeSetTest_Stringcompare {

	public static void main(String[] args) {
		TreeSet set  = new TreeSet();
		set.add("abc");
		set.add("abccc");
		System.out.println(set);
		
		System.out.println("abw".compareTo("abcccccccccccc"));
		sort();
	}
	
	/*
	需求：将字符串中的数值进行排序。
			例如String str="8 10 15 5 2 7"; ---->   "2 5 7 8 10 15"
	*/
	public static void sort(){
		String str="8 10 15 5 2 7";
		String[] datas = str.split(" ");
		TreeSet set = new TreeSet();
		
		for (int i = 0; i < datas.length; i++) {
			set.add(Integer.parseInt(datas[i]));
		}
		System.out.println(set);
	}

}
