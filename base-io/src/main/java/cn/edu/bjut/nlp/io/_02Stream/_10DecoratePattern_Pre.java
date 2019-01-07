package cn.edu.bjut.nlp.io._02Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
 装饰者设计模式：增强一个类的功能，而且还可以让这些装饰类互相装饰。

 BufferedReader是不是拓展了FileReader的功能。
 BuferedWriter 也是拓展了FileWriter的功能。

 需求1： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有行号。
 需求2：编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有分号。
 需求3： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有双引号。
 需求4： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有行号+ 分号。
 需求5： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有分号+ 双引号。
 需求6： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有双引号+ 行号。
 需求7： 编写一个类拓展BufferedReader的功能， 增强readLine方法返回 的字符串带有行号+ 分号+双引号。

 ----| Reader
 -----------| BufferedReader
 ---------------| BufferedLineNum  带行号
 ---------------| BufferedSemi    带分号
 ---------------| BufferedQuto   带双引
 ---------------| 子类.. 
 ---------------|

 增强一个类的功能时候我们可以选择使用继承：

 通过继承实现增强一个类的功能优点：   代码结构清晰，通俗易懂。

 缺点： 使用不灵活，会导致继承的体系过于庞大。

 */

//带有行号。
class BufferedLineNum extends BufferedReader{

	int line = 0;
	public BufferedLineNum(Reader in) {
		super(in);
		
	}
	@Override
	public String readLine() throws IOException {
		String string = super.readLine();
				
		line++;
		if (string == null) {
			return null;
		}
		return line + string;
	}

}

/*行号+ 分号+双引号的类需要继承好几重，太复杂*/

public class _10DecoratePattern_Pre {
	//带有行号的方法。
	/*public void readLine() throws IOException {
		File file = new File(
				"C://Users//Lenovo//Desktop//Demo1.java");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line;
		int lineNum = 1;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line = lineNum +line);
			lineNum++;
		}
		bufferedReader.close();
	}*/

	public static void main(String[] args) throws IOException {
		//new _10DecoratePattern_Pre().readLine();
		File file = new File(
				"C://Users//Lenovo//Desktop//Demo1.java");
		FileReader fileReader = new FileReader(file);
		BufferedLineNum lineNum = new BufferedLineNum(fileReader);
		String string;
		while((string = lineNum.readLine())!=null){
			System.out.println(string);
		}
	}

}
