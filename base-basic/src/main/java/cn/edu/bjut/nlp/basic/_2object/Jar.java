package cn.edu.bjut.nlp.basic._2object;

//package aa;
//设置 javac -d . Jar.class  打包jar cvf qq.jar aa  在jar包里加入Main-Class: aa.Jar
 
import javax.swing.JFrame;
public class Jar {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("QQ程序");
		frame.setSize(400, 500);
		frame.setVisible(true); // 设置窗口可见。
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}