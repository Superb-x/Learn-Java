// java数组
public class ArrayIntDemo {
	public static void main(String[] args) {
		int[] arr = new int[]{1,3,5,7,9}; // 这里如果没被引用的话是会被销毁的 
		/*
		 * new 关键字是在堆内存中开辟一个内存区域，用来存储数据
		 * 其中内存地址是十六进制来表示的，
		 * java中数组，对象，类，都是在堆内存中
		 */
		arr = new int[]{1,2,3};
		//System.out.println(arr.length);
		/*
		 * 当我们事先知道要存哪些数据的时候，就用静态初始化方法，
		 * 不知道要存储哪些数据的时候，只能使用动态初始化
		 */
		int[] nums = new int[]{1,2,3,4,5};
		//System.out.println(nums.length);
		
		String[] nums2 = null;
		// System.out.println(nums2.length); // 这是会报错的，空指针了
		for (int i = 0;i < nums.length;i++){
			System.out.println(nums[i]);
		}
	}
}