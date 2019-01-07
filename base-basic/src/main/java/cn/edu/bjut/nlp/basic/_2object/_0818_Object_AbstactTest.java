package cn.edu.bjut.nlp.basic._2object;

public class _0818_Object_AbstactTest {
	public static void main(String[] args){
		Cir cir = new Cir("name", 3);
		cir.getArea();
		cir.getLength();
		Rect rect = new Rect("name", 3,4);
		rect.getArea();
		rect.getLength();
	}
}
 abstract class MyShape{
	String name;
	public MyShape(String name){
		this.name = name;
	}
	public abstract void getArea();
	public abstract void getLength();
}
 class Cir extends MyShape{
	 double r;
	  public final static double Pi = 3.14;
	 public Cir(String name,double r){
		 super(name);
		 this.r = r;
	 }

	@Override
	public void getArea() {
		System.out.println("Area = "  + r*r*Pi);
	}

	@Override
	public void getLength() {
		System.out.println("Length = "  + 2*r*Pi);
	}
 }
 class Rect extends MyShape{
	double width;
	double height;
	 
	public Rect(String name,double width,double height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	@Override
	public void getArea() {
	System.out.println("Area = "+width * height );
		
	}

	@Override
	public void getLength() {
		System.out.println("Length = "+ 2* (width+height) );		
	}
	 
 }