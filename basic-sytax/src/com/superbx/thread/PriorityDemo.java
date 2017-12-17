package com.superbx.thread;

class PriorityThread extends Thread {
	public PriorityThread(String string) {
		super(string);
	}

	public void run() {
		for (int i = 0; i < 150; i++) {
			System.out.println(super.getName() + " - " + i);
		}
	}
}
//�̵߳����ȼ�
/*
 * ���ȼ�Խ�ߣ�ִ�еĻ���Խ��
 */
public class PriorityDemo {
	public static void main(String[] args) {
		//�������ȼ�
		PriorityThread min1 = new PriorityThread("A�����ȼ�");
		min1.setPriority(Thread.MIN_PRIORITY);
		PriorityThread min2 = new PriorityThread("B�����ȼ�");
		min2.setPriority(Thread.MIN_PRIORITY);
		PriorityThread min3 = new PriorityThread("C�����ȼ�");
		min3.setPriority(Thread.MIN_PRIORITY);
		PriorityThread min4 = new PriorityThread("D�����ȼ�");
		min4.setPriority(Thread.MIN_PRIORITY);
		
		
		PriorityThread max = new PriorityThread("������ȼ�");
		max.setPriority(Thread.MAX_PRIORITY);
		PriorityThread nor = new PriorityThread("��ͨ���ȼ�");
		//�������̵߳����ȼ���
		Thread.currentThread().setPriority(10); //���ȼ��ķ�Χ��0-10����ͨ�����ȼ���5�������ʹ�����������ȼ�����Ҫ�Զ���
		System.out.println(Thread.currentThread().getPriority());
	}
}
