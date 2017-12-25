package com.superbx.io;

import java.io.File;
import java.io.FilenameFilter;

/*
 * ÎÄ¼þ¹ýÂËÆ÷
 */
public class FileDemo5 {
	public static void main(String[] args) {
		File dir = new File("E:/abc");
		File[] fs = dir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".ipa");
			}
		});
		for (File file : fs) {
			System.out.println(file);
		}
	}
}
