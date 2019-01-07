package cn.edu.bjut.nlp.gui._04Event;

import cn.edu.bjut.nlp.FrameUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;


public class _04EventTest_FileSearch {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField textField = new JTextField("input ..", 15);
	JButton button = new JButton("search");

	JTextArea area = new JTextArea(15, 15);
	//滚动条
	ScrollPane pane = new ScrollPane();

	public void init() {
		//先把area添加 到滚动条上。
		pane.add(area);
		//先把组件添加到panel上
		panel.add(textField);
		panel.add(button);
		//给输入框添加事件
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JTextField field = (JTextField) e.getSource();
				if (field.getText().equals("input ..")) {
					field.setText("");
				}
			}
		});
		//给按钮添加事件监听器
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//给按钮添加事件监听器
				String path = textField.getText();
				//使用输入的路径构建一个FIle对象
				File dir = new File(path);
				//找到目录下的所有子 文件
				File[] files = dir.listFiles();
				for (File file : files) {
					area.setText(area.getText() + file.getName() + "\t\n");
				}

			}
		});
		//把面板添加到frame上
		frame.add(panel, BorderLayout.NORTH);
		frame.add(pane);
		FrameUtil.initFrame(frame, 300, 400);
	}

	public static void main(String[] args) {
		new _04EventTest_FileSearch().init();
	}

}
