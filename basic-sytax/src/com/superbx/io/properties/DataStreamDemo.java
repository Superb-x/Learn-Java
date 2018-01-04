package com.superbx.io.properties;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//数据流
public class DataStreamDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("file/out.txt");
		write(f);
		read(f);
	}

	private static void read(File f) throws Exception {
		DataInputStream in = new DataInputStream(new FileInputStream(f));
		System.out.println(in.readByte());
		System.out.println(in.readChar());
		System.out.println(in.readUTF());
	}

	private static void write(File f) throws IOException {
		DataOutputStream out = new DataOutputStream(new FileOutputStream(f));
		out.writeByte(65);
		out.writeChar('哥');
		out.writeUTF("小马哥");
		out.close();
	}
}
