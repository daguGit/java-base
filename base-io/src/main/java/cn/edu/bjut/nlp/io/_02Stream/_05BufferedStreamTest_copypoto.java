package cn.edu.bjut.nlp.io._02Stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//练习： 使用缓冲输入输出字节流拷贝一个图片。
public class _05BufferedStreamTest_copypoto {

	
	public static void main(String[] args) throws IOException {
		File inputFile = new File(
				"C://Users//Public//Pictures//Sample Pictures//3.jpg");
		File outputFile = new File("F://girl.jpg");
		
		FileInputStream inputStream = new FileInputStream(inputFile);
		FileOutputStream outputStream = new FileOutputStream(outputFile,true);
		
		BufferedInputStream bufferedInput = new BufferedInputStream(inputStream);
		BufferedOutputStream bufferedOutput = new BufferedOutputStream(outputStream);
		
		
		int length;
		// 如果传入了缓冲数组，内容是存储到缓冲数组中，返回值是存储到缓冲数组中的字节个数。
		// 如果使用read方法没有传入缓冲数组，那么返回值是读取到的内容。
		while ((length = bufferedInput.read()) != -1) {
				bufferedOutput.write(length);
				//bufferedOutput.flush(); 等到满了在写入硬盘效率更高
		}
		bufferedInput.close();
		bufferedOutput.close();

	}

}
