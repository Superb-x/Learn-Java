package demo;
// object��
public class ObjectDemo {
	public static void main(String[] args) {
		String str1 = new String("AA");
		String str2 = new String("AA");
		
		Object o1 = new Object();
		
		Object o2 = new Object();
		/*
		 * �ٷ��Ƽ�����ÿһ����������дequals����
		 */
		System.out.println(str1.equals(str2));
		System.out.println(o1.equals(o2));
	}
}
