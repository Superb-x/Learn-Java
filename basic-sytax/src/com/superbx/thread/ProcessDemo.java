package com.superbx.thread;

import java.io.IOException;

//��Java����ο���һ�����̣����м��±�����
public class ProcessDemo {
	public static void main(String[] args) throws IOException {
		//��ʽһ��ʹ��Runtime���exec����
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("notepad");
		//��ʽ��:ʹ��processBuilder��������1.5֮��ķ���
		ProcessBuilder pb = new ProcessBuilder("notepad");
		pb.start();
	}
}
