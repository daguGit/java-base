package cn.edu.bjut.nlp.io._02Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _02OutputStreamTest_CopyPhoto {

	public static void main(String[] args) throws IOException {
		File inputFile = new File(
				"C://Users//Public//Pictures//Sample Pictures//3.jpg");
		File outputFile = new File("F://girl.jpg");
		
		FileInputStream inputStream = new FileInputStream(inputFile);
		FileOutputStream outputStream = new FileOutputStream(outputFile,true);
		byte[] buf = new byte[1024 *3];
		int length;
		long starTime = System.currentTimeMillis();
		//每新创建一个FileOutputStream的时候，默认情况下FileOutputStream 的指针是指向了文件的开始的位置。 每写出一次，指向都会出现相应移动。
				//建立缓冲数据，边读边写
		//只有个new outputStream的时候光标才放到开始位置
		while ((length = inputStream.read(buf)) != -1) {
				outputStream.write(buf,0,length);
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime -starTime);
		inputStream.close();
		outputStream.close();
	}

}
