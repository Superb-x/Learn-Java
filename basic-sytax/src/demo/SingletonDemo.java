package demo;

class ArrayUtil {
	// 1�������ڸ����У��Լ�������һ������
	private static ArrayUtil instance = new ArrayUtil();
	// 2��˽�л�����Ĺ���������ֹ���ͨ�������������µĶ���
	private ArrayUtil(){}
	// 3�����Ⱪ¶һ�������ľ�̬�������ڻ�ȡ����Ķ���
	public static ArrayUtil getInstance(){
		return instance;
	}
	public void sort(int[] arr) {
		System.out.println("����Ҫ����");
	}
}
// ����
public class SingletonDemo {
	public static void main(String[] args) {
		System.out.println(ArrayUtil.getInstance() == ArrayUtil.getInstance()); // ��ʱ���Ϊtrue����Ϊָ�����ͬһ���ڴ��ַ
		// ��Ҫ����������ͬ������
		ArrayUtil.getInstance().sort(null);
		// ��Ҫ��������
		ArrayUtil.getInstance().sort(null);
		// ��Ҫ��������
		ArrayUtil.getInstance().sort(null);
		// ��Ҫ��������
		ArrayUtil.getInstance().sort(null);
	}
}
