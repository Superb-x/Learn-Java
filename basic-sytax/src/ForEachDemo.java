// java�е���ǿforѭ��
public class ForEachDemo {
	/*
	 * Java5֮����һ���ɱ����
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
		//ʹ��ѭ�������������е�ûһ��Ԫ��
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
