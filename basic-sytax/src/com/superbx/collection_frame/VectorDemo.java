package com.superbx.collection_frame;

import java.util.Vector;

//��ʾVector���еķ���

@SuppressWarnings("all") //���Ʊ����������еľ�����ʾ
public class VectorDemo {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("A");                 
		v.addElement(new java.util.Date());
		v.addElement(123); //ע�������ǲ��ܴ洢�����������ݵ�,����Java�߰汾�Զ�װ���ˣ���ֻ�Ǳ��������﷨��
		v.addElement(Integer.valueOf(123)); //�ײ�������ʵ�ֵ�
		System.out.println(v);
	}
}
