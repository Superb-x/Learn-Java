package com.superbx.io;

import java.io.File;

/*
 * 批量修改文件操作
 */
public class FileDemo4 {
	public static void main(String[] args) {
		File dir = new File("E:/abc");
		//获取当前目录下所有的文件
		File[] fs = dir.listFiles();
		//批量替换
		for (File file : fs) {
			//如果包含了这个
			if(file.getName().contains("H55B54A5B")) {
				String newName = file.getName().replace("H55B54A5B", "toyota");
				file.renameTo(new File(dir, newName));
			}
		}
	}
}
