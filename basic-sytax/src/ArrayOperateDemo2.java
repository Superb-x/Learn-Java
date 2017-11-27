// 数组操作方法
public class ArrayOperateDemo2 {
	
	// 获取数组最大元素
	static int getMax(int[] nums) {
		int max = nums[0];
		for (int i = 0;i < nums.length;i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}
	
	// 打印数组
	static void printArray(String[] arr) {
		if (arr == null) {
			System.out.println("null");
			return;
		}
		String ret = "[";
		for (int i = 0;i < arr.length;i++) {
			ret = ret + arr[i];
			if (i != arr.length - 1) {
				ret += ", ";
			}
		}		
		ret = ret + "]"; 
		System.out.println(ret);
	}
	
	// 逆序排列
	static String[] reverse(String[] arr) {
		// 创建一个新的数组用来存放一个垫到之后的元素
		String[] newArr = new String[arr.length];
		for (int i = arr.length - 1;i >= 0;i --){
			newArr[arr.length - 1 - i] = arr[i];
		}
		
		return newArr; 
	}
	
	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
		int max = ArrayOperateDemo2.getMax(nums);
		System.out.println("该数组中最大的值是：" + max);
		//System.out.println(nums); // 直接打印数组的话，会打印出一个hash值
		
		String[] arr = {"A", "B", "C", "D", "E"};
		String[] arr2 = {"java", "love", "I", "world", "Hello"};
		String[] newArr = ArrayOperateDemo2.reverse(arr2);
		ArrayOperateDemo2.printArray(arr);
		ArrayOperateDemo2.printArray(newArr);
	}
}
