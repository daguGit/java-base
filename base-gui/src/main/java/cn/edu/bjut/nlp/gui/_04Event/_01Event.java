package cn.edu.bjut.nlp.gui._04Event;

import cn.edu.bjut.nlp.FrameUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
事件： 当发生了某个事件的时候，就会有相应处理方案。


	事件源         监听器            事件            处理方案

*/


public class _01Event {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("click");
		
		frame.add(button);
		
		button.addActionListener(new ActionListener() {
			//当按钮被点击的时候，就会调用actionPerformed的方法。 
			@Override
			// ActionEvent 当前按钮被点击的时候，jvm就会把对应 的时间传递ActionEvent，并且调用actionPerformed方法。
			public void actionPerformed(ActionEvent e) {
				//System.out.println("click me");
				
				//getSource() 获取到事件源
				JButton button = (JButton)e.getSource();
				if (button.getText().equals("click")) {
					button.setText("click me");
				}else {
					button.setText("click");
				}
			}
		});
		FrameUtil.initFrame(frame, 200, 200);
	}
}
