package com.superbx.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * �ر���Դ������ʾ
 */
public class CloseResourceDemo {
	public static void main(String[] args) {
		test1();
		test2();
	}

	private static void test2() { //Java7֮����е��﷨���Զ���Դ�ر�
		//1������Դ
		File src = new File("stream.txt");
		File dest = new File("stream_copy.txt");
		try (
				//����Դ�Ĵ���
				//2����������Ĺܵ�
				FileInputStream in = new FileInputStream(src);
				FileOutputStream out = new FileOutputStream(dest);
			)
		{
			//3��ͨ�����������ж�ȡ����
			byte[] buffer = new byte[10]; //ͨ����1024�������Ǵ���һ������Ϊ10�Ļ�����
			int len = -1;//��ʾ�Ѿ���ȡ�˶��ٸ��ֽ����������-1�����ļ��Ѿ���ȡ�������
			while((len = in.read(buffer)) != -1) {
				out.write(buffer, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void test1() {
		//������Դ����
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			//1������Դ
			File src = new File("stream.txt");
			File dest = new File("stream_copy.txt");
			//2����������Ĺܵ�
			in = new FileInputStream(src);
			out = new FileOutputStream(dest);
			//3��ͨ�����������ж�ȡ����
			byte[] buffer = new byte[10]; //ͨ����1024�������Ǵ���һ������Ϊ10�Ļ�����
			int len = -1;//��ʾ�Ѿ���ȡ�˶��ٸ��ֽ����������-1�����ļ��Ѿ���ȡ�������
			while((len = in.read(buffer)) != -1) {
				//��ӡһ�£���ȡ������
				//System.out.println(new String(buffer, 0, len));
				//������buffer�����У��߶���д
				out.write(buffer, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//4���رչܵ�
			try {
				if(in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
}
