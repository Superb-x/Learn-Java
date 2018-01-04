package com.superbx.io.pipe;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/*
 * 管道流
 */

//发送数据给B线程
class AThread extends Thread {
	private PipedOutputStream out = new PipedOutputStream();
	public void run() {
		try {
			for(int i = 65; i < 65 + 26;i++) {
				out.write(i);
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public PipedOutputStream getOut() {
		return out;
	};
}
//线程B接收A线程发送的数据
class BThread extends Thread {
	PipedInputStream in = null;
	public BThread(AThread aThread) throws Exception {
		in = new PipedInputStream(aThread.getOut());
	}
	public void run() {
		int len = -1;
		try {
			while((len = in.read()) != -1) {
				System.out.println((char)len);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class PipedStreamDemo {
	public static void main(String[] args) throws Exception {
		AThread a = new AThread();
		BThread b = new BThread(a);
		a.start();
		b.start();
	}
}
