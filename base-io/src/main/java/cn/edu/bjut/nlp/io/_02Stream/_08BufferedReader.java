package cn.edu.bjut.nlp.io._02Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 输入字符流:
 -------| Reader 所有输入字符流的基类。 抽象类
 ----------| FileReader 读取文件字符串的输入字符流。
 ----------| BufferedReader   
 缓冲输入字符流  。 缓冲 输入字符流出现的目的是为了提高读取文件 的效率和拓展了FileReader的功能。 
 其实该类内部也是维护了一个字符数组

 记住：缓冲流都不具备读写文件的能力。

 BufferedReader的使用步骤：
 1.找到目标文件
 2 .建立数据的输入通道。

 */
public class _08BufferedReader {
	public void read() throws IOException{
		File file = new File("F://a.txt");
		FileReader reader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(reader);
		/*int content = 0;
		while((content = bufferedReader.read()) != -1){ 
			//读到了一个字符。 读取到的字符肯定也是从Bufferedreader内部的字符数组中获取的到。所以效率高。
			System.out.println((char)content);
		}*/
		String line =  null;
		while((line = bufferedReader.readLine())!=null){ // 虽然readLine每次读取一行数据，但是但会的line是不包含\r\n的、
			System.out.print(line);
		}
		//关闭资源
		bufferedReader.close();
		
		
	}
	
	public static String myReadline(FileReader fileReader) throws IOException{
		 //StringBuilder主要是用于存储读取到的数据
		StringBuilder stringBuilder = new StringBuilder();
		int content;
		while((content = fileReader.read())!= -1){
			if (content=='\r') {
				continue;
			}else if (content == '\n') {
				break;
			}else {
				//普通字符
				stringBuilder.append((char)content);
			}
		}
		//代表已经读取完毕了。
		if (content == -1) {
			return null;
		}else{
			return stringBuilder.toString();
		}
	}
	public static void main(String[] args) throws IOException {
		//new _08BufferedReader().read();
		File file  = new File("F://a.txt");
		//建立数据的输入通道。
		FileReader fileReader = new FileReader(file);
		String line ;
		
		while((line = myReadline(fileReader))!=null){
			System.out.println(line);
		}

	}
}
