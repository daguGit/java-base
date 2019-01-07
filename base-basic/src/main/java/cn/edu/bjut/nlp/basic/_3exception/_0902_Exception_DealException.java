package cn.edu.bjut.nlp.basic._3exception;
/*


疑问： 下面的信息是通过printStackTrace方法打印出来，那么异常对象从何而来呢？ 
	Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo10.div(Demo10.java:10)
        at Demo10.main(Demo10.java:5)
	
jvm运行到a/b这个语句的时候，发现b为0，除数为0在我们现实生活中是属于
不正常的情况，jvm一旦发现了这种不正常的情况时候，那么jvm就会马上创建
一个对应的异常对象，并且会调用这个异常对象 的printStackTrace的方法来处理。


异常的处理：

	 方式一：捕获处理

	  捕获处理的格式：
			
			try{
				可能发生异常的代码；

			}catch(捕获的异常类型 变量名){
				处理异常的代码....
			}
	
		
		捕获处理要注意的细节：
			1. 如果try块中代码出了异常经过了处理之后，那么try-catch块外面的代码可以正常执行。
			2. 如果try块中出了异常的代码，那么在try块中出现异常代码后面的代码是不会执行了。
			3. 一个try块后面是可以跟有多个catch块的，也就是一个try块可以捕获多种异常的类型。
			4. 一个try块可以捕获多种异常的类型,但是捕获的异常类型必须从小到大进行捕获，否则编译报错。


疑问一 : 异常的处理感觉没有多大作用，因为都是输出一个话而已?

疑问二： 以后捕获处理 的时候是否就是捕获Exception即可？
	错的，因为我们在现实开发中遇到不同的异常类型的时候，我往往会有不同 的处理方式。
	所以要分开不同的异常类型处理。
		异常的处理方式----抛出处理
	
          方式二：抛出处理（throw throws）


		抛出处理要注意的细节：
			1. 如果一个方法的内部抛出了一个异常 对象，那么必须要在方法上声明抛出。
			2. 如果调用了一个声明抛出异常 的方法，那么调用者必须要处理异常。
			3. 如果一个方法内部抛出了一个异常对象，那么throw语句后面的代码都不会再执行了（一个方法遇到了throw关键字，该方法也会马上停止执行的）。
			4. 在一种情况下，只能抛出一种类型异常对象。
		
		throw 与throws两个关键字：
			1. throw关键字是用于方法内部的，throws是用于方法声声明上的。
			2. throw关键字是用于方法内部抛出一个异常对象的，throws关键字是用于在方法声明上声明抛出异常类型的。
			3. throw关常对象，键字后面只能有一个异throws后面一次可以声明抛出多种类型的 异常。
		
		
		疑问：何时使用抛出处理？何时捕获处理？原则是如何？
			如果你需要通知到调用者，你代码出了问题，那么这时候就使用抛出处理.
			如果代码是直接与用户打交道遇到了异常千万不要再抛，再抛的话，就给了用户了。
			这时候就应该使用捕获处理。

*/
public class _0902_Exception_DealException {

	public static void main(String[] args) throws Exception {
		int[] arr = null;
		_0902_Exception_DealException deal = new _0902_Exception_DealException();
		deal.test(4,0,arr);
		deal.test2(4, 0, arr);

	}
	//处理方式一
	public void test(int a,int b,int[] arr){
		int c = 0;
		try {
			c = a/b;
		} catch (ArithmeticException e) {
			//处理异常的代码....
			System.out.println("异常处理了....");
			System.out.println(e.toString());
		}catch(NullPointerException e){
			System.out.println("出现了空指针异常....");
		}catch(Exception e){  
			System.out.println("我是急诊室，包治百病！");
		}
	
		System.out.println("c="+c);
		
	}
	//处理方式二
	
	public void test2(int a,int b,int[] arr) throws NullPointerException,Exception{
		if (b == 0) {
			throw new Exception();
		}else if (arr == null) {
			throw new NullPointerException();
		}
		int c = a/b;
		System.out.println("c="+c);
	}
}
