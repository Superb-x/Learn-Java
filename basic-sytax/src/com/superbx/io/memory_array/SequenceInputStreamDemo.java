package com.superbx.io.memory_array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

/*
 * ˳����(�ϲ���)
 */
public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		//����˳����
		SequenceInputStream in = new SequenceInputStream(new FileInputStream("file/ch.txt"), new FileInputStream("file/stream2.txt"));
		byte[] buffer = new byte[1024];
		int len = -1;
		while((len = in.read(buffer)) > 0) {
			System.out.println(new String(buffer, 0, len));
		}
	}
}
