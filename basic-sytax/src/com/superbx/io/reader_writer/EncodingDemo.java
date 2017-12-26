package com.superbx.io.reader_writer;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * ����ͽ���
 */
public class EncodingDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg = "��ϵ������";
		//���������String-->byte[]
		byte[] data = msg.getBytes("GBK");
		System.out.println(Arrays.toString(data));
		//����֮��ʼ����
		
		//���������byte[]-->String
		//��Ϊ��������������д�ģ��������ⶼ��ʹ���Լ���ISO-8859-1������
		String ret = new String(data, "ISO-8859-1"); //��ʱ����������˵����������
		System.out.println(ret);
		//���������
		data = ret.getBytes("ISO-8859-1");
		System.out.println(Arrays.toString(data));
		ret = new String(data, "GBK");
		System.out.println(ret);
	}
}
