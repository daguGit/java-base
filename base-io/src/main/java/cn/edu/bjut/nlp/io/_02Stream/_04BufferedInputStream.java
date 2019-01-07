package cn.edu.bjut.nlp.io._02Stream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
/*
 我们清楚读取文件数据使用缓冲数组读取效率更高，sun也知道使用缓冲数组读取效率更高，那么
 这时候sun给我们提供了一个------缓冲输入字节流对象,让我们可以更高效率读取文件。


 输入字节流体系： 
 ----| InputStream  输入字节流的基类。 抽象
 ----------| FileInputStream 读取文件数据的输入字节流
 ----------| BufferedInputStream 缓冲输入字节流    缓冲输入字节流的出现主要是为了提高读取文件数据的效率。    
 其实该类内部只不过是维护了一个8kb的字节数组而已。 buffer是read从内存的8kb。
 建议使用自定义的buf数组，因为bufferedInput的数组还要判断fill，即是否要填充。

 注意： 凡是缓冲流都不具备读写文件的能力。

 使用BufferedInputStream的步骤	:
 1. 找到目标文件。
 2. 建立数据 的输入通道
 3. 建立缓冲 输入字节流流
 4. 关闭资源

 */
import java.io.FileInputStream;

public class _04BufferedInputStream {
	public static void main(String[] args) throws IOException {
		File file = new File("F://a.txt");
		FileInputStream inputStream = new FileInputStream(file);
		// 建立缓冲 输入字节流流。。凡是缓冲流都不具备读写文件的能力。所以传递inputstream
		BufferedInputStream bufferedIn = new BufferedInputStream(inputStream);
		int content = 0;
		//疑问二：BufferedInputStream出现 的目的是了提高读取文件的效率，但是BufferedInputStream的read方法每次读取一个字节的数据
		//而FileInputStreram每次也是读取一个字节的数据，那么BufferedInputStream效率高从何而来？
		//buffered的read方法读的是内存中的8kb不是硬盘
		while ((content = bufferedIn.read()) != -1) {
			System.out.println((char) content);
		}
		////调用BufferedInputStream的close方法实际上关闭的是FileinputStream.
		inputStream.close();//查看源码
	}

}
