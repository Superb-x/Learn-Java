// 整数类型 （byte、int、short、long）
public class IntegerDemo {
	public static void main(String[] args) {
		/**
		 * ①二进制整数：以0b或者0B开头，例如：int a = 0B110;
		 * ②八进制整数：要求以0开头，例如：int a = 012；
		 * ③十进制整数：如：int a = 17;
		 * ④十六进制整数：要求以0X或者0x开头，如int a = 0x12；
		 */
		// 表示十进制的常量
		System.out.println(100);
		// 表示二进制的常量
		System.out.println(0b01101110);  // byte常量
		System.out.println(0b00000000_01101110); // short常量，占两个字节
		System.out.println(0b00000000_00000000_00000000_01101110); // int的常量
		// 表示八进制的常量
		System.out.println(0156);
		// 表示十六进制的常量
		System.out.println(0x6E);
		
		// 整数的变量
		// 整数类型 变量 = 整数值的常量;
		byte age = 127;
		System.out.println(age);
		
		// 对Java基本数据类型范围有个概念即可，现在通常使用int
	}
}
