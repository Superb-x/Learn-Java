package com.superbx.thread;
//�����ڲ���
public class AnonymousInnerClassDemo {
	public static void main(String[] args) {
		//���̣߳�������Ϸ
		for (int i = 0;i < 50;i++) {
			System.out.println("���ڴ���Ϸ" + i);
			if(i == 10) {
				//�����̶߳�������
				Thread t = new Thread(new Runnable(){
					//ʹ�������ڲ�����ʵ��
					public void run() {
						for(int i = 0;i < 50;i++) {
							System.out.println("��Ƭ" + i);
						}
					}
					
				});
				t.start(); //�����߳�Ҫ��start���������Զ�ȥ����run
			}
		}
	}
}
