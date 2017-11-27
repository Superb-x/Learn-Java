// 冒泡排序
public class BubbleSortDemo {
	public static void main(String[] args) {
		
		int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
		sort(nums);
		for (int i = 0;i < nums.length;i++) {
			System.out.print(nums[i]);
		}
	}
	static void sort(int[] arr) {
		for(int i = 0;i < arr.length - 1;i++) { // 外层 循环控制次数
			for (int j = i + 1;j < arr.length - i;j++) { // 内层循环来做比较
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
