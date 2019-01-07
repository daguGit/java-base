package cn.edu.bjut.nlp.strings.string;

import java.util.Arrays;
/*
2.2	获取方法
	int length()  获取字符串的长度
	char charAt(int index) 获取特定位置的字符 (角标越界)
	int indexOf(String str) 查找子串第一次出现的索引值,如果子串没有出现 在字符串中，那么则返回-1表示。
	int lastIndexOf(String str) 查找子串最后一次出现的索引值 , 如果子串没有出现 在字符串中，那么则返回-1表示
*/

/*
2.3	判断方法
	boolean endsWith(String str) 是否以指定字符结束
	boolean isEmpty()是否长度为0 如：“” null V1.6
	boolean contains(CharSequences) 是否包含指定序列 应用：搜索
	boolean equals(Object anObject) 是否相等
	boolean equalsIgnoreCase(String anotherString) 忽略大小写是否相等
*/
/*
2.4	转换方法     
	char[] toCharArray()  将字符串转换为字符数组
	byte[]	getBytes();
	
	字节数组与字符数组、字符串他们三者之间是可以互相转换。

*/
/*
其他方法
	String replace(String oldChar, String newChar) 替换
	String[] split(String regex) 切割
	
	String substring(int beginIndex)   指定开始 的索引值截取子串
	String substring(int beginIndex, int endIndex)指定开始 与结束的索引值截取子串
	
	String toUpperCase() 转大写
	String toLowerCase() 转小写
	String trim() 去除字符串首尾的空格
		
*/
public class _03StringFunction {
	public static void main(String[] args) {
		//2.2	获取方法
		String string = "abc中国ab中国";
		System.out.println("string.length "+string.length());
		System.out.println("charAt(int 3) " + string.charAt(3));
		System.out.println("string.indexOf() " +string.indexOf("中国"));
		System.out.println("string.lastIndexOf() " +string.lastIndexOf("中国"));

		//2.3	判断方法
		 string = "Demo.java";
		System.out.println("endsWith(ja) " +string.endsWith("ja"));
		System.out.println("isEmpty " +string.isEmpty());
		System.out.println("contains " +string.contains("Demo"));
		System.out.println("equals "+"DEMO.java".equals(string));
		System.out.println("equalsIgnoreCase "+"DEMO.java".equalsIgnoreCase(string));
	
		//2.4	转换方法    	
		char[] buf = string.toCharArray();
		System.out.println(Arrays.toString(buf));
		byte[] buf2 = string.getBytes();
		System.out.println(Arrays.toString(buf2));
	
		//2.5  其他方法	
		string = "Demo.java";
		System.out.println("replace  "+ string.replace('a', 'b'));
		System.out.println("replace  "+ string.replace("mo", "hah"));
		string = "D-em-o.ja-va";
		String[] spli = string.split(string, '-');
		System.out.println("split " + Arrays.toString(spli));
		
		System.out.println("subString " +string.substring(2)) ;
		System.out.println("subString " +string.substring(2,6)) ;
		System.out.println("toUpperCase " +string.toUpperCase()) ;
		System.out.println("toLowerCase " +string.toLowerCase()) ;
		string = "  j a v a  ";
		System.out.println("trim " + string.trim());
		
	}

}
