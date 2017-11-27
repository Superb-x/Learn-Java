// java中的增强for循环
public class ForEachDemo {
	/*
	 * Java5之后有一个可变参数
	 */
	static double getSum(double ... arr) {
		double sum = 0.0;
		for(double price: arr) {
			sum += price;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] nums = new int[]{10,20,30,40,50};
		//使用循环迭代出数组中的没一个元素
		for (int i = 0;i < nums.length;i++) {
			System.out.println(nums[i]);
		}
		for(int ele : nums) {
			System.out.println(ele);
		}
		double sum = getSum(1.0,20.5,3.05,50.5);
		System.out.println(sum);
	}
}
