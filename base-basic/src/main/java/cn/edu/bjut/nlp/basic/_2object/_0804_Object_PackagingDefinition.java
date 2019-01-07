package cn.edu.bjut.nlp.basic._2object;
/*
面向对象三大特征：
	1. 封装
	2. 继承
	3  多态。

需求：  使用java类描述百合网的会员。

问题： 性别有问题？？

根本原因： 由于其他人可以直接操作sex属性。可以对sex属性进行了直接的赋值。

封装:


权限修饰符：权限修饰符就是控制变量可见范围的。

public :  公共的。 public修饰的成员变量或者方法任何人都可以直接访问。

private ： 私有的， private修饰的成员变量或者方法只能在本类中进行直接访问。


封装的步骤：
	1. 使用private修饰需要被封装的属性。
	2. 提供一个公共的方法设置或者获取该私有的成员属性。
			 命名规范：
				set属性名();
				get属性名(); 

疑问： 封装一定要提供get或者set方法吗？
		不一定， 根据需求而定的。

规范 ： 在现实开发中一般实体类的所有成员属性（成员变量）都要封装起来。

实体类：实体类就是用于描述一类 事物的就称作为实体类。


工具类(Arrays数组的工具类):


封装的好处：
	1. 提高数据的安全性。
	2. 操作简单。 
	3. 隐藏了实现。

*/
public class _0804_Object_PackagingDefinition {
	public static void main(String[] args){
		Member m = new Member();
		m.name="狗娃";
		m.setSex("女");
		m.salary  = 800;
		System.out.println("姓名："+ m.name+" 性别："+ m.getSex()+" 薪水："+ m.salary);
	}
}
class Member{
	public	String name; //名字

	private	String sex; //性别

	public	int salary; //薪水
	//聊天
	public void talk(){
		System.out.println(name+"聊得非常开心");
	}
   //定义一个公共的方法设置sex属性
	public void setSex(String s){
		if (s.equals("男")||s.equals("女")){ //注意： 如果比较两个字符串的内容是否一致，不要使用==比较， 使用equals方法。
			sex = s;
		}else{
			//默认是男
			sex = "男";
		}
	}
	//定义一个公共的方法获取sex属性
	public String getSex(){
		return sex;
	}


}