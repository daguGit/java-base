package cn.edu.bjut.nlp.basic._1basic;
/*

软件 =  数据 + 指令 + 文档(使用者文档+ 开发者文档)

文档注释与多行注释的区别：

多行注释与文档注释的区别： 多行注释的内容不能用于生成一个开发者文档，
而文档注释 的内容可以生产一个开发者文档。


使用javadoc开发工具即可生成一个开发者文档。
	
	javadoc工具的使用格式：
		
		javadoc -d 存放文档的路径  -author -version java的源文件 
	

使用javadoc工具要注意细节：
	1. 如果一个类需要使用javadoc工具生成一个软件的开发者文档，那么该类必须使用public修饰。
	2. 文档注释注释的内容一般都是位于类或者方法的上面的。

写注释的规范：一般单行注释是位于代码的右侧，多行注释与文档注释一般是写在类或者方法的上面的。

*/

/**
 *模拟qq软件使用
 *@author Lenovo
 *@version 1.1
 */
public class _0202_Comment_docComment {

	/**
	  操作的流程如下：
		1.首先先输入用户名密码
		2. 校验用户名与密码
		3. 展示好友列表
		@param args
	*/
	
	public static void main(String[] args) {
		System.out.println("请输入用户名与密码");  //这句话是用于输入用户名与密码的。
		System.out.println("校验用户名与密码");
		System.out.println("展示好友列表");
	}

}
