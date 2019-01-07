package cn.edu.bjut.nlp.io._02Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
字节流

输入字节流：
-----------| InputStream  所有输入字节流的基类  抽象类
-----------------| FileInputStream 读取文件数据的输入字节流
-----------------| BufferedInputStream  缓冲输入字符流       该类出现的目的是为了提高读取文件 数据的效率。 这个类其实只不过是在内部维护了一个8kb的字节数组而已。


输出字节流：
-----------| OutputStream 所有输出字节流的基类。  抽象类。
----------------| FileOutputStream 向文件输出数据的输出字节流  
----------------| BufferedOutputStream 缓冲输出字节流   该类出现的目的也是为了提高向文件写数据的效率。 这个类的也只不过是在内部维护了一个8kb的字节数组而已。

字符流 :  字符流 = 字节流  + 编码（解码）

输入字符流:
---------| Reader   所有输入字符流的基类。  抽象类。
----------------| FileReader 读取文件数据的输入字符流。 
----------------| BufferedReader 缓冲输入字符流           该类出现的目的是为了提高读取文件数据的效率与拓展FileReader的(readLine)功能。  这个类的也只不过是在内部维护了一个8kb的字符数组而已。


输出字符流:
---------| Writer 所有输出字符流的基类。  抽象类
----------------| FileWriter 向文件输出数据的输出字符流  
----------------| BufferedWriter 缓冲输出字符流        该类出现的目的是为了提高写文件数据的效率与拓展FileWriter的(newLine)功能.



 */
public class _09BufferedWriterTest_Login {
	public void login() throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String userName = scanner.next();
		System.out.println("请 输入密码：");
		String password = scanner.next();
		String info = userName + " " + password;
		// 读取文件的信息，查看是否有该用户的信息存在，如果存在则登陆成功。
		// 建立数据的输入通道
		// 建立缓冲输入字符流
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
				"F:\\user.txt"));
		String line = null;

		boolean isLogin = false; // 用于记录是否登陆成功的标识， 默认是登陆失败的。
		// 不断的读取文件的内容
		while ((line = bufferedReader.readLine()) != null) {
			if (info.equals(line)) {
				isLogin = true;
				break;
			}
		}

		if (isLogin) {
			System.out.println("欢迎" + userName + "登陆成功...");
		} else {
			System.out.println("不存在该用户信息，请注册!!");
		}

	}

	public void regret() throws IOException {
		File file = new File("F:\\user.txt");
		FileWriter fileWriter = new FileWriter(file, true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String userName = scanner.next();
		System.out.println("请 输入密码：");
		String password = scanner.next();
		bufferedWriter.write(userName + " " + password);
		bufferedWriter.newLine(); // newLine() 换行。 实际上就是想文件输出\r\n.
		bufferedWriter.flush();
		bufferedWriter.close();
	}

	public void mainPage() throws IOException {
		while (true) {
			System.out.println("请选择功能： A(登陆) B(注册)  ");
			Scanner scanner = new Scanner(System.in);
			String string = scanner.next();

			if ("a".equalsIgnoreCase(string)) {
				login();
			} else if ("b".equalsIgnoreCase(string)) {
				regret();
			} else {
				System.out.println("你的输入有误,请重新输入...");
			}
		}
	}

	public static void main(String[] args) throws IOException {
		new _09BufferedWriterTest_Login().mainPage();
	}

}
