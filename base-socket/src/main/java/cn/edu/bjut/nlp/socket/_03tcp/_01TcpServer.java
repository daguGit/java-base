package cn.edu.bjut.nlp.socket._03tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//tcp的服务端
/*
	java.net.BindException:   端口被占用。

ServerSocket的使用 步骤
	1. 建立tcp服务端 的服务。
	2. 接受客户端的连接产生一个Socket.
	3. 获取对应的流对象读取或者写出数据。
	4. 关闭资源。


为什么ServerSocket不设计一个getInputStream与getOutputStream 呢？ 

*/

public class _01TcpServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//建立Tcp的服务端,并且监听一个端口。
		ServerSocket serverSocket = new ServerSocket(9090);
		//accept()  接受客户端的连接 该方法也是一个阻塞型的方法，没有客户端与其连接时，会一直等
		Socket socket = serverSocket.accept();
		//获取输入流对象，读取客户端发送的内容。
		InputStream inputStream = socket.getInputStream();
		//获取socket输出流对象，想客户端发送数据
		OutputStream outputStream = socket.getOutputStream();
		
		byte[] buf = new byte[1024];
		int length = inputStream.read(buf);
		System.out.println(new String(buf,0,length));
		
		outputStream.write("nihao cline".getBytes());
		//关闭资源
		serverSocket.close();
		

	}

}
