package demo;
/*
 * �����������淶
 *   1��ȫ��СЩ��������Ҫ��ѭ��ʶ���淶
 *   2����ҵ�����У��������й�˾������д�����磺
 *           com.superbx
 *           ��������֣�==>com.520==>�������»��ߴ���.(com._520)
 *           ��Android�У����package��ʹ����_ �����ܲ���ģ�����ϣ���ʱ��������ĸ����
 *           ����: com.m520;
 *           
 *   3���Զ���İ���������Java.��ͷ        
 *   ��ʽ��
 *       package ������д.��Ŀ��.ģ����.�����
 *                
 */
import java.util.Arrays;

public class PackageDemo {
	public static void main(String[] args) {
		int[] arr = new int[]{1,5,2,4,3,6,8,9,7};

		String str = Arrays.toString(arr);
		System.out.println(str);
		
		Arrays.sort(arr);
		str = Arrays.toString(arr);
		System.out.println(str);
	}
}
