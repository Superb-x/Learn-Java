package com.superbx.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileDemo3 {
	public static void main(String[] args) {
		//期望效果：Study>learn-java>basic-sytax>src>com>superbx>io>FileDemo3.java
		String file = "E:/Study/learn-java/basic-sytax/src/com/superbx/io/FileDemo3.java";
		File f = new File(file);
		//父级目录：io
		//System.out.println(f.getParentFile().getName());
		//父级的父级: superbx
		//System.out.println(f.getParentFile().getParentFile().getName());
		List<String> parentNames = new ArrayList<>();
		listAllParent(parentNames, f);
		Collections.reverse(parentNames);
		System.out.println(parentNames);
		StringBuilder sb = new StringBuilder(40); //自己大致的去估计一下个数
		for (String name : parentNames) {
			sb.append(name).append(">");
		}
		sb.deleteCharAt(sb.length() - 1);//删除最后一个字符
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
