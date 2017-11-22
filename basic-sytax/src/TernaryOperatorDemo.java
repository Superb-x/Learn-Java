// 三目运算符
public class TernaryOperatorDemo {
	public static void main(String[] args) {
		/*
		 * 需求：
		 *     读取3.49的整数部分
		 *     读取3.49的小数部分
		 *     把0.49和0.5作比较
		 */
		double num = 3.49;
		
		int num1 = (int)num; // 整数部分
		double num2 = num - num1; // 小数部分
		
		int result = num2 >= 0.5?num1 + 1 : num1; // java中一定要注意数据类型
		System.out.println(result);
		
		// 判断奇偶数
		/*
		 * 判断一个数的奇偶，只需要判断除以2以后的余数是否为9，-->偶数
		 * 不能直接判断是否为1
		 */
		int number = 11;
		String ret = number % 2 == 0 ? "偶数" : "奇数";
		System.out.print(ret);
	}
}
