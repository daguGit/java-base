package cn.edu.bjut.nlp.io._02Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class _11SequenceStreamTest {
	public void cut() throws IOException {
		File file1 = new File("F:\\A-Lin.mp3");
		File file2 = new File("F:\\music");
		FileInputStream inputStream = new FileInputStream(file1);
		FileOutputStream outputStream;
		byte[] buf = new byte[1024 * 1014];
		int length;
		for (int i = 0; (length = inputStream.read(buf)) != -1; i++) {
			outputStream = new FileOutputStream(new File(file2, "part" + i
					+ ".mp3"));
			outputStream.write(buf, 0, length);
			outputStream.close();
		}
		inputStream.close();

	}

	public void merge() throws IOException {
		File file = new File("F:\\music");
		File[] files = file.listFiles();
		//通过目标文件夹找到所有的MP3文件，然后把所有的MP3文件添加到vector中。
		Vector<FileInputStream> vector = new Vector<FileInputStream>();
		// 建立文件的输出通道

		for (int i = 0; i < files.length; i++) {
			if (files[i].getName().endsWith(".mp3")) {
				vector.add(new FileInputStream(files[i]));
			}
		}
		//通过Vector获取迭代器
		Enumeration<FileInputStream> e = vector.elements();
		//创建序列流
		SequenceInputStream sequence = new SequenceInputStream(e);

		byte[] buf = new byte[1024];
		int length;
		FileOutputStream fileOutputStream = new FileOutputStream(
				"F:\\music\\合并.mp3");
		while ((length = sequence.read(buf)) != -1) {
			fileOutputStream.write(buf, 0, length);
		}
		sequence.close();
		fileOutputStream.close();
	}

	public static void main(String[] args) throws IOException {
		// new _11SequenceStreamTest().cut();
		new _11SequenceStreamTest().merge();

	}
}
