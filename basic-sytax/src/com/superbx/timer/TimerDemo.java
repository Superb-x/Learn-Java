package com.superbx.timer;

import java.util.Timer;
import java.util.TimerTask;

//java��ʱ��
public class TimerDemo {
	public static void main(String[] args) {
		//����3��֮���ӡ
		System.out.println("begin-----------");
		Timer timer = new Timer(); //�˹������п��Դ�һ������ֵ����ʾ�Ƿ�Ϊ��̨
		timer.schedule(new TimerTask(){
			public void run(){
				System.out.println("��ã����Ƕ�ʱ��");
			}
		}, 3000, 1000);
		System.out.println("ending");
	}
}
