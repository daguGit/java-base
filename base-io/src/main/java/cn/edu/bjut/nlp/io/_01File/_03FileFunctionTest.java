package cn.edu.bjut.nlp.io._01File;
import java.io.File;
import java.io.FilenameFilter;

/*
 需求1 ：  指定一个文件夹，然后该文件夹下面所有java文件。

 需求2： 指定一个文件夹，然后列出文件夹下面的所有子文件与文件夹，但是格式要如下:

 文件：
 文件名1
 文件名2
 文件名3
 ..

 文件夹：
 文件夹名1
 文件夹名2
 文件夹名3
 ....
 */

//自定义一个文件名过滤器
class MyFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		// System.out.println("文件夹:"+dir+" 文件名："+ name);
		return name.endsWith(".java");
	}

}

public class _03FileFunctionTest {

	public static void main(String[] args) {
		// 需求1 ： 指定一个文件夹，然后该文件夹下面所有java文件。
		File file2 = new File("D://Czbk//code_txt//test//src//_1basic");
		for (File file : file2.listFiles()) {
			if (file.getName().endsWith(".java") && file.isFile()) {
				// if(fileName.matches(".+\\.java")&&file.isFile()){
				System.out.println(file.getName());
			}
		}

		// 使用过滤器
		File[] files = file2.listFiles(new MyFilter()); // 得到文件夹下面的所有子文件与文件夹。
		for (File file : files) {
			System.out.println(file.getName());
		}

		// 需求2： 指定一个文件夹，然后列出文件夹下面的所有子文件与文件夹，但是格式要如下:
		File file = new File("F://");
		System.out.println("wenjian");
		for (File f1 : file.listFiles()) {
			if (f1.isFile()) {
				System.out.println("	" + f1);
			}
		}
		System.out.println("wenjianjia");
		for (File f2 : file.listFiles()) {
			if (!f2.isFile()) {
				System.out.println("		" + f2);
			}
		}

	}

}
