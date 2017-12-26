package com.superbx.io.memory_array;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * 字节的数组流/内存流
 */
public class ByteArrayDemo {
	public static void main(String[] args) throws IOException {
		//字节数组输出流
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write("ABCDE".getBytes());
		//要使用存储的临时数据
		byte[] buffer = bos.toByteArray();
		
		//字节数组输入流：内存->程序
		ByteArrayInputStream bin = new ByteArrayInputStream(buffer);
		byte[] bys = new byte[5];
		int len = -1;
		while((len = bin.read(bys)) > 0) { 
			System.out.println(new String(bys, 0, len));
		}
		bin.close();
		bos.close();
	}
}
