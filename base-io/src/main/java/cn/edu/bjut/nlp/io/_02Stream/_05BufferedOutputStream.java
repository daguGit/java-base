package cn.edu.bjut.nlp.io._02Stream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
输出字节流
--------| OutputStream  所有输出字节流的基类  抽象类
------------| FileOutputStream 向文件 输出数据 的输出字节流
------------| Bufferedoutputstream  缓冲输出字节流    BufferedOutputStream出现的目的是为了提高写数据的效率。 
        						内部也是维护了一个8kb的字节数组而已。
 
 使用BufferedOutputStream的步骤：
 	1. 找到目标文件
 	2. 建立数据的输出通道
 
BufferedOutputStream 要注意的细节
	1. 使用BufferedOutStream写数据的时候，它的write方法是是先把数据写到它内部维护的字节数组中。
 	2. 使用BufferedOutStream写数据的时候，它的write方法是是先把数据写到它内部维护的字节数组中，如果需要把数据真正的写到硬盘上面，需要
 	调用flush方法或者是close方法、 或者是内部维护的字节数组已经填满数据的时候。
 
 */
public class _05BufferedOutputStream {
	public static void main(String[] args) throws IOException {
		File file = new File("F://a.txt");
		//建立数据的输出通道
		FileOutputStream outputStream = new FileOutputStream(file,true);
		//建立缓冲输出字节流对象
		BufferedOutputStream buffered = new BufferedOutputStream(outputStream);
		/*它的write方法是是先把数据写到它内部维护的字节数组中，如果需要把数据真正的写到硬盘上面，需要
	 	调用flush方法或者是close方法、 或者是内部维护的字节数组已经填满数据的时候。*/
		buffered.write("append words".getBytes());//注意此时有文件，但文件里还没有要加入的内容
		//把缓冲数组中内部的数据写到硬盘上面。
		//buffered.flush();
		buffered.close();
		
	}

}
