package com.superbx.io;

import java.io.File;
/*
 * 目录分隔符
 */
public class FileDemo1 {
	public static void main(String[] args) {
		//获取属性分隔符
		String pathSeparator = File.pathSeparator;
		char pathSeparatorChar = File.pathSeparatorChar;
		System.out.println(pathSeparator + "--------" + pathSeparatorChar);
		//获取路径分隔符
		String separator = File.separator;
		char separatorChar = File.separatorChar;
		System.out.println(separator + "-----" + separatorChar);
		//表示文件路径
		String path1 = "F:\\Learn\\Learn-Java\\README.md";
		String path2 = "F:/Learn/Learn-Java/README.md"; //这种形式两种系统都支持
		String path3 = "F:"+File.separator+"Learn"+File.separator+"Learn-Java" + File.separator + "README.md";
	}
}
