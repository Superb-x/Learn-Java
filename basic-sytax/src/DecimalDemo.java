// 小数类型
public class DecimalDemo {
	public static void main(String[] args) {
		// 小数常量默认是double类型的
		System.out.println(3.14); //double类型的常量
		System.out.println(3.14F); // float类型的常量
		System.out.println(3.14E2); // 3.140 实际开发中用的不多，了解即可
		// 小数变量
		double pi = 3.14;
		float pi2 = 3.14F;
		
		double a = 1.000000000000000001;
		double b = 1.00000000001234;
		System.out.println(a + b); // 计算精度要求比较高的要用bigDecimal类型，无论是double还是float都无法表示非常精的小数
		System.out.println(pi);
		System.out.println(pi2);
	}
}
