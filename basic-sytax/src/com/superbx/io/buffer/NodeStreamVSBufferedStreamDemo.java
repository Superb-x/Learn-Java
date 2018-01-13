package com.superbx.io.buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//节点流和缓冲流 
//使用节点流按字节读取和1024字节读/写
//使用缓冲流按字节读取和1024字节读/写
public class NodeStreamVSBufferedStreamDemo {
	public static void main(String[] args) throws Exception {
		File f1 = new File("C:/IOtest/node/123.mp4");
		// File dest = new File("C:/IOtest/node/456.avi");
		// File dest = new File("C:/IOtest/node/456.avi");
		// test1(f1); // 节点流按字节读取35839ms
		// test2(f1); //节点按1024字节读取 66ms
		// test3(f1); //缓冲流按字节读取  530ms
		//test4(f1); //缓冲流按1024字节读取28ms

	}

	private static void test4(File f) throws Exception {
		File f2 = new File("C:/IOtest/node/buffer.mp4");
		long time1 = System.currentTimeMillis();
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(f));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(f2));
		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer,0,len);
		}
		in.close();
		out.close();
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);
	
	}

	// 使用缓冲流按字节读取
	private static void test3(File f) throws Exception {
		File f2 = new File("C:/IOtest/node/bufferin.mp4");
		long time1 = System.currentTimeMillis();
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(f));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(f2));
		int len = -1;
		while ((len = in.read()) != -1) {
			out.write(len);
		}
		in.close();
		out.close();
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);
	}

	// 节点流按1024读取
	private static void test2(File f) throws Exception {
		File f2 = new File("C:/IOtest/node/nodebuffer.mp4");
		long time1 = System.currentTimeMillis();
		InputStream in = new FileInputStream(f);
		OutputStream out = new FileOutputStream(f2);
		byte[] buffer = new byte[1024];
		int len = -1;
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer, 0, len);
		}
		in.close();
		out.close();
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);
	}

	// 使用节点流按字节读取
	private static void test1(File f) throws IOException {
		File f2 = new File("C:/IOtest/node/nodein.mp4");
		long time1 = System.currentTimeMillis();
		InputStream in = new FileInputStream(f);
		OutputStream out = new FileOutputStream(f2);
		int len = -1;
		while ((len = in.read()) != -1) {
			out.write(len);
		}
		in.close();
		out.close();
		long time2 = System.currentTimeMillis();
		System.out.println(time2 - time1);

	}
}
