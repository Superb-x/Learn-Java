package com.superbx.io;

import java.io.File;
/*
 * Ŀ¼�ָ���
 */
public class FileDemo1 {
	public static void main(String[] args) {
		//��ȡ���Էָ���
		String pathSeparator = File.pathSeparator;
		char pathSeparatorChar = File.pathSeparatorChar;
		System.out.println(pathSeparator + "--------" + pathSeparatorChar);
		//��ȡ·���ָ���
		String separator = File.separator;
		char separatorChar = File.separatorChar;
		System.out.println(separator + "-----" + separatorChar);
		//��ʾ�ļ�·��
		String path1 = "F:\\Learn\\Learn-Java\\README.md";
		String path2 = "F:/Learn/Learn-Java/README.md"; //������ʽ����ϵͳ��֧��
		String path3 = "F:"+File.separator+"Learn"+File.separator+"Learn-Java" + File.separator + "README.md";
	}
}
