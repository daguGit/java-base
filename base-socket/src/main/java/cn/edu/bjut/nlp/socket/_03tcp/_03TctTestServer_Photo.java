package cn.edu.bjut.nlp.socket._03tcp;
/*
1. 编写一个服务端可以给多个客户端发送图片。 （多线程）

*/
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;

class Server extends Thread {
	private Socket socket;
	//使用该集合是用于存储ip地址的。
	static HashSet<String> hashSet = new HashSet<String>();
	public Server(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

		/*
		 * BufferedReader fileReader = new BufferedReader(new
		 * InputStreamReader(new FileInputStream(file))); BufferedWriter
		 * socketWriter = new BufferedWriter(new
		 * OutputStreamWriter(socket.getOutputStream())); String line;
		 * 
		 * while((line = fileReader.readLine())!= null){
		 * socketWriter.write(line); socketWriter.flush(); } fileReader.close();
		 * socketWriter.close();
		 */

		OutputStream socketOutput = null;
		FileInputStream fileInputStream = null;
		try {
			socketOutput = socket.getOutputStream();
			fileInputStream = new FileInputStream(
					"C://Users//Public//Pictures//Sample Pictures//1.jpg");
			byte[] buf = new byte[1024];
			int length;
			while ((length = (fileInputStream.read(buf))) != -1) {
				socketOutput.write(buf, 0, length);
			}
			String ipString = socket.getInetAddress().getHostAddress(); // socket.getInetAddress() 获取对方的IP地址
			if(!hashSet.contains(ipString)){
				hashSet.add(ipString);
				System.out.println(socket.getInetAddress().getHostAddress() + "  "
						+ hashSet.size());
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fileInputStream.close();
				socketOutput.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class _03TctTestServer_Photo {

	public static void main(String[] args) throws IOException {
		//建立tcp的服务 ,并且要监听一个端口
		ServerSocket serverSocket = new ServerSocket(9090);
		Socket socket = null;
		
		int count = 1;
		while (true) {
			//接受用户的链接。
			socket = serverSocket.accept();
			new Server(socket).start();
		}

	}

}
