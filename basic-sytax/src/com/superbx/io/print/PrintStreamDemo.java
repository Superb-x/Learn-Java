package com.superbx.io.print;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

//字节打印流Stream
//字符打印流Writer
/*
 * 对于PrintStrean来说，当启动字段自动刷新之后，调用println或者printf或者format方法，便会立马自动刷新
 * 如果没有开启自动刷新，则需要手动刷新
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
