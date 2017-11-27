// ����Ĺ����࣬���Ǻܶ��������ķ���
public class ArrayUtil {
	//��ӡ����
	static void printArray(int[] arr) {
		if (arr == null) {
			System.out.println("null");
			return;
		}
		String ret = "[";
		for (int i = 0;i < arr.length;i++) {
			ret += arr[i];
			if (i != arr.length - 1) {
				ret += ",";
			}
		}
		ret += "]";
		System.out.println(ret);
	}
	
	// �����鵹��
	static int[] reverse(int[] oldArr) {
		int[] newArr = new int[oldArr.length];
		for (int i = oldArr.length;i >= 0;i --){
			newArr[oldArr.length - 1 - i] = oldArr[i];
		}
		return newArr;
	}
	
	// ���ֲ���
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
	
	//��ȡ�����е����ֵ
	static int getMax(int[] arr) {
		if (arr == null) {
			System.out.println("null");
		}
		int min = arr[0];
		for (int i = 0;i < arr.length;i++) {
			if (arr[i] > min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	// ��ȡ��������С�Ķ�ֵ
	static int getMin(int[] arr) {
		if (arr == null) {
			System.out.println("null");
		}
		int min = arr[0];
		for (int i = 0;i < arr.length;i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
	}
	
	// swap����λ��
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	// ����(ð������)
	
	static void sort(int[] arr) {
		for (int i = 0;i < arr.length - 1;i++) {
			for(int j = i + 1;i < arr.length - 1 - i;j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}
}
