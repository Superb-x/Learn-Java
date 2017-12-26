package com.superbx.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * �ļ����Ʋ���ʾ��
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		//1���ҵ�ԴĿ¼�����е�java�ļ�
		File srcDir = new File("java");
		File destDir = new File("text");
		File[] fs = srcDir.listFiles(new FilenameFilter(){
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});
		//������ÿһ���Խ����󲢽��俽��
		for (File file : fs) {
			//����������
			InputStream in = new FileInputStream(file);
			OutputStream out = new FileOutputStream(new File(destDir, file.getName()));
			//��д����
			byte[] buffer = new byte[1024]; //һ���Կ��Զ�ȡ1024���ֽ�
			int len = -1;//��ʾ�Ѿ���ȡ���ֽ������ڵײ�涨�Ƕ�ȡ��ĩβ����-1
			while((len = in.read(buffer)) > 0) {
				out.write(buffer, 0, len);
			}
			//�ر���Դ
			in.close();
			out.close();
			//�޸Ŀ���֮����ļ�������
			String newName = file.getName().substring(0, (file.getName().length() - 5)); //�ַ����Ľ�ȡ
			File newFile = new File(destDir, file.getName());
			newFile.renameTo(new File(destDir, newName + ".js"));
		}
		
	}
}
