package cn.edu.bjut.nlp.gui._03Layout;

import cn.edu.bjut.nlp.FrameUtil;

import javax.swing.*;
import java.awt.*;


/*
表格布局管理器(GridLayout)

注意的事项： 如果表格数量不够使用时，默认会多加一列。


*/
public class _03GridLayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		//创建表格布局管理器
		GridLayout gridLayout = new GridLayout(4,4,1,2);
		//让窗体交给表格布局管理器管理
		frame.setLayout(gridLayout);
		for (int i = 0; i < 10; i++) {
			frame.add(new JButton(i+""));
		}
		frame.add(new JButton("+"));
		frame.add(new JButton("-"));
		frame.add(new JButton("*"));
		frame.add(new JButton("/"));
		frame.add(new JButton("="));
		frame.add(new JButton("."));
		
		//注意的事项： 如果表格数量不够使用时，默认会多加一列。
//	frame.add(new JButton("aa"));
		
		//初始化窗体
		FrameUtil.initFrame(frame, 300, 300);
		
	}

}
