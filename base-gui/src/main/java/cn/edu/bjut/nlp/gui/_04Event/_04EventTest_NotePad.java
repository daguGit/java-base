package cn.edu.bjut.nlp.gui._04Event;

import cn.edu.bjut.nlp.FrameUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class _04EventTest_NotePad {

	JFrame frame = new JFrame("记事本");
	
	//菜单条
	JMenuBar bar = new JMenuBar();
	
	//文件菜单
	JMenu fileMenu = new JMenu("文件");
	JMenu editMenu  = new JMenu("编辑");
	
	JMenu switchMenu = new JMenu("切换工作目录");
	
	
	//菜单项
	JMenuItem openMenu = new JMenuItem("打开");
	JMenuItem saveMenu = new JMenuItem("保存");
 
	JMenuItem aboutMenu = new JMenuItem("关于");
	JMenuItem closeMenu = new JMenuItem("关闭");
	
	
	JMenuItem  workMenu1 = new JMenuItem("0910project");
	JMenuItem  workMenu2 = new JMenuItem("1208project");
	JMenuItem  workMenu3 = new JMenuItem("1110project");
	
	
	
	TextArea area = new TextArea(20,30);
	
	public void initNotepad(){
		//菜单添加菜单项目
		fileMenu.add(openMenu);
		
		openMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog dialog  = new FileDialog(frame,"save",FileDialog.LOAD);
				dialog.setVisible(true);
				String path = dialog.getDirectory();
				String fileName = dialog.getFile();
				try {
					FileInputStream fileInputStream = new FileInputStream(new File(path,fileName));
					byte[] buf = new byte[1024];
					int length;
					String content = area.getText();
					while((length = fileInputStream.read(buf))!=-1){
						content = area.getText()+new String(buf,0,length);
					}
					area.setText(content);
					fileInputStream.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		fileMenu.add(saveMenu);
		
		saveMenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog dialog  = new FileDialog(frame,"save",FileDialog.SAVE);
				dialog.setVisible(true);
				//获取用户选择的路径与文件名
				String path = dialog.getDirectory();
				String filename = dialog.getFile();
				System.out.println(path + filename);
				try {
					FileOutputStream fileOutputStream = new FileOutputStream(new File(path,filename));
					//获取文本域的内容，把内容写出
					String content = area.getText();
					content.replaceAll("\n","\r\n");
					fileOutputStream.write(content.getBytes());
					//关闭资源
					fileOutputStream.close();
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		editMenu.add(aboutMenu);
		editMenu.add(closeMenu);
		
		//复选菜单
		switchMenu.add(workMenu1);
		switchMenu.add(workMenu2);
		switchMenu.add(workMenu3);
		//菜单添加菜单就是复选菜单
		fileMenu.add(switchMenu);
		
		
		
		//菜单条添加菜单
		bar.add(fileMenu);
		bar.add(editMenu);
		
		//添加菜单条
		frame.add(bar,BorderLayout.NORTH);
		frame.add(area);
		FrameUtil.initFrame(frame, 500, 600);
		
	}
	public static void main(String[] args) {
		new _04EventTest_NotePad().initNotepad();
	}

}
