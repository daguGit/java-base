package cn.edu.bjut.nlp.io._02Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _03StreamException {

	public void copyPhoto() {
		File inputFile = new File(
				"C://Users//Public//Pictures//Sample Pictures//3.jpg");
		File outputFile = new File("F://girl.jpg");

		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		byte[] buf = new byte[1024 * 3];
		int length;
		try {
			inputStream = new FileInputStream(inputFile);
			outputStream = new FileOutputStream(outputFile, true);

			// 每新创建一个FileOutputStream的时候，默认情况下FileOutputStream 的指针是指向了文件的开始的位置。
			// 每写出一次，指向都会出现相应移动。
			// 建立缓冲数据，边读边写
			// 只有个new outputStream的时候光标才放到开始位置

			while ((length = inputStream.read(buf)) != -1) {
				outputStream.write(buf, 0, length);
			}
		} catch (IOException e) {
			System.out.println("lose...");
			throw new RuntimeException(e);
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
				System.out.println("lllllose");
			} finally {
				try {
					if (outputStream != null) {
						outputStream.close();
					}
				} catch (IOException e2) {
					System.out.println("lllloosose");
					throw new RuntimeException(e2);
				}
			}
		}
	}

	public void dealException() {
		File file = new File("F://a.txt");
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);

			byte[] buf = new byte[20];
			int length;// 保存每次读取到的字节个数。
			// 存储读取到的数据 缓冲数组 的长度一般是1024的倍数，因为与计算机的处理单位。 理论上缓冲数组越大，效率越高
			while ((length = inputStream.read(buf)) != -1) {// read方法如果读取到了文件的末尾，那么会返回-1表示。
				System.out.println(new String(buf, 0, length));
			}
		} catch (IOException e) {
			/*
			 * //处理的代码... 首先你要阻止后面的代码执行,而且要需要通知调用者这里出错了... throw new
			 * RuntimeException(e);
			 * //把IOException传递给RuntimeException包装一层，然后再抛出，这样子做的目的是
			 * 为了让调用者使用变得更加灵活。
			 */
			System.out.println("IOException");
			throw new RuntimeException(e);
		} finally {
			try {
				if (inputStream != null)
					inputStream.close();
				System.out.println("关闭资源成功...");
			} catch (IOException e) {
				System.out.println("关闭资源失败...");
				throw new RuntimeException(e);
			}
		}
	}

	public static void main(String[] args) {
		new _03StreamException().copyPhoto();
		new _03StreamException().dealException();
	}

}
