package cn.edu.bjut.nlp.socket._02udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
每个网络程序都有自己所处理的特定格式数据,如果接收到的数据不符合指定的格式，那么就会被当成垃圾数据丢弃。(加密..)

飞Q接收的数据格式：
version:time :sender : ip: flag:content ;
版本号          时间         发送人   :IP： 发送的标识符(32): 真正的内容;

在udp协议中，有一个IP地址称作为广播地址，广播地址就是主机号为255地址。

给广播IP地址发送消息的时候，在同一个网络段的机器都可以接收 到信息。
192.168.15.255

*/
public class _01UdpSendTest {

	public static void main(String[] args) throws IOException {
		DatagramSocket datagramSocket = new DatagramSocket();
		byte[] buf = getData("feiQ hello world").getBytes();
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length,InetAddress.getByName("172.21.15.204"),4000);
		datagramSocket.send(datagramPacket);
		datagramSocket.close();

	}
	// 把数据拼接成指定格式的数据
		public static String getData(String content) {
			StringBuilder sb = new StringBuilder();
			sb.append("1.0:");
			sb.append(System.currentTimeMillis() + ":");
			sb.append("习大大:");
			sb.append("192.168.10.1:");
			sb.append("32:");
			sb.append(content);

			return sb.toString();
		}

}
