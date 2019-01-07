package cn.edu.bjut.nlp.io._01File;
import java.io.File;

/*
路径问题： 

绝对路径： 该文件在硬盘上 的完整路径。绝对路径一般都是以盘符开头的。

相对路径:  相对路径就是资源文件相对于当前程序所在的路径。

 . 当前路径
 .. 上一级路径
 
注意： 如果程序当前所在的路径与资源文件不是在同一个盘下面，是没法写相对路径 的。

*/
public class _02FilePath {
	public static void main(String[] args) {
		File file = new File(".");
		System.out.println(file.getAbsolutePath());
		File file2 = new File("../../code_txt");
		System.out.println(file2.exists());
	}

}
