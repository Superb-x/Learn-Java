package com.superbx.io;

import java.io.File;

/*
 * �����޸��ļ�����
 */
public class FileDemo4 {
	public static void main(String[] args) {
		File dir = new File("E:/abc");
		//��ȡ��ǰĿ¼�����е��ļ�
		File[] fs = dir.listFiles();
		//�����滻
		for (File file : fs) {
			//������������
			if(file.getName().contains("H55B54A5B")) {
				String newName = file.getName().replace("H55B54A5B", "toyota");
				file.renameTo(new File(dir, newName));
			}
		}
	}
}
