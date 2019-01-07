package cn.edu.bjut.nlp.socket._03tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/*
 2.  实现登陆与注册 功能。  
 客户端与服务端连接的时候，就要提示客户端请选择功能。

 客户端注册的时候，用户名与密码都是发送给服务端 的，服务端需要把数据保存到服务端的文件上。

 登陆： 登陆的时候客户端输入用户名与密码发送给服务端，服务端需要校验，返回结果给客户端。
 */

public class _04TcpTestCline_Login {
	public static String getDate(Scanner scanner,String key) {
		System.out.println("please input the name: \r\n");
		String name = scanner.next();
		System.out.println("please input the password: \r\n");
		String passWord = scanner.next();
		String info = key + " " + name + " " + passWord;
		return info;
		
	}
	
	public static void main(String[] args) throws Exception, IOException {

		Socket socket = new Socket(InetAddress.getLocalHost(), 9090);
		BufferedWriter socketWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		//获取到socket的输入流对象
		BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("请选择功能： A(登陆)  B(注册)");
			String key = scanner.next();
			if ("a".equalsIgnoreCase(key)) {
				System.out.println("=======登陆========");
				String string = getDate(scanner, key);
				socketWriter.write(string+"\r\n");
				socketWriter.flush();
				//读取服务器反馈的信息
				String line = socketReader.readLine();
				System.out.println(line+"\r\n");
				
			} else if ("b".equalsIgnoreCase(key)) {
				System.out.println("=======注册========");
				String string = getDate(scanner, key);
				socketWriter.write(string+"\r\n");
				socketWriter.flush();
				//读取服务器反馈的信息
				String line = socketReader.readLine();
				System.out.println(line+"\r\n");
			} else {
				System.out.println("input error!");
			}
		}

	}

}
