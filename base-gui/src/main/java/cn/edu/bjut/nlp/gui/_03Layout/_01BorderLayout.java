package cn.edu.bjut.nlp.gui._03Layout;

import cn.edu.bjut.nlp.FrameUtil;

import javax.swing.*;
import java.awt.*;


/*
布局管理器:布局管理就是用于指定组件的 摆放位置的。

每种布局管理器都有自己的摆放风格 

BorderLayout(边框布局管理器)

	摆放的风格： 上北  、 下南 、 左西、 右东 ， 中 

Borderlayout 要注意的事项：
	1. 使用Borderlayout添加组件的时候，如果没有指定组件的方位，那么默认添加到中间的位置上。
	2. 使用BorderLayout的时候，如果东南西北那个方向没有对应 的组件，那么中间位置的组件就会占据其空缺的位置。
	3. 窗体默认的布局管理器就是Borderlayout.
	
*/
public class _01BorderLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		//创建一个边框布局管理器
		BorderLayout borderLayout = new BorderLayout();
		frame.setLayout(borderLayout);
		frame.add(new JButton("north"),BorderLayout.NORTH);
		frame.add(new JButton("south"),BorderLayout.SOUTH);
		frame.add(new JButton("east"),BorderLayout.EAST);
		frame.add(new JButton("west"),BorderLayout.WEST);
		
		FrameUtil.initFrame(frame, 300, 300);

	}

}
