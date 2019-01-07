package cn.edu.bjut.nlp.socket._03tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


/*
聊天的服务端
*/
public class _02TcpChatServer {

	
	public static void main(String[] args) throws IOException {
		//建立tcp的服务端
		ServerSocket serverSocket = new ServerSocket(9090);
		//接受客户端的连接，产生一个SOcket
		Socket socket = serverSocket.accept();
		InputStream inputstream =socket.getInputStream();
		OutputStream outputStream = socket.getOutputStream();
		//获取到Socket输出流对象
		BufferedWriter socketWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
		//获取键盘的输入流对象
		BufferedReader keyReader = new BufferedReader(new InputStreamReader(System.in)) ;
		//获取到Socket的输入流对象
		BufferedReader socketReader = new BufferedReader(new InputStreamReader(inputstream));
		String line;
		//读取客户端的数据
		while((line = socketReader.readLine())!=null){
			System.out.println("cline say :"+line);
			System.out.println("please input the data to cline: \t\n");
			line = keyReader.readLine();
			socketWriter.write(line+"\r\n");
			socketWriter.flush();
		}
		
		//关闭资源
		socketReader.close();
		socketWriter.close();
	}

}
