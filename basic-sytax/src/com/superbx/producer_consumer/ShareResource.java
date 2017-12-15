package com.superbx.producer_consumer;

//������Դ��������-�Ա�
public class ShareResource {
	private String name;
	private String gender;
	private boolean isEmpty = true; //��ʾ������Դ�����Ƿ�Ϊ��
	
	/**
	 * ����������������Դ�����д洢����
	 * @param name ����
	 * @param gender �Ա�
	 */
	synchronized public void push(String name, String gender){		
		try {
			if(!isEmpty) { //��isEmptyΪfalse��ʱ�򣬵�������������ȡ
				//true�Ļ���Ҫ����
				this.wait();//ʹ��ͬ�������������ã���ʾ��ǰ�߳��ͷ�ͬ����������ȴ����У�ֻ�ܱ������߳�������
			}
			//������ʼ
			this.name = name;
			Thread.sleep(10);
			this.gender = gender;
			//��������
			isEmpty = false;//���ù�����Դ�����ݲ�Ϊ��
			this.notifyAll();//����һ��������
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ���������ߴӹ�����Դ������ȡ������
	 */
	synchronized public void popup(){
		try {
			if(isEmpty) {//Ϊtrue��ʱ����ԴΪ�գ��ȴ�������������
				//ʹ��ͬ�������������ã���ʾ��ǰ�߳��ͷ�ͬ����������ȴ��أ�ֻ�ܱ������̻߳���
				this.wait();
			}
			//���ѿ�ʼ
			Thread.sleep(10);
			System.out.println(this.name + " - " + this.gender);
			//���ѽ���
			isEmpty = true;
			this.notifyAll();//����һ��������
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}