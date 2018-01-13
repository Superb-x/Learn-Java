package com.superbx.network;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

//URL����
/*
 * ʹ��tomcat���������û�������
 */
public class URLDemo {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http", "localhost", 8080, "/tomcat.png");
		//��URL���Ӷ���
		URLConnection conn = url.openConnection();
		//InputStream getInputStream()���شӴ˴򿪵����Ӷ�ȡ��������
		//����------����------>������
		InputStream in = conn.getInputStream();
		/*Scanner sc = new Scanner(in);
		while(sc.hasNext()){
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();*/
		//��tomcat.pngͼƬ���浽���ش�����
		Files.copy(in, Paths.get("xx.png"));
	}
}
