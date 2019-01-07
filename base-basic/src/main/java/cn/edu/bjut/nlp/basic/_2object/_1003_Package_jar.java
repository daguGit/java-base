package cn.edu.bjut.nlp.basic._2object;

import javax.swing.JFrame;

/*
 打jar包: 需要使用到jdk的开发工具（jar.exe）.

 jar的用法：

 使用格式：

 jar cvf jar文件的名字  class文件或者是文件夹 

 打jar包要注意的事项：
 1. 一个程序打完了jar之后 必须要在清单文件上指定入口类： 格式 Main-Class: 包名.类名
 2. jar包双击运行仅对于图形化界面的程序起作用，对控制台的程序不起作用。


 jar文件的作用：
 1. 方便用户快速运行一个项目。
 2. 提供工具类以jar包的形式给别人使用。 


 如果使用jar包里面的类必须要先设置classpath路径。

 jre = jvm+ 核心类库

 */
public class _1003_Package_jar {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("QQ程序");
		frame.setSize(400, 500);
		frame.setVisible(true); // 设置窗口可见。
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
