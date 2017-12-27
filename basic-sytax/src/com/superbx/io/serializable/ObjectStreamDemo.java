package com.superbx.io.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * ʹ�ö�������ʵ�����л��뷴���л�
 */
public class ObjectStreamDemo {
	public static void main(String[] args) throws Exception {
		File f = new File("file/ch.txt");
		
		//writeObject(f);
		readObject(f);
	}
	
	//���л�����
	private static void writeObject(File f) throws IOException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		out.writeObject(new User("lxl", "password", 23));
		out.close();
	}
	//�����л�����
	private static void readObject(File f) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		User user = (User) in.readObject();
		System.out.println(user);
		in.close();
	}
}
