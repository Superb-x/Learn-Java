package com.superbx.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Arrays;

public class ShowBinaryStringDemo {
	public static void main(String[] args) throws IOException {
		String s = "唔系渣渣辉";  
        byte[] bytes = s.getBytes();  
          
        System.out.println("将唔系渣渣辉转为不同进制的字符串：");  
        System.out.println("可以转换的进制范围：" + Character.MIN_RADIX + "-" + Character.MAX_RADIX);  
        System.out.println("2进制："   + binary(bytes, 2));  
        System.out.println("5进制："   + binary(bytes, 5));  
        System.out.println("8进制："   + binary(bytes, 8));  
        System.out.println("16进制："  + binary(bytes, 16));  
        System.out.println("32进制："  + binary(bytes, 32));  
        System.out.println("64进制："  + binary(bytes, 64));// 这个已经超出范围，超出范围后变为10进制显示  
        
        System.out.println("---------------------");
        File srcFile = new File("file/ch.txt");
        
        InputStream in = new FileInputStream(srcFile);
        byte[] buffer = new byte[36];
        int len = -1;
        while((len = in.read(buffer)) > 0) {
        	System.out.println(binary(buffer, 2));//将文件以二进制的形式打印出来
        }
        
        System.exit(0);  
	}
	public static String binary(byte[] bytes, int radix){  
        return new BigInteger(1, bytes).toString(radix);// 这里的1代表正数  
    }  
}
