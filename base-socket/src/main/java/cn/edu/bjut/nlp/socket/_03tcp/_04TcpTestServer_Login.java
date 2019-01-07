package cn.edu.bjut.nlp.socket._03tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

class Server1 extends Thread {
	private Socket socket;
	static File file = new File("F://user.properties");

	public Server1(Socket socket) {
		this.socket = socket;
	}
	//静态代码块，类文件加载到方法取得时就执行
	static {
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void regist(String name, String passWord, BufferedWriter socketOut)
			throws FileNotFoundException, IOException {
		// 创建一个配置文件类
		Properties properties = new Properties();
		//加载原来的配置文件
		properties.load(new FileReader(file));
		if (properties.containsKey(name)) {// 存在用户名
			socketOut.write("name has existed\r\n");
		} else {// 不存在该用户名
			properties.setProperty(name, passWord);
			properties.store(new FileWriter(file), "users");
			socketOut.write("注册成功..\r\n");
		}
		socketOut.flush();
	}

	private void login(String name, String passWord, BufferedWriter socketOut)
			throws FileNotFoundException, IOException {
		File file = new File("F://user.properties");
		if (!file.exists()) {
			socketOut.write("please regist first" + "\r\n");
		} else {
			Properties properties = new Properties();
			// 加载配置文件
			properties.load(new FileReader(file));
			if (!properties.contains(name)) {
				socketOut.write("not exist\r\n");
			} else {
				String tempPass = properties.getProperty(name);
				if (passWord.equals(tempPass)) {
					socketOut.write("欢迎" + name + "登陆成功\r\n");

				} else {
					socketOut.write("密码错误\r\n");
				}
			}
		}
		socketOut.flush();

	}

	@Override
	public void run() {InputStream inputstream;
		OutputStream outputStream;
		BufferedReader bufferedReader;
		BufferedWriter bufferedWriter;
		while(true){
			try {
				inputstream = socket.getInputStream();
				outputStream = socket.getOutputStream();
				bufferedReader = new BufferedReader(new InputStreamReader(
						inputstream));
				bufferedWriter = new BufferedWriter(new OutputStreamWriter(
						outputStream));
				// 读取客户端输入的信息
				String string = bufferedReader.readLine();
				String[] temps = string.split(" ");
				if ("a".equalsIgnoreCase(temps[0])) {
					// 登陆
					login(temps[1], temps[2], bufferedWriter);
				} else if ("b".equalsIgnoreCase(temps[0])) {
					regist(temps[1], temps[2], bufferedWriter);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
	}
}

public class _04TcpTestServer_Login {

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(9090);
		while (true) {
			Socket socket = serverSocket.accept();
			new Server1(socket).start();

		}

	}
}