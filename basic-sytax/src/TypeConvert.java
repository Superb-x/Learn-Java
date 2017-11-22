// Java数据类型转换
public class TypeConvert {
	public static void main(String[] args){
		/*
		 * java中数据类型从小转到大可以自动为完成，如果从大到小，就需要使用强制转换
		 * 其中布尔值不参与类型转换
		 */
		/*
		 * byte的二进制表示:  00000101
		 * short的二进制表示: 00000000_00000101
		 * int的二进制表示:   00000000_00000000_00000000_00000101
		 */
		byte b1 = 5;
		short s1 = b1; // 小转大
		int i1 = s1;
		long l1 = i1;
		
		float f1 = l1;
		double d1 = f1;
		System.out.println(d1);
		
		// =========强制类型转换==========
		float f2 = (float)d1;
		
		double pi = 3.14;
		int i2 = (int)pi;
		
		// 整数常量默认是int类型
		// 把一个int类型常量直接赋值给byte类型变量
		byte b2 = 123;
		// 编译器发现123在byte的数据范围内，底层就自己给转换成byte类型
		
		double d3 = 123 + 1.1F + 99L + 3.14; // 数据类型比较重要，一定学扎实
		
		System.out.println('A' + 1);
		
		byte b4 = 25;
	
	}
}
