package cn.edu.bjut.nlp.io._02Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 File类: 用于描述一个文件或者文件夹的。

 通过File对象我们可以读取文件或者文件夹的属性数据，如果我们需要读取文件的内容数据，那么我们需要使用IO流技术。

 IO流（Input Output）

 IO流解决问题： 解决设备与设备之间的数据传输问题。  内存--->硬盘   硬盘--->内存

 IO流技术：

 IO流分类：
 如果是按照数据的流向划分：

 输入流
 输出流
 判断使用输入输出流：以当前程序作为参照物，观察数据是流入还是流出。如果流出则使用输出流，如果数据是流入，则使用输出流。

 如果按照处理的单位划分：

 字节流: 字节流读取得都是文件中二进制数据，读取到二进制数据不会经过任何的处理。
 字符流： 字符流读取的数据是以字符为单位的 。 字符流也是读取文件中的二进制数据，不过会把这些二进制数据转换成我们能 识别的字符。  
 字符流 = 字节流 + 解码

 输入字节流：
 --------| InputStream 所有输入字节流的基类  抽象类
 ------------| FileInputStream  读取文件数据的输入字节流 

 使用FileInputStream读取文件数据的步骤：
 1. 找到目标文件
 2. 建立数据的输入通道。
 3. 读取文件中的数据。
 4. 关闭 资源.
 */
/*
 问题1： 读取完一个文件的数据的时候，我不关闭资源有什么影响?
 答案： 资源文件一旦 使用完毕应该马上释放，否则其他的程序无法对该资源文件进行其他 的操作。
 问题2：buf数组如果最后一次没有用完，是覆盖还是重置为0；
 	覆盖。所以创建字符串的时候要使用到0，length
 */
class ReadFile {
	// 读取的方式一缺陷： 无法读取完整一个文件 的数据.
	public void read1() throws IOException {
		// 找到目标文件
		File file = new File("F://a.txt");
		// 建立数据的输入通道。
		FileInputStream inputStream = new FileInputStream(file);
		// 读取文件中的数据。
		int content = inputStream.read();
		System.out.println(content);
		System.out.println((char) content);
		// 关闭 资源.
		inputStream.close();
	}

	// 方式2 ： 使用循环读取文件的数据
	public void read2() throws IOException {
		File file = new File("F://a.txt");
		FileInputStream inputStream = new FileInputStream(file);
		int content;
		while ((content = inputStream.read()) != -1) {
			System.out.println((char) content);
		}
		inputStream.close();
	}

	// 方式3：使用缓冲 数组 读取。 缺点： 无法读取完整一个文件的数据。
	public void read3() throws IOException {
		File file = new File("F://a.txt");
		FileInputStream inputStream = new FileInputStream(file);
		byte[] buf = new byte[10];//相当于超市里面的购物车。
		// 如果使用read读取数据传入字节数组，那么数据是存储到字节数组中的，而这时候read方法的返回值是表示的是本次读取了几个字节数据到字节数组中。
		int length = inputStream.read(buf); 
		//使用字节数组构建字符串
		System.out.println(new String(buf,0,length));
	}

	// 方式4：使用缓冲数组配合循环一起读取。
	public void read4() throws IOException {
		long startTime = System.currentTimeMillis();
		File file = new File("F://a.txt");
		FileInputStream inputStream = new FileInputStream(file);
		byte[] buf = new byte[20];
		int length;//保存每次读取到的字节个数。
		//存储读取到的数据    缓冲数组 的长度一般是1024的倍数，因为与计算机的处理单位。  理论上缓冲数组越大，效率越高
		while ((length = inputStream.read(buf)) != -1) {// read方法如果读取到了文件的末尾，那么会返回-1表示。
			System.out.println( new String(buf,0,length));
		}
		inputStream.close();
		long endTime = System.currentTimeMillis();
		System.out.println("Time: " +(endTime-startTime));//使用缓冲数组效率较高。
	}
}

public class _01InputStream {
	public static void main(String[] args) throws IOException {
		// new ReadFile().read1();
		 new ReadFile().read2();
		 new ReadFile().read4();
	}

}
