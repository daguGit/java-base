package cn.edu.bjut.nlp.basic._2object;
/*
目前的问题：父类的功能无法满足子类的需求。

方法重写的前提： 必须要存在继承的关系。

方法的重写: 子父类出了同名的函数，这个我们就称作为方法的重写。

什么是时候要使用方法的重写：父类的功能无法满足子类的需求时。

方法重写要注意的事项：
	1.方法重写时， 方法名与形参列表必须一致。
	2.方法重写时，子类的权限修饰符必须要大于或者等于父类的权限修饰符。
	3.方法重写时，子类的返回值类型必须要小于或者 等于父类的返回值类型。
	4.方法重写时， 子类抛出的异常类型要小于或者等于父类抛出的异常类型。
			Exception(最坏)
			RuntimeException(小坏)

方法的重载：在一个类中 存在两个或者两个 以上的同名函数,称作为方法重载。

方法重载的要求
	1. 函数名要一致。
	2. 形参列表不一致（形参的个数或形参 的类型不一致）
	3. 与返回值类型无关。
*/
public class _0815_Object_Override {
	public static void main(String[] args) 
	{
		Zi1 z = new Zi1("大头儿子");
		z.eat();	
	}
}
class Animal1{  //大的数据 类型 
}

class Fish3 extends Animal1{

}
class Fu1{
	String name;
	public Fu1(String name){
		this.name = name;
	}

	public Animal1 eat2() {
		System.out.println(name+"吃番薯...");
		return new Fish3();
		
	}
}

class Zi1 extends Fu{
	String num;	
	public Zi1(String name){
		super(name);//指定调用 父类带参的构造方法
	}

	//重写父类的eat方法
	public Fish3 ea2t(){
		System.out.println("吃点开胃菜..");
		System.out.println("喝点汤....");
		System.out.println("吃点龙虾....");
		System.out.println("吃青菜....");
		System.out.println("喝两杯....");
		System.out.println("吃点甜品....");	
		return new Fish3();
	}
}
