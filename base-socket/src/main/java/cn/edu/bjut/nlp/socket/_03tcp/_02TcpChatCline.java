package cn.edu.bjut.nlp.socket._03tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

/*
 需求： 客户端与服务端一问一答聊天。
 
 
 1.如果使用BuffrerdReader的readline方法一定要加上\r\n才把数据写出。
 2.使用字符流一定要调用flush方法数据才会写出。
 
 */
public class _02TcpChatCline {

	public static void main(String[] args) throws IOException {
		//建立tcp的客户端服务
		Socket socket = new Socket(InetAddress.getLocalHost(), 9090);
		InputStream inputstream = socket.getInputStream();
		//获取socket的输入流对象
		BufferedReader socketReader = new BufferedReader(new InputStreamReader(
				inputstream));
		//获取键盘的输入流对象，读取数据
		BufferedReader keyReader = new BufferedReader(new InputStreamReader(
				System.in));

		OutputStream outputStream = socket.getOutputStream();
		//获取socket的输出流对象。
		BufferedWriter socketWriter = new BufferedWriter(
				new OutputStreamWriter(outputStream));

		String line;
		
		System.out.println("please input the data to server: ");
		//不断的读取键盘录入的数据，然后把数据写出
		while ((line = keyReader.readLine()) != null) {//readline方法不会最后加\t\n 致使write也没有。造成，服务器端的readline阻塞

			socketWriter.write(line + "\r\n");
			//刷新
			socketWriter.flush();// 因为字符流维护的内部数组
			//读取服务端回送的数据
			line = socketReader.readLine();
			System.out.println("server say: " + line);
			System.out.println("please input the data to server: ");
		}
		socketReader.close();
		socketWriter.close();

	}

}
