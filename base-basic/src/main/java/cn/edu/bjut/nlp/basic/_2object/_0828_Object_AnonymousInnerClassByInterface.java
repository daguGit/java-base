package cn.edu.bjut.nlp.basic._2object;

//实现关系下局部匿名内部类
interface Dao2{

	public void add();
}
class Outer3{

	public void print(){
		//创建一个匿名内部类的对象
		new Dao2(){   //不是接口不能创建对象吗？怎么现在又可以了？
			 public void add(){
				System.out.println("添加成功");
			 }
		}.add();
	}
}


public class _0828_Object_AnonymousInnerClassByInterface {
	public static void main(String[] args) 
	{
	Outer3 outer3 = new Outer3();
	outer3.print();
		// 匿名内部类一般是用于实参。
		test(new Dao2(){	
			public void add(){
				System.out.println("添加员工成功");
			}
		});
	}

	//调用这个方法...
	public static void  test(Dao2 d){  //形参类型是一个接口引用..
		d.add();
	}
}
