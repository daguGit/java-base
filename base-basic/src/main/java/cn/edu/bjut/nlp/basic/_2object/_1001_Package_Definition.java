package cn.edu.bjut.nlp.basic._2object;
/*
包: 

java中的包就相当于windows文件夹。

包的作用：
	1. 解决类名重复产生冲突的问题。
	2. 便于软件版本的发布。


定义包的格式：
	package 包名;

包名命名规范：包名全部小写。

包语句要注意的事项：
	1. package语句必须位于java文件中中第一个语句。
	2. 如果一个类加上了包语句，那么该类的完整类名就是: 包名.类名
	3. 一个java文件只能有一个包语句。


问题：  每次编译的时候都需要自己创建一个文件夹，把对应 的class文件存储 到文件夹中。烦！！！
	
		javac -d 指定类文件的存放路径   java源文件
*/
/*
有了包之后类与类之间的访问：

问题： 有了包之后类与类之间的访问每次都必须 要写上包名！烦！！！！

解决方案： sum提供导包语句让我们解决该问题。

导包语句作用：简化书写。 (误区： 把一个类导入到内存中)

导包语句的格式：
			 import 包名.类名;   （导入xxx包中某个类）

导包语句要注意的细节：
	 1. 一个java文件中可以出现多句导包语句。
	 2. "*"是 导包语句的通配符。可以匹配任何 的类名。
	 3. import aa.*; 是不会作用于aa包下面的子包的。
	
推荐使用：import 包名.类名;   因为使用*通配符会导致结构不清晰。

什么时候使用import语句: 
	1. 相互访问的两个类不是在同一个包下面，这时候就需要使用到导包语句。
	2. java.lang 是默认导入 的，不需要我们自己导入。

*/
public class _1001_Package_Definition {

	public static void main(String[] args) {
		System.out.println("Hello world");
	}

}
