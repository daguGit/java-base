package cn.edu.bjut.nlp.basic._1basic;
/*
赋值运算符：
	=  (赋值运算符)
	+= 
	-=
	*=
	/=
	%=
*/
public class _0402_Operator_AssignmentOperator {
	public static void main(String[] args) 
	{
		
		int i = 10; // 把10赋予给i变量。
		i+=2;  // i = i+2; 
		System.out.println("i = "+i);
	
	
		byte b1 = 1;
		byte b2 = 2;
	
		//b2 = (byte)(b2+b1); //报错。， 需要强制类型转换
		b2+=b1;  //b2 = b2+ b1;	 b2+=b1 在编译的时候，java编译器会进行强制类型转换，不需要我们手动转换了。
		System.out.println("b2 : "+ b2);
	}
}
