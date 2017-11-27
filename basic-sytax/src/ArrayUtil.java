// 数组的工具类，涵盖很多操作数组的方法
public class ArrayUtil {
	//打印数组
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
	
	// 将数组倒置
	static int[] reverse(int[] oldArr) {
		int[] newArr = new int[oldArr.length];
		for (int i = oldArr.length;i >= 0;i --){
			newArr[oldArr.length - 1 - i] = oldArr[i];
		}
		return newArr;
	}
	
	// 二分查找
	static int binarySearch(int[] arr, int key) {
		int low = 0;//最小的索引
		int high = arr.length - 1;
		
		while(low <= high) {
			int mid = (low + high) >> 1; // 中间索引
			int midVal = arr[mid]; // 中间元素的值
			if (midVal > key) { // 大了
				high = mid - 1;
			} else if (midVal < key) {
				low = mid;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
	
	//获取数组中的最大值
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
	
	// 获取数组中最小的额值
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
	
	// swap交换位置
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	// 排序(冒泡排序)
	
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
