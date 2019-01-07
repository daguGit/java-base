
package cn.edu.bjut.nlp.io._02Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class _06Reader_Pre {

	public void readFile() throws IOException{
		File file = new File("F://a.txt");
		FileInputStream inputStream = new FileInputStream(file);
		int content;
		/*while((content = inputStream.read())!=-1){ 
		     //出现乱码的原因： 一个中文在gbk码表中默认是占两个字节，
			   // 目前你只读取了一个字节而已，所以不是一个完整的中文。
			System.out.print((char)content);
		}*/
		/*byte[] buf =  new byte[2];
		while((content = inputStream.read(buf))!= -1){
			
			System.out.println(buf.toString());//hash value
			System.out.println(Arrays.toString(buf));//[ , ] [ , ] [ , ]
			
			System.out.println(new String(buf));//我爱你中华------------String类具有解码功能
			//new String（byte[]）通过使用平台默认字符集解码指定的byte数组，构造一个新的String。
			//通过这种方式，字节流可以读取中文，但是字节数组可能最后位置不能正好读完一个中文字符，所以仍然会产生乱码。
		}*/
		inputStream.close();
	}
	public void writeFile() throws IOException{
		File file = new File("F://a.txt");
		FileOutputStream outputStream = new FileOutputStream(file);
		byte[] buf = "我爱你中华".getBytes();
		System.out.println("输出的内容："+ Arrays.toString(buf));
		outputStream.write(buf);
		outputStream.close();
	}
	public static void main(String[] args) throws IOException {
		// 使用了fileoutputStream则默认使用GBK码表
		_06Reader_Pre reader = new _06Reader_Pre();
		//reader.writeFile();
		reader.readFile();
		
		
		
		
	}

}
