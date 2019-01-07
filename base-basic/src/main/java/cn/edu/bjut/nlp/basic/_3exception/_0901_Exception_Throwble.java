package cn.edu.bjut.nlp.basic._3exception;
/*
异常：

我们的java程序也是会存在某些不正常 的情况的，这些不正常的 情况我们就统称异常。


异常体系：
--------| Throwable
------------| Error
------------| Exception


Throwable常用的方法：
	toString()  返回当前异常对象的完整类名+病态信息。
	getMessage() 返回的是创建Throwable传入的字符串信息。
	printStackTrace() 打印异常的栈信息。
*/
/*
异常的体系：
----------| Throwable  所以异常或者错误类的超类
--------------|Error  错误   错误一般是用于jvm或者是硬件引发的问题，所以我们一般不会通过代码去处理错误的。
--------------|Exception 异常   是需要通过代码去处理的。

如何区分错误与异常呢：
	如果程序出现了不正常的信息，如果不正常的信息的类名是以Error结尾的，那么肯定是一个错误。
	如果是以Exception结尾的，那么肯定就是一个异常。


*/
public class _0901_Exception_Throwble {
	public static void main(String[] args){
		Throwable throwable = new Throwable("头疼");
		String info = throwable.toString();
		System.out.println(info);// java.lang.Throwable  包名+类名 = 完整类名
		String message = throwable.getMessage();
		throwable.printStackTrace();
	}
}
