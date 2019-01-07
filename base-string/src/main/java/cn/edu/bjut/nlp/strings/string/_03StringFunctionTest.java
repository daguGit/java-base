package cn.edu.bjut.nlp.strings.string;
/*
需求1：自己实现trim的方法。

需求2： 获取上传文件名  "D:\\20120512\\day12\\Demo1.java"。

需求3：	将字符串对象中存储的字符反序。    新中国好     -----> 好国中新

需求4： 求一个子串在整串中出现的次数 。 
	

*/
public class _03StringFunctionTest {
	public static void main(String[] args) {
		String string = "     java    Demo    ";
		System.out.println(myTrim(string));
		string = "D:\\20120512\\day12\\Demo1.java";
		getFileName(string);
		getFileName2(string);
		string = " 新中国好";
		System.out.println(reverse(string));
		string = "abcjavaabcjavaphpjava";  //java
		getCount(string, "java");
	}
//	需求1：自己实现trim的方法。
	public static String myTrim(String str){
		char[] arr = str.toCharArray();
		int start = 0;
		int end = arr.length - 1;
		while (arr[start] == ' ') {
			start++;
		}
		while (arr[end] ==' ') {
			end--;	
		}
		return str.substring(start,end+1);
	}
	//需求2： 获取上传文件名  "D:\\20120512\\day12\\Demo1.java"。
	public static void getFileName(String path){
		int key = path.lastIndexOf('\\');
		path = path.substring(key +1);
		System.out.println(path);
	}
	public static void getFileName2(String path){
		String[] str = path.split("\\\\");
		System.out.println(str[str.length -1]);
	}
	//需求3：	将字符串对象中存储的字符反序。    新中国好     -----> 好国中新
	public static String reverse(String str){
		char[] arr = str.toCharArray();
		int start = 0;
		int end =arr.length -1;
		while (start<end) {
			char c = arr[start];
			arr[start] = arr[end];
			arr[end] = c;
			start++;
			end--;
		}
		return new String(arr);
		
	}
	//统计子串出现 的次数
		public static void getCount(String str,String target){
			int fromIndex = 0;
			int count = 0;
			int start;
			while((start = str.indexOf(target, fromIndex))!= -1){
				count++;
				fromIndex = start +target.length();
			}
			System.out.println(count);
		}
}
