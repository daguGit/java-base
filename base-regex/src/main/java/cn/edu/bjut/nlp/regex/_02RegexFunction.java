package cn.edu.bjut.nlp.regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 正则表达式主要是用于操作字符串的规则，正则表达式对字符串的操作主要有以下几种应用：
	 匹配 matches()：
	 切割split()：
	 替换replaceAll(String regex,String replacement)：
	 查找：
 */
public class _02RegexFunction {

	public static void main(String[] args) {
		//匹配
		// 编写正则表达式匹配手机号  第一位 只能是1开头，第二位为 34578一个，共十一位
		String reg = "1[34578]\\d{9}";
		System.out.println("13556082481".matches(reg)?"Y":"X");
       //匹配固话号码 区号-主机号   区号：首位是0，长度3-4  主机号:首位不是0 长度7-8
		System.out.println("0312-6869220".matches("0\\d{2,3}-[1-9]\\d{6,7}")?"Y":"X");
		
		//按照空空格切割
		String  string = "ming    tian   fang          jia";
		String[] datas = string.split(" +");
		System.out.println(Arrays.toString(datas));
		//叠词切割
		string = "大家家家家玩玩玩玩的开开开心心";
		
		//如果正则的内容需要被复用，，那么需要正则的内容进行分组括号表示。分组的目的就是为了提高正则内容的复用性。组号不能指定，从1开始
		//\\1就代表获取1组规则。
		String[] datas2 = string.split("(.)\\1+");
		System.out.println(Arrays.toString(datas2));//大 的 
		
		//替换
		 //讲电话号码替换为****
		String string2 = "13785356777";
		string2 = string2.replaceAll(reg, "****");
		System.out.println(string2);
		 //将结巴话还原
		String string3 = "我我我要要要要要要玩玩玩耍耍耍耍";
		string3 = string3.replaceAll("(.)\\1+", "$1");//如果需要在replaceAll外引用组的内容，使用“$组号”
		System.out.println(string3);
		
		//查找
			/*查找需要使用的对象：
				1.Pattern(正则对象)
				2.Matcher(匹配器对象)
			  匹配器要使用到的方法：
			    1.find()  通过匹配器去匹配字符串，查找符合规则的字符串。返回 true 或false
			    2.group() 获取符合规则的字串
				指定为字符串的正则表达式必须首先被编译为此类的实例。然后，可将得到的正则对象匹配任意的字符串用于创建Matcher对象
			 	执行匹配所涉及的所有状态都驻留在匹配其中，所以多个匹配器可以共享统一模式，因此，典型的调用顺序是：
			 Pattern p = Pattern.compile("a*b");
	 		 Matcher m = p.matcher("aaaaab");
	 		 boolean b = m.matches();
	 		 
	 		 注意：使用group方法的时候一定要先调用find方法让匹配器去查找符合规则的字符串。否则报错

			*/
		//找出三个字母的单词
		String string4 = "da jia de jia qi jie shu le. sdfasd dase";
		String reg2 = "\\b[a-zA-Z]{3}\\b";
		//先把要字符串的正则编译成pattern对象
		Pattern pattern = Pattern.compile(reg2);
		 //使用正则对象匹配字符串用于创建matcher对象
		Matcher matcher = pattern.matcher(string4);
		System.out.println("又符合规则的吗？"+ matcher.find());
		System.out.println(matcher.group());
		
		while(matcher.find()){
			System.out.println(matcher.group());
		}
	}


}
