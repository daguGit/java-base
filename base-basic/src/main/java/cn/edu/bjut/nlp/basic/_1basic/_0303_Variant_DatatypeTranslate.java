package cn.edu.bjut.nlp.basic._1basic;
/*
数据类型转换： 
	
	小数据类型-------->大数据类型     自动类型转换

	
	大数据类型--------->小数据类型    强制类型转换

	强制类型转换的格式：
			
			小数据类型  变量名 = (小数据类型)大数据类型
	
数据类型转换要注意的细节：
	1. 凡是byte、short 、 char数据类型数据在运算的时候都会自动转换成int类型的数据再运算。
	2. 两个不同数据类型的数据在运算的时候，结果取决于大的数据类型。

*/
public class _0303_Variant_DatatypeTranslate {
	public static void main(String[] args){

		/*
			byte  b=  11;   // 一个字节   一两碗
			short s = b; // 把b变量存储的值赋予给s变量。 2字节 二两的碗
			int i = s;   // i是4字节
			long l = i;  // l 是8个字节。 
			System.out.println(l);
		*/
		int i1 = 128;
		byte b = (byte) i1;
		System.out.println(b);
		
		//如果是负数，那么最高位肯定是1， 正数的二进制位的最高位是0。
		System.out.println(Integer.toBinaryString(-7));  //sun给我们提供一个功能 Integer.tobinaryString()  查看一个数据的二进制数据形式的。
				//   11111001（补码）
		//凡是byte、short 、 char数据类型数据在运算的时候都会自动转换成int类型的数据再运算。
		 byte a = 1;
		 byte d = 2;
		 byte c = (byte) (a + d);
		
		 System.out.println('a'+1);
		 
		 //两个不同数据类型的数据在运算的时候，结果取决于大的数据类型。
		 int i2 =10;
		 long l = 20;
		 i2 = (int) (i2 +l);
		 System.out.println(i2);
		 
		 int i = 10;  //
		 byte e = (byte) i;  
		 /* 一个整数没有加上任何标识的时候，默认是int类型的数据。
			10 是一个常量， 编译器在编译的时候就能够确认常量的值了，byte b = 10,在编译到的时候
			java编译器就会检查到10并没有超出byte的表示范围，所以允许赋值。
			//java编译器在编译 的时候并不能确认变量所存储的值，变量存储的值是在运行的时候才在内存中分配空间 的。
		*/
		 System.out.println(e);

	
		 
	}
}
