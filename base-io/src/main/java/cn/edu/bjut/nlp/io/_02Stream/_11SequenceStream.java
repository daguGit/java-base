package cn.edu.bjut.nlp.io._02Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

/*SequenceInputStream(序列流)

 需求：把a.txt与b.txt 文件的内容合并。*/
public class _11SequenceStream {
	
	//需求：把a.txt与b.txt 文件的内容合并。
	public void merge1() throws IOException {
		File file1 = new File("F://a.txt");
		File file2 = new File("F://b.txt");
		File file3 = new File("F://c.txt");
		FileInputStream inputStream1 = new FileInputStream(file1);
		FileInputStream inputStream2 = new FileInputStream(file2);
		FileOutputStream outputStream = new FileOutputStream(file3);
		
		ArrayList<FileInputStream> list = new ArrayList<FileInputStream>();
		list.add(inputStream1);
		list.add(inputStream2);
		
		byte[] buf = new byte[1024];
		int length;
		
		for (int i = 0; i < list.size(); i++) {
			FileInputStream inputStream = list.get(i);
			while ((length = inputStream.read(buf)) != -1) {
				outputStream.write(buf,0,length);
			}
			inputStream.close();
		}
		outputStream.close();

	}
//	使用SequenceInputStream合并文件。
	public void merge2() throws IOException{
		File file1 = new File("F://a.txt");
		File file2 = new File("F://b.txt");
		File file3 = new File("F://c.txt");
		FileInputStream inputStream1 = new FileInputStream(file1);
		FileInputStream inputStream2 = new FileInputStream(file2);
		FileOutputStream outputStream = new FileOutputStream(file3);
		SequenceInputStream sequence = new SequenceInputStream(inputStream1,inputStream2);
		byte[] buf = new byte[1024];
		int length;
		while ((length = sequence.read(buf)) != -1) {
			outputStream.write(buf,0,length);
		}
		sequence.close();
		outputStream.close();
	}
	//把三个文件合并成一个文件
		public  void merge3() throws IOException{
			//找到目标文件
			File file1 = new File("F:\\a.txt");
			File file2 = new File("F:\\b.txt");
			File file3 = new File("F:\\c.txt");
			File file4 = new File("F:\\d.txt");
			
			
			//建立对应 的输入输出流对象
			FileOutputStream fileOutputStream = new FileOutputStream(file4);
			FileInputStream fileInputStream1 = new FileInputStream(file1);
			FileInputStream fileInputStream2 = new FileInputStream(file2);
			FileInputStream fileInputStream3 = new FileInputStream(file3);
			
			//创建序列流对象
			Vector<FileInputStream> vector = new Vector<FileInputStream>();
			vector.add(fileInputStream1);
			vector.add(fileInputStream2);
			vector.add(fileInputStream3);
			Enumeration<FileInputStream> e = vector.elements();

			SequenceInputStream sequence = new SequenceInputStream(e);
			byte[] buf = new byte[1024];
			int length;
			while ((length = sequence.read(buf)) != -1) {
				fileOutputStream.write(buf,0,length);
			}
			//关闭资源
			sequence.close();
			fileOutputStream.close();
		}
	public static void main(String[] args) throws IOException {
		new _11SequenceStream().merge3();
	}

}
