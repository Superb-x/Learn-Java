// 数组搜索示例
public class ArraySearchDemo {
	/*
	 * 查询key元素在数组中第一次出现的位置
	 * 参数：
	 * 	arr：从哪一个数组中去做查询
	 *  key：当前去查询的元素
	 */
	static int indexOf(int[] arr, int key) {
		for(int i = 0;i < arr.length;i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	// 这种搜索方式是线性查找，效率低下
	public static void main(String[] args) {
		int[] arr = {10,20,30,10,50,-30,10};
		int beginIndex = ArraySearchDemo.indexOf(arr, 30);
		System.out.println(beginIndex);
	}
}
