package cn.edu.bjut.nlp.io._02Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 输出字节流：

 --------| OutputStream 是所有输出字节流 的父类。  抽象类
 -----------| FileOutStream 向文件输出数据的输出字节流。

 FileOutputStream如何使用呢？
 1. 找到目标文件
 2. 建立数据的输出通道。
 3. 把数据转换成字节数组写出。
 4. 关闭资源

 FileOutputStream要注意的细节：
 1. 使用FileOutputStream 的时候，如果目标文件不存在，那么会自动创建目标文件对象。 
 2. 使用FileOutputStream写数据的时候，如果目标文件已经存在，那么会先清空目标文件中的数据，然后再写入数据。
 3.使用FileOutputStream写数据的时候, 如果目标文件已经存在，需要在原来数据基础上追加数据的时候应该使用new FileOutputStream(file,true)构造函数，第二参数为true。
 4.使用FileOutputStream的write方法写数据的时候，虽然接收的是一个int类型的数据，但是真正写出的只是一个字节的数据，只是
 把低八位的二进制数据写出，其他二十四位数据全部丢弃。

 00000000-000000000-00000001-11111111   511
 11111111---> -1 
 */
class WriteFile {
	File file;
	FileOutputStream outputStream;
	//每次只能写一个字节的数据出去。
	public void write1() throws IOException {
		//找到目标文件
		 file = new File("F:\\b.txt");
		//建立数据的输出通道
		outputStream = new FileOutputStream(file);
		//把数据写出
		outputStream.write('h');
		outputStream.write('e');
		outputStream.write('l');
		outputStream.write('l');
		outputStream.write('o');
		//关闭资源
		outputStream.close();
				
		
	}
	//使用字节数组把数据写出。
	public void write2() throws IOException {
		file = new File("F://b.txt");
		outputStream = new FileOutputStream(file,true);
		String string = "Hello world";
		byte[] buf = string.getBytes();
		outputStream.write(buf);
		outputStream.close();
		
	}
	//使用字节数组把数据写出。
	public void write3() throws IOException {
		file = new File("F://b.txt");
		outputStream = new FileOutputStream(file);
		String string = "Hello world";
		byte[] buf = string.getBytes();
		outputStream.write(buf,0,4);// 0 从字节数组的指定索引值开始写， 2：写出4个字节。
		outputStream.close();
		
	}
	//使用FileOutputStream的write方法写数据的时候，虽然接收的是一个int类型的数据，但是真正写出的只是一个字节的数据，只是
	 //把低八位的二进制数据写出，其他二十四位数据全部丢弃。

	public void write4() throws IOException {
		file = new File("F://b.txt");
		outputStream = new FileOutputStream(file);
	    int i =511; //1 1 1 1 1 1 1 1 1
		outputStream.write(i);
		outputStream.close();
		
	}

}

public class _02OutputStream {
	public static void main(String[] args) throws IOException {
		/*String string = "abc";
		byte[] buf = string.getBytes();
		System.out.println(buf.length);
		System.out.println(Arrays.toString(buf));
		 */
		new WriteFile().write4();
		File file = new File("F://b.txt");
		FileInputStream inputStream = new FileInputStream(file);
		byte[] buf = new byte[4];
		int length =inputStream.read(buf);
		System.out.println(Arrays.toString(buf));//[-1,0,0,0]
		inputStream.close();
	}

}
