package cn.edu.bjut.nlp.basic._1basic;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
转义字符：特殊字符使用”\”把其转化成字符的本身输出，那么使用”\”的字符称作为转移字符。

需求： 在控制台上打印一个 hello" world 

常见的转义字符有：
	\b	Backspace （退格键）
	\t	Tab    制表符(制表符的作用就是为了让一列对齐)  一个tab一般等于四个空格。
	
	\n	换行
	\r	回车  把光标移动到一行的首位置上。
	
注意： 如果是在windows系统上操作文件的时候需要换行，是需要\r\n一起使用的。
如果是在其他的操作系统上需要换行，仅需要\n即可。

*/
public class _0507_Statement_ForEscapeCharactor {
	public static void main(String[] args) throws IOException{
		String pathname = "E:/a.txt";
		File file = new  File(pathname);
		FileWriter writer = new FileWriter(file);
		writer.write("nihaoa\r\n");
		writer.write("xxxxxxxxxxxxxxx");
		writer.close();
	}
}
