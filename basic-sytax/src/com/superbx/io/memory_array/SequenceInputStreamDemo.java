package com.superbx.io.memory_array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

/*
 * 顺序流(合并流)
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//创建顺序流
		SequenceInputStream in = new SequenceInputStream(new FileInputStream("file/ch.txt"), new FileInputStream("file/stream2.txt"));
		byte[] buffer = new byte[1024];
		int len = -1;
		while((len = in.read(buffer)) > 0) {
			System.out.println(new String(buffer, 0, len));
		}
	}
}
