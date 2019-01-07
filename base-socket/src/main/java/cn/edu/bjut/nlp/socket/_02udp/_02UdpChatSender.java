package cn.edu.bjut.nlp.socket._02udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
//群聊发送端
public class _02UdpChatSender {

	public static void main(String[] args) throws IOException {
		//建立udp的服务
		DatagramSocket  datagramSocket = new  DatagramSocket();
		//准备数据，把数据封装到数据包中发送
		InputStream inputStream = System.in;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader (inputStream));
		byte[] buf= null;
		String line = null;
		DatagramPacket datagramPacket =null;
		while((line = bufferedReader.readLine())!=null){
			buf = line.getBytes();
			//把数据封装 到数据数据包中，然后发送数据。
			datagramPacket  = new DatagramPacket(buf,buf.length, InetAddress.getByName("172.21.15.255"),9090);
			//把数据发送出去
			datagramSocket.send(datagramPacket);
		}
		datagramSocket.close();
	}

}
