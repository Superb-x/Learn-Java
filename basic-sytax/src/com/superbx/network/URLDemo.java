package com.superbx.network;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

//URL对象
/*
 * 使用tomcat必须先配置环境变量
 */
public class URLDemo {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http", "localhost", 8080, "/tomcat.png");
		//打开URL连接对象
		URLConnection conn = url.openConnection();
		//InputStream getInputStream()返回从此打开的连接读取的输入流
		//网络------输入------>程序中
		InputStream in = conn.getInputStream();
		/*Scanner sc = new Scanner(in);
		while(sc.hasNext()){
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();*/
		//把tomcat.png图片保存到本地磁盘中
		Files.copy(in, Paths.get("xx.png"));
	}
}
