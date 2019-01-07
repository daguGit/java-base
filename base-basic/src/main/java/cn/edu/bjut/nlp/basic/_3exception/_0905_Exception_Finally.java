package cn.edu.bjut.nlp.basic._3exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 finally 块；

 finally块的 使用前提是必须要存在try块才能使用。

 finally块的代码在任何情况下都会执行的，除了jvm退出的情况。

 finally非常适合做资源释放的工作，这样子可以保证资源文件在任何情况下都 会被释放。



 try块的三种组合方式：


 第一种： 比较适用于有异常要处理，但是没有资源要释放的。
 try{

 可能发生异常的代码

 }catch(捕获的异常类型 变量名){
 处理异常的代码
 }

 第二种：比较适用于既有异常要处理又要释放资源的代码。

 try{

 可能发生异常的代码

 }catch(捕获的异常类型 变量名){
 处理异常的代码
 }finally{ 
 释放资源的代码;
 }

 第三种： 比较适用于内部抛出的是运行时异常，并且有资源要被释放。
 try{

 可能发生异常的代码

 }finally{ 
 释放资源的代码;
 }

 */

public class _0905_Exception_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = null;
		//test2(4, 0, arr);
		test3();
	}

	public static void test2(int a, int b, int[] arr) {
		int c = 0;

		try {
			if (b == 0) {
				System.exit(0);//finally块的代码在任何情况下都会执行的，除了jvm退出的情况。
			}
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println("error");

		} finally {
			System.out.println("deal finally");
		}

		System.out.println("c=" + c);
	}
	//本函数是对finally的练习
	public static void test3(){
		File file = new File("e:/a.txt");
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(file);
			char[] buf = new char[1024];
			int length = fileReader.read(buf);
			System.out.println(new String(buf,0,length));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fileReader.close();
				System.out.println("释放资源文件成功....");
			}catch(IOException e){
				System.out.println("释放资源文件失败....");
			}
		}
		
	}
}
