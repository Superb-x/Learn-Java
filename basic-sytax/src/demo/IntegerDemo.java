package demo;
// ��ʾ������װ��
/*
 * �˴�����������͵İ�װ�඼ʹ��final���Σ����������࣬���ܱ��̳�
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//װ�����:��һ���������͵�ֵ��ת��Ϊ��Ӧ��װ�����
		//��ʽһ
		Integer num = new Integer(17);
		//��ʽ��
		Integer num2 = Integer.valueOf(17);
		// �������
		
		int num3 = num.intValue();
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("--------------");
		
		// �Զ�װ�䣺����ֱ�Ӱ�һ���������͵�ֵ������Ӧ�İ�װ�����
		Integer num4 = 17;
		// �Զ����䣺����ֱ�Ӱ�һ����װ��Ķ��󸳸���Ӧ�Ļ������ͱ���
		int num5 = num4;
		String str = "123";
		int num6 = Integer.parseInt(str);
		System.out.println(num6);
	}
}
