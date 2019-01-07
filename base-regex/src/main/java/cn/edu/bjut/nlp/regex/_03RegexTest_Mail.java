package cn.edu.bjut.nlp.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03RegexTest_Mail {

	
	public static void main(String[] args) {
		String content = "2835634@qq.com  233eryue4@qq.com 24534@qq.com 254634@qq.com 2537634@qq.com.cn 2436334@qq.com" ;
		String reg = "[a-zA-Z1-9]\\w{5,17}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}";
		
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(content);
		while(matcher.find()){
			System.out.println(matcher.group());
		}

	}

}
