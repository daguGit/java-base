package cn.edu.bjut.nlp.gui._04Event;

import cn.edu.bjut.nlp.FrameUtil;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/*
 鼠标事件监听器
 
 */
public class _02MouseLisener {
	public static void main(String[] args) {
		JFrame frame = new JFrame("鼠标事件监听器");
		JButton button = new JButton("按钮");
		frame.add(button);
		//给按钮添加鼠标事件监听器
		/*button.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("鼠标松开...");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("鼠标按下..");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("鼠标移出...");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("鼠标进入...");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("鼠标单击..");
			}
		});
		
		添加鼠标监听器的时候我只使用 到单击事件，但是目前要我实现所有的方法？？
		解决方案： 适配器。适配器是实现了MouseListener方法的所有方法，但是实现的方法全部都是空实现。
		*/
		
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("鼠标单击了..");
				if(e.getClickCount()==2){
					System.out.println("双击了..");
				}
			}
		});
		FrameUtil.initFrame(frame, 300, 300);
	}

}
