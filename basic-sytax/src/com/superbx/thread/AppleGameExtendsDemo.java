package com.superbx.thread;

//ÿһ��ͬѧ�ñ���һ���̶߳���
class Person extends Thread {
	private int num = 50; //ƻ���ܸ���
	Person (String name) {
		super(name);
	}
	public void run() {
		for (int i = 0;i < 50;i++) {
			if (num > 0) {
				System.out.println(super.getName() + " ���˱��Ϊ" + num-- + "��ƻ��");
			}
		}
	}
}

//ʹ�ü̳�Thread��ʽ��ʵ�֣�����ͬѧ��ƻ������
public class AppleGameExtendsDemo {
	public static void main(String[] args) {
		//���������̣߳�����ͬѧ������ƻ��
		new Person("���Ϻ�").start();
		new Person("������").start();
		new Person("�Ŵ�ү").start();
	}
}
