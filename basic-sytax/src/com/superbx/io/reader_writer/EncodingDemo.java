package com.superbx.io.reader_writer;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * 编码和解码
 */
public class EncodingDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String msg = "唔系渣渣辉";
		//编码操作：String-->byte[]
		byte[] data = msg.getBytes("GBK");
		System.out.println(Arrays.toString(data));
		//编码之后开始传递
		
		//解码操作：byte[]-->String
		//因为服务器都是老外写的，所以老外都是使用自己的ISO-8859-1来解码
		String ret = new String(data, "ISO-8859-1"); //此时对于中文来说就是乱码了
		System.out.println(ret);
		//解决方案：
		data = ret.getBytes("ISO-8859-1");
		System.out.println(Arrays.toString(data));
		ret = new String(data, "GBK");
		System.out.println(ret);
	}
}
