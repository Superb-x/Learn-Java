//测试数组工具类
public class ArrayUtilDemo {
	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3};
		ArrayUtil.swap(nums, 0, 1);
		ArrayUtil.printArray(nums);
	}
}
