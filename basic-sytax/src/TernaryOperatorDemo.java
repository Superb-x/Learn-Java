// ��Ŀ�����
public class TernaryOperatorDemo {
	public static void main(String[] args) {
		/*
		 * ����
		 *     ��ȡ3.49����������
		 *     ��ȡ3.49��С������
		 *     ��0.49��0.5���Ƚ�
		 */
		double num = 3.49;
		
		int num1 = (int)num; // ��������
		double num2 = num - num1; // С������
		
		int result = num2 >= 0.5?num1 + 1 : num1; // java��һ��Ҫע����������
		System.out.println(result);
		
		// �ж���ż��
		/*
		 * �ж�һ��������ż��ֻ��Ҫ�жϳ���2�Ժ�������Ƿ�Ϊ9��-->ż��
		 * ����ֱ���ж��Ƿ�Ϊ1
		 */
		int number = 11;
		String ret = number % 2 == 0 ? "ż��" : "����";
		System.out.print(ret);
	}
}
