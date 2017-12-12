package cn.superbx.util;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Java��ͼ�λ�ҳ��
public class GUIdemo {
	public static void main(String[] args) {
		final Frame f = new Frame("JavaGUI����");
		// ����һ���ı���
		final TextField t = new TextField(30);
		// ���ı���ŵ�����ı���
		f.add(t, BorderLayout.NORTH);
		// ����һ����ť
		Button b = new Button("���");
		f.add(b);
		b.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String txt = t.getText();
				System.out.println(txt);
			}
		});
		//����ť���һ���¼�
		f.pack(); // ����Ӧ������ж�󣬾���ʾ���
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.out.println("�˳�JVM");
			}
		});
	}
}

