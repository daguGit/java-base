package cn.edu.bjut.nlp.regex;
/*
正则表达式：用于操作字符串的规则。正则表达式规则使用了特殊的符号表示
*/
public class _01Regex {

	
	public static void main(String[] args) {
		String qq = "323";
		/*0开头 
		长度》5《11
		包含字符 long.parseLont()是否报错
		 */
		System.out.println(qq.matches("[1-9]\\d{4,10}")?"Y":"X");
		
		/*
		 预定义字符类：
			 . 	任何字符（与行结束符可能匹配也可能不匹配） 
			\d 	数字：[0-9] 
			\D 	非数字： [^0-9] 
			\s 	空白字符：[ \t\n\x0B\f\r] 
			\S 	非空白字符：[^\s] 
			\w 	单词字符：[a-zA-Z_0-9] 
			\W 	非单词字符：[^\w]
		注意：任何预定义字符没有加上数量词之前都只能匹配一个字符而已。
		
		System.out.println(".".matches("."));
		System.out.println("1".matches("\\d"));
		System.out.println("阿".matches("\\D"));
		System.out.println("\n".matches("\\s"));
		System.out.println("n".matches("\\S"));
		System.out.println("n".matches("\\w"));
		System.out.println("n".matches("\\W"));
		 */
		
		/* Greedy 数量词
		 	X?	X，一次或一次也没有
			X*	X，零次或多次
			X+	X，一次或多次
			X{n}	X，恰好n次
			X{n,}	X，至少n次
			X{n,m}	X，至少n次，但是不超过m次

	
		System.out.println("?一次或一次也没有"+"2".matches("\\d?"));
		System.out.println("*零次或多次"+"233".matches("\\d*"));
		System.out.println("+一次或多次"+"233".matches("\\d+"));
		System.out.println("{n}恰好n次"+"2".matches("\\d{1}"));
		System.out.println("{n,}至少n次"+"23232".matches("\\d{2,}"));
		System.out.println("{n,m}至少n次，但是不超过m次"+"23232".matches("\\d{2,4}"));
		*/
		
		/*
		范围表示
			[abc]	a、b 或 c（简单类） 
			[^abc]	任何字符，除了 a、b 或 c（否定） 
			[a-zA-Z]	a 到 z 或 A 到 Z，两头的字母包括在内（范围） 
			[a-d[m-p]]	a 到 d 或 m 到 p：[a-dm-p]（并集） 
			[a-z&&[def]]	d、e 或 f（交集） 
			[a-z&&[^bc]]	a 到 z，除了 b 和 c：[ad-z]（减去） 
			[a-z&&[^m-p]]	a 到 z，而非 m 到 p：[a-lq-z]（减去）
			注意：范围词里面不管内容多长，没有数量词的配合都只能匹配一个字符
		
		System.out.println("abc".matches("[abc]{3}"));
		System.out.println("a".matches("^[abc]"));
		System.out.println("a".matches("[a-zA-Z$#]"));
		System.out.println("a".matches("[a-dm-p]"));
		 */
		
		/*单词边界匹配器
		\b  单词边界匹配器只是代表了单词的开始或者结束部分，不匹配任何的字符*/
		System.out.println("hello world".matches("hello\\b world"));
	}

}
