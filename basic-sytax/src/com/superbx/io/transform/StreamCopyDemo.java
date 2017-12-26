package com.superbx.io.transform;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class StreamCopyDemo {
	public static void main(String[] args) throws IOException {
		//1、创建源
		File srcFile = new File("file/ch3.txt");
		File destFile = new File("file/ch3_copy.txt");
		//2、创建输入流和输出流对象（创建管道）
		Reader in = new InputStreamReader(new FileInputStream(srcFile), "GBK"); //是可以相互转换的
		Writer out = new OutputStreamWriter(new FileOutputStream(destFile), "GBK"); //可以相互转换
		//3、读取操作
		char[] buffer = new char[100]; //每次读取1024个字符
		int len = -1;
		len = in.read(buffer);
		while(len > 0){
			out.write(buffer, 0, len);
			len = in.read(buffer);
		}
		//4、关闭源
		in.close();
		out.close();
	}
}
