// ���ֲ���
public class BinarySearchDemo {
	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int mid = binarySearch(nums, 10);
		System.out.println(mid);
	}
	
	static int binarySearch(int[] arr, int key) {
		int low = 0;//��С������
		int high = arr.length - 1;
		
		while(low <= high) {
			int mid = (low + high) >> 1; // �м�����
			int midVal = arr[mid]; // �м�Ԫ�ص�ֵ
			if (midVal > key) { // ����
				high = mid - 1;
			} else if (midVal < key) {
				low = mid;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
}
