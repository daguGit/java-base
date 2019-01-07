package cn.edu.bjut.nlp.gui._01Frame;

import cn.edu.bjut.nlp.FrameUtil;

import javax.swing.*;
import java.awt.*;

/*
对话框类(Dialog):
	 
 	JDialog(Dialog owner, String title, boolean modal) 
 	
 	owner: 所有者
 	
 	title : 标题
 	
 	modal : modal true时 ，点击母窗口没有反应，只有关闭当前窗口才能产生动作。
 
JOptionPane(对话框)
	消息对话框
	警告对话框
	错误对话框
	输入对话框
	确认对话框
	
文件对话框(FileDialog)：
 	
 	FileDialog(Dialog parent, String title, int mode) 
	parent： 对话框的所有者
	tiltle : 对话框的标题
	mode: load(打开) 、 save(保存)
	*/
public class _02Dialog {

	public static void main(String[] args) {
		/*JFrame frame= new JFrame();
		//创建对话框
		JDialog dialog = new JDialog(frame, "dialog", true);
		//使用我自定义的 窗体工具类
		FrameUtil.initFrame(frame,300,400);
		dialog.setBounds(500,300,100,200);
		dialog.setVisible(true);*/
		
		JFrame frame = new JFrame("窗体");
		//显示一个对话框
		FrameUtil.initFrame(frame, 300, 400);
		//消息对话框
		JOptionPane.showMessageDialog(frame,"content", "messageDialog",JOptionPane.INFORMATION_MESSAGE);
		//警告对话框
		JOptionPane.showMessageDialog(frame, "content", "warning", JOptionPane.WARNING_MESSAGE);
		//错误对话框
		JOptionPane.showMessageDialog(frame,"扣6分","错误",JOptionPane.ERROR_MESSAGE);
		//输入框
		String num = JOptionPane.showInputDialog("please input the number: ");
		System.out.println(num);
		//确认框
		int i = JOptionPane.showConfirmDialog(frame, "sure");
		System.out.println(i);
		
		FileDialog fileDialog = new FileDialog(frame, "window", FileDialog.LOAD);
		fileDialog.setVisible(true);
		System.out.println(fileDialog.getDirectory());
		System.out.println(fileDialog.getFile());
		FileDialog fileDialog2 = new FileDialog(frame, "window", FileDialog.SAVE);
		System.out.println(fileDialog.getDirectory());
		System.out.println(fileDialog.getFile());
		
	}

}
