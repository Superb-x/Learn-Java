package com.superbx.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 文件复制操作示例
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		//1、找到源目录中所有的java文件
		File srcDir = new File("java");
		File destDir = new File("text");
		File[] fs = srcDir.listFiles(new FilenameFilter(){
			public boolean accept(File dir, String name) {
				return new File(dir, name).isFile() && name.endsWith(".java");
			}
		});
		//迭代出每一个对剑对象并将其拷贝
		for (File file : fs) {
			//创建流对象
			InputStream in = new FileInputStream(file);
			OutputStream out = new FileOutputStream(new File(destDir, file.getName()));
			//读写操作
			byte[] buffer = new byte[1024]; //一次性可以读取1024个字节
			int len = -1;//表示已经读取的字节数，在底层规定是读取到末尾就是-1
			while((len = in.read(buffer)) > 0) {
				out.write(buffer, 0, len);
			}
			//关闭资源
			in.close();
			out.close();
			//修改拷贝之后的文件的名称
			String newName = file.getName().substring(0, (file.getName().length() - 5)); //字符串的截取
			File newFile = new File(destDir, file.getName());
			newFile.renameTo(new File(destDir, newName + ".js"));
		}
		
	}
}
