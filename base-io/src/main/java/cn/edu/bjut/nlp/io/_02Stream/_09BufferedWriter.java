package cn.edu.bjut.nlp.io._02Stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
输出字符流
----------| Writer  所有输出字符流的基类，  抽象类。
--------------- | FileWriter 向文件输出字符数据的输出字符流。 
----------------| BufferedWriter 缓冲输出字符流          缓冲输出字符流作用： 提高FileWriter的写数据效率与拓展FileWriter的功能。
BufferedWriter内部只不过是提供了一个8192长度的字符数组作为缓冲区而已，拓展了FileWriter的功能。

BufferedWriter如何使用？
	1. 找到目标文件
 	2. 建立数据的输出通道
 */
/*
字节流

输入字节流：
-----------| InputStream  所有输入字节流的基类  抽象类
-----------------| FileInputStream 读取文件数据的输入字节流
-----------------| BufferedInputStream  缓冲输入字符流       该类出现的目的是为了提高读取文件 数据的效率。 这个类其实只不过是在内部维护了一个8kb的字节数组而已。


输出字节流：
-----------| OutputStream 所有输出字节流的基类。  抽象类。
----------------| FileOutputStream 向文件输出数据的输出字节流  
----------------| BufferedOutputStream 缓冲输出字节流   该类出现的目的也是为了提高向文件写数据的效率。 这个类的也只不过是在内部维护了一个8kb的字节数组而已。

字符流 :  字符流 = 字节流  + 编码（解码）

输入字符流:
---------| Reader   所有输入字符流的基类。  抽象类。
----------------| FileReader 读取文件数据的输入字符流。 
----------------| BufferedReader 缓冲输入字符流           该类出现的目的是为了提高读取文件数据的效率与拓展FileReader的(readLine)功能。  这个类的也只不过是在内部维护了一个8kb的字符数组而已。


输出字符流:
---------| Writer 所有输出字符流的基类。  抽象类
----------------| FileWriter 向文件输出数据的输出字符流  
----------------| BufferedWriter 缓冲输出字符流        该类出现的目的是为了提高写文件数据的效率与拓展FileWriter的(newLine)功能.

 */
public class _09BufferedWriter {
	public static void main(String[] args) throws IOException {
		//找到目标文件
				File file = new File("F:\\a.txt");
				//建立数据的输出通道
				FileWriter fileWriter = new FileWriter(file,true);
				//建立缓冲输出流对象
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); 
				//写出数据
//				bufferedWriter.newLine(); //newLine() 换行。 实际上就是想文件输出\r\n.
				bufferedWriter.write("\r\n");
				bufferedWriter.write("前sdgasd！！");
				//关闭资源
				bufferedWriter.flush();
//				bufferedWriter.close();
				
	}

}
