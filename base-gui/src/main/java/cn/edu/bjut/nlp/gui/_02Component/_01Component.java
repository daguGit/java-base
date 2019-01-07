package cn.edu.bjut.nlp.gui._02Component;

import cn.edu.bjut.nlp.FrameUtil;

import javax.swing.*;


/*
非容器组件:
*/

public class _01Component {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		//创建一个面板
		JPanel panel = new JPanel();
		frame.add(panel);
		//用户名的输入框
		JLabel nameLabel = new JLabel("name:");
		JTextField nameField = new JTextField(12);
		//密码
		JLabel passLable = new JLabel("passWord:");
		JPasswordField passField = new JPasswordField(12);
		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(passLable);
		panel.add(passField);
		
		//性别--单选框
		JLabel sexLabel = new JLabel("sex");
		JRadioButton man = new JRadioButton("man",true);
		JRadioButton woman = new JRadioButton("woman");
		//如果是单选框必须要进行分组，同一个组的单选框只能选择其中的一个
		ButtonGroup group = new ButtonGroup();
		group.add(man);
		group.add(woman);
		//把性别组件添加到面板上
		panel.add(sexLabel);
		panel.add(man);
		panel.add(woman);
		
		//来自城市--->下拉框
		JLabel cityLabel = new JLabel("city");
		String[] arrs = {"BJ","SH","GZ","BD","NJ"};
		JComboBox<String> citiesBox = new JComboBox<String>(arrs);
		panel.add(cityLabel);
		panel.add(citiesBox);
		
		//兴趣爱好---->复选框
		JLabel hobitLabel = new JLabel();
		JCheckBox checkBox1 = new JCheckBox("basket",true);
		
		JCheckBox checkBox2 = new JCheckBox("football");
		JCheckBox checkBox3 = new JCheckBox("java");
		JCheckBox checkBox4 = new JCheckBox("c#");
		panel.add(checkBox1);
		panel.add(checkBox2);
		panel.add(checkBox3);
		panel.add(checkBox4);
		
		//个人简介
		JLabel contentlJLabel = new JLabel("person");
		JTextArea area = new JTextArea(20,15);
		area.setLineWrap(true);//设置自动换行 
		panel.add(contentlJLabel);
		panel.add(area);
		
		FrameUtil.initFrame(frame, 600, 400);
		
		
	}

}
