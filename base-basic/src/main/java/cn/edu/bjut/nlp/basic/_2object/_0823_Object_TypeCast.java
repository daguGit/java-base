package cn.edu.bjut.nlp.basic._2object;

/*
 目前多态情况下不能访问子类特有的成员。
 如果需要访问子类特有的成员，那么需要进行类型强制转换.

 基本数据类型的转换
 小数据类型-------->大的数据类型      自动类型转换
 大数据类型--------->小数据类型       强制类型转换     小数据类型  变量名 = （小数据类型）大数据类型;

 引用数据类型的转换
 小数据类型--------->大数据类型     自动类型转换。
 大数据类型--------->小数据类型      强制类型转换

 类型转换最场景的问题： java.lang.ClassCastException。 强制类型转换失败。
 */
//动物类
abstract class Animal6 {

	String name;

	public Animal6(String name) {
		this.name = name;
	}

	public abstract void run();
}

// 老鼠
class Mouse5 extends Animal6 {

	public Mouse5(String name) {
		super(name);
	}

	public void run() {
		System.out.println(name + "四条腿慢慢的走!");
	}

	// 老鼠特有方法---打洞
	public void dig() {
		System.out.println("老鼠在打洞..");
	}
}

// 鱼
class Fish4 extends Animal6 {

	public Fish4(String name) {
		super(name);
	}

	public void run() {
		System.out.println(name + "摇摇尾巴游啊游 !");
	}

	// 吹泡泡
	public void bubble() {
		System.out.println(name + "吹泡泡...!");
	}

}

public class _0823_Object_TypeCast {
	public static void main(String[] args) {
		/*
		 * Animal a = new Mouse("老鼠"); //多态 //调用子类特有的方法 Mouse m = (Mouse)a;
		 * //强制类型转换 m.dig();
		 */

		Mouse5 m = new Mouse5("米老鼠");
		Fish4 f = new Fish4("草鱼");

		print(f);

	}

	// 需求： 定义一个函数可以接收任意类型的动物对象，在函数内部要调用到动物特有的方法。
	public static void print(Animal6 a) { // Animal a = new Mouse("米老鼠");
		if (a instanceof Fish4) {
			Fish4 f = (Fish4) a;
			f.bubble();
		} else if (a instanceof Mouse5) {
			Mouse5 m = (Mouse5) a;
			m.dig();
		}
	}
}
