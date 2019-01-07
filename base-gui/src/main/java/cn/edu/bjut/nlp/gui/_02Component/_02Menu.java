package cn.edu.bjut.nlp.gui._02Component;

import cn.edu.bjut.nlp.FrameUtil;

import javax.swing.*;
import java.awt.*;


/*
菜单组件
	
	菜单条(MenuBar) 、  菜单（Menu） 、 菜单项(MenuItem)
	
	菜单条可以添加菜单
	
	菜单可以添加菜单项
	
	复选菜单：
		首先菜单添加菜单 ， 菜单添加菜单项。
*/
public class _02Menu {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Notepad");
		
		
		JMenuBar bar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("file");
		JMenu editMenu = new JMenu("edit");
		JMenu switchMenu = new JMenu("switch");
		
		
		JMenuItem openItem = new JMenuItem("open");
		JMenuItem saveItem = new JMenuItem("save");
		JMenuItem aboutItem = new JMenuItem("about");
		JMenuItem closeItem = new JMenuItem("colse");
		
		JMenuItem  workMenu1 = new JMenuItem("0910project");
		JMenuItem  workMenu2 = new JMenuItem("1208project");
		JMenuItem  workMenu3 = new JMenuItem("1110project");
		
		JTextArea area = new JTextArea(20,30);
		
		
		
		editMenu.add(aboutItem);
		editMenu.add(closeItem);
		
		switchMenu.add(workMenu1);
		switchMenu.add(workMenu2);
		switchMenu.add(workMenu3);
		
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(switchMenu);
		bar.add(fileMenu);
		bar.add(editMenu);
		
		frame.add(bar,BorderLayout.NORTH);
		frame.add(area);
		FrameUtil.initFrame(frame, 400, 300);
	}
}
