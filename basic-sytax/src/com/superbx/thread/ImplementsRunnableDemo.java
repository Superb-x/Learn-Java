package com.superbx.thread;

//�������ֵ�һ����
class MusicPlay implements java.lang.Runnable {

	public void run() {
		for (int i = 0;i < 50;i++) {
			System.out.println("��������" + i);
		}
	}
	
}
public class ImplementsRunnableDemo {
	public static void main(String[] args) {
		//���̣߳�������Ϸ
		for (int i = 0;i < 50;i++) {
			System.out.println("���ڴ���Ϸ" + i);
			if(i == 10) {
				//�����̶߳�������
				Runnable target = new MusicPlay();
				Thread t = new Thread(target);
				t.start(); //�����߳�Ҫ��start���������Զ�ȥ����run
			}
		}
	}
}
