// Java��������ת��
public class TypeConvert {
	public static void main(String[] args){
		/*
		 * java���������ʹ�Сת��������Զ�Ϊ��ɣ�����Ӵ�С������Ҫʹ��ǿ��ת��
		 * ���в���ֵ����������ת��
		 */
		/*
		 * byte�Ķ����Ʊ�ʾ:  00000101
		 * short�Ķ����Ʊ�ʾ: 00000000_00000101
		 * int�Ķ����Ʊ�ʾ:   00000000_00000000_00000000_00000101
		 */
		byte b1 = 5;
		short s1 = b1; // Сת��
		int i1 = s1;
		long l1 = i1;
		
		float f1 = l1;
		double d1 = f1;
		System.out.println(d1);
		
		// =========ǿ������ת��==========
		float f2 = (float)d1;
		
		double pi = 3.14;
		int i2 = (int)pi;
		
		// ��������Ĭ����int����
		// ��һ��int���ͳ���ֱ�Ӹ�ֵ��byte���ͱ���
		byte b2 = 123;
		// ����������123��byte�����ݷ�Χ�ڣ��ײ���Լ���ת����byte����
		
		double d3 = 123 + 1.1F + 99L + 3.14; // �������ͱȽ���Ҫ��һ��ѧ��ʵ
		
		System.out.println('A' + 1);
		
		byte b4 = 25;
	
	}
}
