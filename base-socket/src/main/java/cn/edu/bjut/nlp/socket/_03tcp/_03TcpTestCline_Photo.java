package cn.edu.bjut.nlp.socket._03tcp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

//下载图片的客户端
public class _03TcpTestCline_Photo {

	public static void main(String[] args) throws  Exception {
		File file = new File("f://gril.jpg");
		Socket socket = new Socket(InetAddress.getLocalHost(),9090);
		InputStream inputStream =socket.getInputStream();
		/*//OutputStream outputStream= socket.getOutputStream();
		BufferedReader socketReader = new BufferedReader(new InputStreamReader(inputStream));
		//BufferedWriter socketWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
		BufferedWriter fileWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
		
		String line;
		while((line = socketReader.readLine())!= null){
			fileWriter.write(line);
			System.out.println(line);
			fileWriter.flush();
		}
		socketReader.close();
		fileWriter.close();*/
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		//边读边写
		byte[] buf = new byte[1024];
		int length;
		while((length = inputStream.read(buf))!=-1){
			fileOutputStream.write(buf,0,length);
		}
		inputStream.close();
		fileOutputStream.close();
	}

}
