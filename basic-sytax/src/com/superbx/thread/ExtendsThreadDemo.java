package com.superbx.thread;
//�������ֵ��߳���
class MusicThread extends java.lang.Thread {
	public void run() {
		for (int i = 0;i < 50;i++) {
			System.out.println("��������" + i);
		}
	}
}
//�߳�ʾ��
public class ExtendsThreadDemo {
	public static void main(String[] args) {
		//���̣߳�������Ϸ
		for (int i = 0;i < 50;i++) {
			System.out.println("���ڴ���Ϸ" + i);
			if(i == 10) {
				//�����̶߳�������
				MusicThread t = new MusicThread();
				t.start(); //�����߳�Ҫ��start���������Զ�ȥ����run
			}
		}
	}
}
