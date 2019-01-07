package cn.edu.bjut.nlp.strings.eclipse;

import java.util.ArrayList;

/*
 使用eclipse 好处：

 1. ctrl + /   内部补全。
 	 alt + /
 	 ctrl + 1      精准报错，自动修复
	 alt + 方向键
	 shift + tab
	 ctrl + shift + /
	 ctrl + shift + \
	 ctrl + /
	 ctrl + shift + F
	 ctrl + shift + o 快速导包
	 ctrl + D  快速删除当前行
	 window ->preperence->keys->constructors  自定义构造热键
	 ctrl + 鼠标点击或者 直接 F3          查看源代码
	 ctrl +shift +T 查看源代码
	 ctrl + shift + x  大写
	 ctrl + shift + y  小写
	 ctrl + T 查看父类和子类
	 
	 Ctrl + shift + R   查看当前项目中类
     Ctrl + shift + T   查看源码jar包中的类
     Ctrl + alt + L   查看返回值

	 
 2. 不需要你再使用javac工具编译，你在Eclipse上面一旦保存，Eclipse自动编译。
 3.断电调试：day17 eclipse的基本使用
 	step over 跳过本行代码
 	step into 进入方法查看
 	step return 
 */

public class Demo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("a");
		list.add("a");
		System.out.println(list);
	}
}
