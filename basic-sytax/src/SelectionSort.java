
public class SelectionSort {
	
	// 当前算法不允许产生任何实例
	private SelectionSort(){}
	
	public static void sort(int[] arr) {
		
		int n = arr.length;
		for (int i = 0;i < n;i++) {
			// 寻找最小值
			int minIndex = i;
			for (int j = i + 1;j < n;j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
	}
	
	private static void swap(int[] arr, int i, int j){
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	
	public static void main (String[] args) {
		int [] arr = {10,9,8,7,6,5,4,3,2,1};
		SelectionSort.sort(arr);
		for (int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println("========");
	}
}
