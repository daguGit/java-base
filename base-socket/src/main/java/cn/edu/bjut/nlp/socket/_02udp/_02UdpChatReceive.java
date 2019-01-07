package cn.edu.bjut.nlp.socket._02udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

//群聊接收端
public class _02UdpChatReceive {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		DatagramSocket datagramSocket = new DatagramSocket(9090);
		//准备空的数据包存储数据
		byte [] buf = new byte[1024];
		DatagramPacket datagramPacket= new DatagramPacket(buf, buf.length);
		Boolean flag = true;
		while (flag) {
			datagramSocket.receive(datagramPacket);
			// packet.getAddress() 获取对方数据 包的IP地址对象。
		System.out.println(datagramPacket.getAddress()+" : "+new String(buf,0,datagramPacket.getLength()));
		}
		
		datagramSocket.close();
	}
}
