package com.superbx.exception;
//�������쳣
public class MultiCatchDemo {
	public static void main(String[] args) {
		System.out.println("begin------------");
		String snum1 = "10";
		String snum2 = "2B";
		try {
			// ��Stringת����int����
			int num1 = Integer.parseInt(snum1);
			int num2 = Integer.parseInt(snum2);
			
			// �����������
			int ret = num1 / num2;
			System.out.println("��� = " + ret);
		} catch (ArithmeticException e) {
			System.out.println("��ѧ����ʱ����������Ϊ0");
		} catch (NumberFormatException e) {
			System.out.println("�������ͽ�������");
		} finally {
			System.out.println("�������");
		}
		try {
			
		} finally {
			// TODO: ���ձ���ִ�еĴ���
		}
		System.out.println("ending----------------");
	}
}
