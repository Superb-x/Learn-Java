// ���ظ���
/*
 * ������������ơ�overload��
 * ���ط����Ķ�������ͬһ�����У�ĳ�����������һ�����ϵ�ͬ��������ֻҪ���ǵĲ����б�ͬ����
 * �������ص����ã�������һ���ܵķ������ڲ�����ͬ����ɷ������Ʋ�ͬ
 */
public class OverloadDemo {
	
	// ����������֮��
	static int getSum(int x, int y){
		return x + y;
	}
	
	// ������С��֮��
	static double getSum(double x, double y){
		return x + y;
	}
	
	// ��ͬһ�����зֱ��ӡString��int��double��boolean���͵ķ���	
	static void pString(String str) {
		System.out.println(str);
	}
	/*
	 * ���������ж�ԭ�򣺡���ͬһ��ͬ��
	 * ��ͬ��ͬ��������������ͬ
	 * һ��ͬ������������ͬ���������ͣ���������������˳��
	 * ע�⣺�������غͷ�������ֵ�����޹أ�ֻ��һ��Ҫ�󷵻�ֵ����һֱ
	 */
	public static void main(String[] args) {
		int a = OverloadDemo.getSum(4,5);
		double b = OverloadDemo.getSum(1.1, 2.3);
		System.out.println(a);
		System.out.println(b);
	}
}
