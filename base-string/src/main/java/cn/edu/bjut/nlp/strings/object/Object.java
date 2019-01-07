package cn.edu.bjut.nlp.strings.object;

/*
 java是面向对象的语言，核心思想：找适合 的对象做适合 的事情：

 方式一：自定义类，然后通过自定义的类创建对象。

 方式二：sun提供了很多的类给我使用，我们只需要认识这些类，我们就可以通过这些类创建对象了。

 Object类是所有类的终极父类。 任何一个类都继承了Object类。


 Object类：


 Object类常用的方法：
 toString();     返回该对象的字符串表示。 返回一个字符串用于描述该对象的。
 疑问： toString() 有何作用？	  重写toString之后，我们直接输出一个对象的时候，就会输出符合我们所需求的格式数据。

 equals(Object obj)   用于比较两个对象的内存地址，判断两个对象是否为同一个对象。

 hashCode()   返回该对象的哈希码值(大家可以把哈希码就 理解成是对象的内存地址)/


 java中的规范：一般我们重写了一个类的equals方法，我们都会重写它的hashCode方法。



 java是开源....源代码公开...

 查看源代码的方式：
 方式一： 按住ctrl键，单击你需要看的源代码.

 方式二：把光标移动到你需要查看代码处按下F3.


 为什么我们要查看源代码：
 1，查看源代码可以了解别人是如何写出这个技术的，让我们了解的更加的深入。
 2. 吸收大牛的思想。

 看源代码最忌讳的一点： 不要每行代码都弄懂是什么意思，能看个大概 猜出他意思就足矣。
 */
class Person {
	int id;
	String name;
	public Person (){}
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	//目前我需要直接输出一个对象的时候，输出 的格式是： 编号：110 姓名： 狗娃  这种格式。 目前Object的
	//	toString方法无法满足子类的需求，那么这时候我们就应该对Object类的toString进行重写。
	@Override
	public String toString() {
		String string = this.id + "  " + this.name;
		return string;
	}
	//为什么要重写：Object的equals方法默认比较的是两个对象的内存地址，
	//我目前需要比较的是两个对象的身份证，所以Object类的equals方法不符合我现在的需求。
	@Override
	public boolean equals(java.lang.Object obj) {
		Person person  =(Person)obj;
		return this.id == person.id;
	}
	@Override
	public int hashCode() {
		return  this.id;
	}
}

public class Object {

	public static void main(String[] args) {
		/*
			Object object = new Object();
			// java.lang.Object@18b3364 返回的字符串表示： 完整类名+@+ 对象的哈希码
			System.out.println(object.toString());
			// 通过查看源代码得知，直接输出一个对象 的时候，实际上在println方法内部会调用这个
			// 调用的toString方法，把把toString方法返回的内容输出。
			System.out.println(object);
		*/
		Person p1 = new Person(110,"adf");
		System.out.println(p1);

		Person p3 = new Person(110,"狗娃");
		Person p2 = new Person(110,"陈富贵");
		//需求：在现实生活中只要两个人的身份证一致，那么就是同一个人。
		System.out.println("p1与p2是同一个对象吗？"+ p3.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

}
