// ��������ʾ��
public class ArraySearchDemo {
	/*
	 * ��ѯkeyԪ���������е�һ�γ��ֵ�λ��
	 * ������
	 * 	arr������һ��������ȥ����ѯ
	 *  key����ǰȥ��ѯ��Ԫ��
	 */
	static int indexOf(int[] arr, int key) {
		for(int i = 0;i < arr.length;i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	// ����������ʽ�����Բ��ң�Ч�ʵ���
	public static void main(String[] args) {
		int[] arr = {10,20,30,10,50,-30,10};
		int beginIndex = ArraySearchDemo.indexOf(arr, 30);
		System.out.println(beginIndex);
	}
}
