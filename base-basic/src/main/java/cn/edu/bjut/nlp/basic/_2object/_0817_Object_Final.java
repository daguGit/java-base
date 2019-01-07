package cn.edu.bjut.nlp.basic._2object;
/*
final(最终、修饰符)  
	
final关键字的用法：
	1. final关键字修饰一个基本类型的变量时，该变量不能重新赋值，第一次的值为最终的。
	2. fianl关键字修饰一个引用类型变量时，该变量不能重新指向新的对象。
	3. final关键字修饰一个函数的时候，该函数不能被重写。
	4. final关键字修饰一个类的时候，该类不能被继承。


常量 的修饰符一般为： public static final 

*/
public class _0817_Object_Final  extends Circle{
	public _0817_Object_Final(int r) {
		super(r);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
		
		
		final Circle circle = new Circle(5);
		//	1. final关键字修饰一个基本类型的变量时，该变量不能重新赋值，第一次的值为最终的。
		//circle.Pi =3;
		
		//2. fianl关键字修饰一个引用类型变量时，该变量不能重新指向新的对象。
		//circle = new Circle(6);
		circle.getArea();
		
		//不是说final修饰的变量不能指向新的对象吗？
		System.out.println(circle);
		test(circle);//因为此时只是把内存地址给力test，其实在栈中circle 和 c是不同的区域，指向了不同的地方。
		
	
		
	}
	public static void test(Circle c){
		System.out.println(c);
		c = new Circle(3);
		c.getArea();
	}
//	3. final关键字修饰一个函数的时候，该函数不能被重写。
	/*public void getArea(){
		System.out.println("dasgfasg");
	}*/
}
class Circle{
	int r;
   public static final double Pi = 3.14;
   public Circle(int r){
		this.r = r;
	}
	 public final void getArea(){
		System.out.println(Pi * r*r);
	}
}