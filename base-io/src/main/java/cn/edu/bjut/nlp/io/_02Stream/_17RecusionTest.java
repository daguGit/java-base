package cn.edu.bjut.nlp.io._02Stream;

import java.io.File;

public class _17RecusionTest {

	// 列出一个文件夹的子孙文件与目录。
	public void list(File file) {
		if (file.isFile()) {
			System.out.println(file.getName());
		} else {
			System.out.println(file.getName());
			File[] files = file.listFiles();
			for (File file1 : files) {
				list(file1);
			}
		}

	}

	public void list2(File file, String s) {
		if (file.isFile()) {
			System.out.println(s + file.getName());
		} else {
			System.out.println(s + file.getName());
			File[] files = file.listFiles();
			for (File file1 : files) {
				list2(file1, s + "-----");
			}
		}

	}

	public void list3(File file, String s) {
		if (file.isFile()) {
			System.out.println(s + file.getName());
		} else {
			System.out.println(s + file.getName());
			File[] files = file.listFiles();
			for (File file1 : files) {
				list3(file1, "|   " + s);
			}
		}

	}

	// 列出一个文件夹的子孙文件与目录。teacher's
	public  void listFiles3(File dir, String space) { // space 存储的是空格
		File[] files = dir.listFiles(); // 列出所有 的子文件
		for (File file : files) {
			if (file.isFile()) {
				System.out.println(space + file.getName());
			} else if (file.isDirectory()) {
				System.out.println(space + file.getName());
				listFiles3(file, "|   " + space);
			}

		}

	}

	// 删除了一个非空的目录
	public  void deleteDir(File dir) { // bb
		File[] files = dir.listFiles(); // 列出了所有的子文件
		for (File file : files) {
			if (file.isFile()) {
				file.delete();
			} else if (file.isDirectory()) {
				deleteDir(file);
			}
		}
		dir.delete();
	}

	public static void main(String[] args) {
		// new _17RecusionTest().list3(new File("F://360Downloads"),"|--");
		new _17RecusionTest().listFiles3(new File("F://360Downloads"), "|--");
		// new _17RecusionTest().list2(new File("F://music"),"");
		// new _17RecusionTest().list3(new File("F://music"),"|--");
		// new _17RecusionTest().test();
	}

}
