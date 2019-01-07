package cn.edu.bjut.nlp.io._02Stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
输出字符流:

------| Writer 输出字符流的基类。 抽象类
-----------| FileWriter 向文件数据数据的输出字符流

FileWriter的使用步骤：
	1. 找到目标文件。
	2. 建立数据输出通道
	3. 写出数据。
	4. 关闭资源
	
FileWriter要注意的事项：
	1. 使用FileWriter写数据的时候，FileWriter内部是维护了一个1024个字符数组的，写数据的时候会先写入到它内部维护的字符数组中，如果需要
	把数据真正写到硬盘上，需要调用flush或者是close方法或者是填满了内部的字符数组。
	2. 使用FileWriter的时候，如果目标文件不存在，那么会自动创建目标文件。
	3.使用FileWriter的时候， 如果目标文件已经存在了，那么默认情况会先情况文件中的数据，然后再写入数据 ， 如果需要在原来的基础上追加数据，
	需要使用“new FileWriter(File , boolean)”的构造方法，第二参数为true。
	

练习： 使用字符流拷贝一个文本文件(java文件). 
接着使用字符流拷贝一个图片（观察图片的大小变化，思考为什么会这样子??）
数据会丢失，因为编码在码表中找不到对应的字符，就会返回未知字符对应的数字，这个未知字符只占一个字节（而本身占两个字节，故导致数据丢失）。
 */
/*
何时使用字符流，何时使用字节流？依据是什么？

	使用字符流的应用场景： 如果是读写字符数据的时候则使用字符流。
	使用字节流的应用场景： 如果读写的数据都不需要转换成字符的时候，则使用字节流。 
 
 */
public class _07Writer {

	public static void main(String[] args) throws IOException {
		//找到目标文件
				File file = new File("F:\\a.txt");
				//建立数据输出通道
				FileWriter fileWriter = new FileWriter(file,true);
				//准备数据，把数据写出
				String data = "今天天气非常好！！";
				fileWriter.write(data);  //字符流具备解码的功能。
				//刷新字符流
//				fileWriter.flush();
				//关闭资源
				fileWriter.close();
				
				new _07Writer().copyPhoto();
				

	}
	public void copyPhoto() throws IOException{
		File inputFile = new File(
				"C://Users//Public//Pictures//Sample Pictures//3.jpg");
		File outputFile = new File("F://girl.txt");
		
		FileReader reader = new FileReader(inputFile);
		FileWriter writer = new FileWriter(outputFile);
		char [] buf = new char[1024 *3];
		int length;
		long starTime = System.currentTimeMillis();
		
		while ((length = reader.read(buf)) != -1) {
				writer.write(buf,0,length);
				System.out.println(new String(buf,0,length));
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime -starTime);
		reader.close();
		writer.close();
	}
	

}
