package cn.edu.bjut.nlp.io._02Stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 字节流：字节流读取的是文件中的二进制数据，读到的数据并不会帮你转换成你看得懂的字符。 

 字符流： 字符流会把读取到的二进制的数据进行对应 的编码与解码工作。   字符流 = 字节流 + 编码(解码)

 输入字符流：
 ----------| Reader 输入字符流的基类   抽象类
 -------------| FileReader 读取文件的输入字符流。默认使用GBK编码表

 FileReader的用法：
 1. 找到目标文件
 2. 建立数据的输入通道
 3. 读取数据
 4. 关闭资源
 */
public class _06Reader {
	public void read1() throws IOException {
		File file = new File("F://a.txt");
		FileReader reader = new FileReader(file);
		int content = 0;
		//每次只会读取一个字符，效率低。
		while ((content = reader.read()) != -1) {
			System.out.println((char) content);
		}
		reader.close();
	}

	// 使用缓冲字符数组读取文件。
	public void read2() throws IOException {
		File file = new File("F://a.txt");
		FileReader reader = new FileReader(file);
		int length = 0;
		char[] buf = new char[10];
		while ((length = reader.read(buf)) != -1) {
			System.out.println(new String(buf, 0, length));
		}
		reader.close();
	}

	public static void main(String[] args) throws IOException {
		new _06Reader().read2();

	}

}
