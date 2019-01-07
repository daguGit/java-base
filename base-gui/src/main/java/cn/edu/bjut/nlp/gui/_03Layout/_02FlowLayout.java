package cn.edu.bjut.nlp.gui._03Layout;

import cn.edu.bjut.nlp.FrameUtil;

import javax.swing.*;
import java.awt.*;


/*
流式布局管理器(FlowLayout)

流式布局管理器要注意的事项：
	1. 流式布局管理器默认情况是居中对齐的。
	2. panel默认的局部管理器就是FlowLayout.
 */
public class _02FlowLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		//创建面板
		JPanel panel = new JPanel();
		frame.add(panel);
		//创建一个流式布局管理器
		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT,0,20);
		//让流式布局管理器管理frame窗体
		panel.setLayout(flowLayout);
		panel.add(new JButton("按钮1"));
		panel.add(new JButton("按钮2"));
		panel.add(new JButton("按钮3"));
		panel.add(new JButton("按钮4"));
		
		//初始化窗体
		FrameUtil.initFrame(frame, 300, 300);
		
	}

}
