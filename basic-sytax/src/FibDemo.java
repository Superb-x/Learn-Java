// 斐波拉契数列，递归操作
public class FibDemo {
	
	static int fib(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}
	public static void main(String[] args) {
		int num = FibDemo.fib(10);
		System.out.println(num);
	}
}
