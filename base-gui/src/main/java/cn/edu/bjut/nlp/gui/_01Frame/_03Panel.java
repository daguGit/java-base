package cn.edu.bjut.nlp.gui._01Frame;


import javax.swing.*;
import java.awt.*;

/*
面板(JPanel)

 */
public class _03Panel {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        cn.edu.bjut.nlp.FrameUtil.initFrame(frame, 300, 400);
        //创建一个面板
        JPanel panel = new JPanel();
        //设置面板的背景颜色
        panel.setBackground(Color.black);
        //把面板添加到窗体
        frame.add(panel);


    }

}
