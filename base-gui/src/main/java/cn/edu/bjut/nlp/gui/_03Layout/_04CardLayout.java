package cn.edu.bjut.nlp.gui._03Layout;

import cn.edu.bjut.nlp.FrameUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
卡片布局管理器(CardLayout)
 */
public class _04CardLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("卡片布局管理器");
		final JPanel panel = new JPanel();
		frame.add(panel);
		
		final CardLayout cardLayout = new CardLayout();
		panel.setLayout(cardLayout);
		//往面板添加数据
		Button button = new Button("1");
		panel.add(button);
		panel.add(new Button("2"));
		panel.add(new Button("3"));
		panel.add(new Button("4"));
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(panel);  //下一张
//				cardLayout.previous(parent);  上一张
			}
		});
		

		//初始化窗体
		FrameUtil.initFrame(frame,300, 300);
		
	}

}
