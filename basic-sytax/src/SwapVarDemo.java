// 交换两个变量的值
public class SwapVarDemo {
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a="+a + ", b="+b);
		
		// 这种方法交换变量，只能适用于数字类型，其他的是不可以的
		int c = 10;
		int d = 20;
		c = c ^ d;
		d = d ^ c;
		c = c ^ d;
		
		System.out.println("异或运算之后的值: "+ c);
		
		System.out.println(100 ^ 5 ^ 5); // 利用异或的特性也可以
	}
}
