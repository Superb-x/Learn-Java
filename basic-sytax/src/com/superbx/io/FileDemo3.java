package com.superbx.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileDemo3 {
	public static void main(String[] args) {
		//����Ч����Study>learn-java>basic-sytax>src>com>superbx>io>FileDemo3.java
		String file = "E:/Study/learn-java/basic-sytax/src/com/superbx/io/FileDemo3.java";
		File f = new File(file);
		//����Ŀ¼��io
		//System.out.println(f.getParentFile().getName());
		//�����ĸ���: superbx
		//System.out.println(f.getParentFile().getParentFile().getName());
		List<String> parentNames = new ArrayList<>();
		listAllParent(parentNames, f);
		Collections.reverse(parentNames);
		System.out.println(parentNames);
		StringBuilder sb = new StringBuilder(40); //�Լ����µ�ȥ����һ�¸���
		for (String name : parentNames) {
			sb.append(name).append(">");
		}
		sb.deleteCharAt(sb.length() - 1);//ɾ�����һ���ַ�
		System.out.println(sb);
	}

	private static void listAllParent(List<String> parentNames, File f) {
		if(!"".equals(f.getParentFile().getName())) {
			parentNames.add(f.getParentFile().getName());			
		}
		if(f.getParentFile().getParentFile() != null) {
			listAllParent(parentNames, f.getParentFile());
		}
	}
}
