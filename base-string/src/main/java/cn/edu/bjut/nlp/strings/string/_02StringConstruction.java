package cn.edu.bjut.nlp.strings.string;
/*
String 的构造方法：

	String()  创建一个空内容 的字符串对象。
	String(byte[] bytes)  使用一个字节数组构建一个字符串对象
	String(byte[] bytes, int offset, int length) 
		bytes :  要解码的数组
		offset： 指定从数组中那个索引值开始解码。
		length：　要解码多个元素。
	
	String(char[] value)  使用一个字符数组构建一个字符串。	
	String(char[] value, int offset, int count)  使用一个字符数组构建一个字符串， 指定开始的索引值，与使用字符个数。
	String(int[] codePoints,int offset,int count)
	String(String original) 

记住： 使用字节数组或者字符数组都可以构建一个字符串对象。

*/
public class _02StringConstruction {

	public static void main(String[] args) {
		String string = new String();
		byte[] buf = {97,98,99};
		string = new String(buf);
		System.out.println(string);
		
		string = new String(buf,0,2);//使用一个字节数组构建一个字符串对象,指定开始解码 的索引值和解码的个数。
		System.out.println(string);
		
		char[] arr = {'明','天','是','圣','诞'};
		string = new String(arr); //使用字符数组构建一个字符串
		string  = new String(arr,3,2);
		System.out.println(string);
		
		int[] 	buf2 = {65,66,67};
		string = new String(buf2,0,3);
		System.out.println(string);

		string = new String("hello");
		System.out.println(string);
	}

}
