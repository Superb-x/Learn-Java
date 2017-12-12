package cn.superbx.util;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Java做图形化页面
public class GUIdemo {
	public static void main(String[] args) {
		final Frame f = new Frame("JavaGUI界面");
		// 创建一个文本框
		final TextField t = new TextField(30);
		// 把文本框放到窗体的北部
		f.add(t, BorderLayout.NORTH);
		// 创建一个按钮
		Button b = new Button("点击");
		f.add(b);
		b.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String txt = t.getText();
				System.out.println(txt);
			}
		});
		//给按钮添加一个事件
		f.pack(); // 自适应，组件有多大，就显示多大
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.out.println("退出JVM");
			}
		});
	}
}

