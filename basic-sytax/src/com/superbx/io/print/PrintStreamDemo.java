package com.superbx.io.print;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

//�ֽڴ�ӡ��Stream
//�ַ���ӡ��Writer
/*
 * ����PrintStrean��˵���������ֶ��Զ�ˢ��֮�󣬵���println����printf����format��������������Զ�ˢ��
 * ���û�п����Զ�ˢ�£�����Ҫ�ֶ�ˢ��
 */
public class PrintStreamDemo {
	public static void main(String[] args) throws IOException {
		PrintStream ps = new PrintStream(new File("file/out"));
		ps.write("ABC".getBytes());
		ps.print(true);
		ps.print(17);
		ps.println("xyz");
	}
}
