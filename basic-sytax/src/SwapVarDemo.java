// 交换两个变量的值
public class SwapVarDemo {
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a="+a + ", b="+b);
		
		System.out.println(100 ^ 5 ^ 5); // 利用异或的特性也可以
	}
}
