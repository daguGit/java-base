package cn.edu.bjut.nlp.basic._2object;
/*
需求： 使用java类描述一个计算器类，计算器具备操作数1， 操作数2 、操作符三个公共 的属性
，还具备计算的功能行为。 

要求： 不能直接对操作数1，操作数2，运算符这些属性进行直接 的赋值，要封装起来。 (+ - * /  )

根据需求提供get或者set方法。

	需要提供set方法
*/



public class _0804_Object_PackagingTest {
	public static void main (String[] args) {
		Calculate cal = new Calculate();
		cal.setNum1(3);
		cal.setNum2(5);
		cal.setCharactor('+');
		
		System.out.println(cal.calculate());
	}
}
//计算器类
class Calculate{
	private int num1;
	private int num2;
	private char charactor;
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public char getCharactor() {
		return charactor;
	}
	public void setCharactor(char charactor) {
		if(charactor=='+'||charactor=='-'||charactor=='*'||charactor=='/')
		{this.charactor = charactor;}
		else{
			System.out.println("input error");
		}
	}
	

	//提供公共的方法设置属性值....					
	public void initCalculator(int n1 , int n2 , char o){
		num1 = n1;
		num2 = n2;
		if(o=='+'||o=='-'||o=='*'||o=='/'){
			charactor = o;
		}else{
			charactor = '+';	
		}
	
	}

	public int calculate(){
		
		switch (charactor) {
		case '+':
			return num1 +num2;
		case '-':
			return num1 - num2;			
		case '*':
			return num1 *num2;		
		case '/':
			return num1 /num2;		
		default:
		   return -1000;
		}
	
		
		
	}
}