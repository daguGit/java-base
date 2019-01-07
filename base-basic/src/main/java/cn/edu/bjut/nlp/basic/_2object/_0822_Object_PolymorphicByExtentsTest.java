package cn.edu.bjut.nlp.basic._2object;

/*
 多态的应用：
 1. 多态用于形参类型的时候，可以接收更多类型的数据 。
 2. 多态用于返回值类型的时候，可以返回更多类型的数据。



 多态的好处： 提高了代码的拓展性。

 需求1： 定义一个函数可以接收任意类型的图形对象，并且打印图形面积与周长。
 */

//图形类
abstract class Shape {
	public abstract void getArea();

	public abstract void getLength();
}

class Circle3 extends Shape {
	public static final double PI = 3.14;
	double r;

	public Circle3(double r) {
		this.r = r;
	}

	public void getArea() {
		System.out.println("圆形的面积：" + PI * r * r);
	}

	public void getLength() {
		System.out.println("圆形的周长：" + 2 * PI * r);
	}
}

class Rectangle extends Shape {
	int width;

	int height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void getArea() {
		System.out.println("矩形的面积：" + width * height);
	}

	public void getLength() {
		System.out.println("矩形的周长：" + 2 * (width + height));
	}
}

public class _0822_Object_PolymorphicByExtentsTest {
	// 需求1： 定义一个函数可以接收任意类型的图形对象，并且打印图形面积与周长。
	public static void print(MyShape s) { // MyShpe s = new Circle(4.0);
		s.getArea();
		s.getLength();
	}

	// 需求2： 定义一个函数可以返回任意类型的图形对象。
	public static Shape getShape(int i) {
		if (i == 0) {
			return new Circle3(4.0);
		} else {
			return new Rectangle(3, 4);
		}
	}

	public static void main(String[] args) {
		Shape shape = new Circle3(5);
		shape.getArea();
		shape.getLength();
		
		shape = getShape(0);
		shape.getArea();
		
		
	}
}
