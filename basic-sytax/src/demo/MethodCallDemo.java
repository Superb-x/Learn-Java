package demo;
/*
 * ��̬ʱ�����������⣺
 *     ǰ�᣺������ڶ�̬
 */

// ����
class SuperClass{
	public static void doWork(){
		System.out.println("Super.dowork");
	}
}

// ����
class SubClass extends SuperClass{
	public static void doWork(){
		System.out.println("sub.dowork");
	}
}
public class MethodCallDemo {
	public static void main(String[] args) {
		SuperClass c1 = new SubClass(); // ��������л�ȥSuperClass���ҵ�dowork����
		c1.doWork();
		//��ʹ��static����ʱ����ʹ�ñ����������ø÷���
	}
}
