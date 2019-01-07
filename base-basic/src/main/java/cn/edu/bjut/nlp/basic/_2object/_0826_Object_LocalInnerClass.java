package cn.edu.bjut.nlp.basic._2object;
/*
局部内部类： 在一个类 的方法内部定义另外一个类，那么另外一个类就称作为局部内部类。

局部内部类要注意的细节：
	1. 如果局部 内部类访问了一个局部变量，那么该局部变量必须使用final修饰、



*/
class  Outer1{

	String name= "外部类的name";

	public void test(){
		//局部变量
		final	int y =100;  // y 什么时候从内存中消失？ 方法执行完毕之后y消失。

		//局部内部类
		class Inner{     /*
							当test方法执行完毕之后，那么y马上从内存中消失，而Inner对象在方法
							执行完毕的时候还没有从内存中消失，而inner对象的print方法还在访问着
							y变量，这时候的y变量已经消失了，那么就给人感觉y的生命变量已经被延长了
							.

							解决方案： 如果一个局部内部类访问一个局部变量的时候，那么就让该局部内部类
							访问这个局部 变量 的复制品。我了保证复制品中间一模一样，致使用final修饰				
						*/
			int x = 10;

			public void print(){
				System.out.println("这个是局部内部类的print方法.."+y);
			}	
		}
		
		Inner inner = new Inner();  //这个inner对象什么时候消失？  Inner对象的生命周期比局部变量y的生命周期要长。
		inner.print();
	}

}



public class _0826_Object_LocalInnerClass {
	public static void main(String[] args) 
	{
		Outer1 outer = new Outer1();
		outer.test();
	}
}
