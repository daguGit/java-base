package cn.edu.bjut.nlp.basic._1basic;
/*
在现实生活中有很多数据是经常会发生变化 的。
比如： 天气 、 心情 、  时间、 股市...

变量： 变量就是在程序运行过程中其值可以发生变化的量.

变量就是一个存储数据的容器。

容器具备什么特点：
	1. 容量(大小)。
	2. 存储一定格式的数据。
	3. 名字.

声明（定义）一个变量的格式：
	
	容量  变量名字 = 数据。 
	

变量名的命名规范： 首单词小写，其他单词首字母大写，其他小写。

java表示一个变量的容量多大是使用了数据类型描述的。

在java中 的数据类型主要有两种数据类型
	基本数据类型

	引用数据类型

java中的八种基本数据类型：
	整数的数据类型：
		byte(字节)      8位（bit）  2^8 = 256    -128~127
		short(短整型)   16bit       2^16 = 65536
		int(整型)       32bit 
		long(长整型)    64bit        2^64 = 

	注意： 如果一个整数没有加上任何的标识的时候，那么默认是int类型的数据。
	如果需要把该数据表示成一个long类型的数据，那么需要加数据后面加上L表示，L是不区分大小写的，但是建议使用大写。
	
	疑惑：存储整数可以使用四种数据类型，那么具体怎么选择使用呢？

	选用数据类型的原则： 在能满足需求的情况下，能小就小。节省内存空间。


	小数的数据类型：
		float(单精度浮点型)    32bit 保留7位

		double(双精度浮点型)   64bit 保留15位
	
	注意： 如果一个小数没有加上任何标识的时候，那么该小数默认是double类型的数据，如果
	需要表示成float类型，那么需要在小数的后面加上f表示。f不区分大小写的。

	
	布尔类型： 布尔类型只有两个 值，true或者false。
	
		boolean    1字节或者4个字节   
	
	如果使用boolean声明一个基本类型的变量时，那么该变量占4个字节，
	如果使用boolean声明一个数组类型 的时候，那么每个数组的元素占
	一个字节。
	

	字符类型：
		char  2字节（16bit）	
	
		
八种基本数据类型：
	整数：byte short int long 
	小数： float double 
	布尔： boolean 
	字符： char

字符串的数据类型是：String 引用数据类型,不属于基本数据类型。

*/
/*
声明变量的方式：

	声明变量的方式一：
			
			数据类型 变量名;
				
	声明变量的方式二： 一次性声明了多个相同类型变量
	
			数据类型  变量名1 ， 变量2....

注意：
	1. 变量是必须先声明再使用。
	2. 在一个作用域中不能声明同名 的变量。


*/
public class _0302_Variant_VariantIdentify {
	public static void main(String[] args){
		byte age = 12;
		System.out.println(age);
		short money =128;
		System.out.println(money);
	
		int bossMoney = 1000000000;

				
		long  allMoney = 10000000000000000L;
			

			
		float f = 3.14f;

		double d = 3.1415926537;

		boolean b = false;
		char flag = 'b';
		String string = "String";
		
	}

}
