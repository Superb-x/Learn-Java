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
		String s = "��ϵ������";  
        byte[] bytes = s.getBytes();  
          
        System.out.println("����ϵ������תΪ��ͬ���Ƶ��ַ�����");  
        System.out.println("����ת���Ľ��Ʒ�Χ��" + Character.MIN_RADIX + "-" + Character.MAX_RADIX);  
        System.out.println("2���ƣ�"   + binary(bytes, 2));  
        System.out.println("5���ƣ�"   + binary(bytes, 5));  
        System.out.println("8���ƣ�"   + binary(bytes, 8));  
        System.out.println("16���ƣ�"  + binary(bytes, 16));  
        System.out.println("32���ƣ�"  + binary(bytes, 32));  
        System.out.println("64���ƣ�"  + binary(bytes, 64));// ����Ѿ�������Χ��������Χ���Ϊ10������ʾ  
        
        System.out.println("---------------------");
        File srcFile = new File("file/ch.txt");
        
        InputStream in = new FileInputStream(srcFile);
        byte[] buffer = new byte[36];
        int len = -1;
        while((len = in.read(buffer)) > 0) {
        	System.out.println(binary(buffer, 2));//���ļ��Զ����Ƶ���ʽ��ӡ����
        }
        
        System.exit(0);  
	}
	public static String binary(byte[] bytes, int radix){  
        return new BigInteger(1, bytes).toString(radix);// �����1��������  
    }  
}
