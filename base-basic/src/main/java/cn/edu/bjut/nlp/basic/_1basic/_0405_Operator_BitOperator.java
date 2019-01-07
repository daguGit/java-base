package cn.edu.bjut.nlp.basic._1basic;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
位运算符：位运算符就是直接操作二进制位的。
	& (与)
	| (或)
	^ (异或)
规律： 如果操作数A连续异或同一个操作数两次，那么结果还是操作数A。

应用： 对数据加密.


	~  (取反)

*/
public class _0405_Operator_BitOperator {
	public static void main(String[] args) throws Exception {
		/*System.out.println(6&3);
		System.out.println(6|3);
		System.out.println(6^3);
		System.out.println(6^3^3);//如果操作数A连续异或同一个操作数两次，那么结果还是操作数A。
		System.out.println(~7);*/
		new _0405_Operator_BitOperator().imageTest();
	}
	
	public void imageTest() throws IOException
	{
		String inputPath = "C:/Users/Public/Pictures/Sample Pictures/1.jpg";
		String outputPath = "C:/Users/Public/Pictures/Sample Pictures/2.jpg";
		String outputPath2 = "C:/Users/Public/Pictures/Sample Pictures/3.jpg";
		
		//File inputFile = new File(inputPath);
		File inputFile = new File(outputPath);
		File outputFile = new File(outputPath2);
		
		FileInputStream inputStream = new FileInputStream(inputFile);
		FileOutputStream outputStream = new FileOutputStream(outputFile);
		int content = 0;
		while ((content = inputStream.read())!=-1) {
		 outputStream.write(content^12);
		}
		inputStream.close();
		outputStream.close();
	}
	public void exam(){
		/*
		位运算符可能会出现的笔试题目：
			1. 交换两个变量的值,不准出现第三方变量。

			2. 取出一个二进制数据的指定位数。要求读取该二进制数据的低4位
					00000000-00000000-00010100-01001101
				&   00000000-00000000-00000000-00001111
				------------------------------------------
					00000000-00000000-00000000-00001101
		*/
		int a = 3;
		int b = 5;
		
		/*int temp ;
		temp = a;
		a = b;
		b = temp;*/
		
		/*
		 //int 相加可能超出最大值
		 a = a + b;
		b = a - b;
		a = a - b;*/
		// 逻辑不清晰
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
	}
}
