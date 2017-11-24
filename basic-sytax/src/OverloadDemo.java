// 重载概念
/*
 * 方法的重载设计【overload】
 * 重载方法的定义是在同一个类中，某方法允许存在一个以上的同名方法，只要他们的参数列表不同即可
 * 方法重载的作用：屏蔽了一功能的方法由于参数不同所造成方法名称不同
 */
public class OverloadDemo {
	
	// 求两个整数之和
	static int getSum(int x, int y){
		return x + y;
	}
	
	// 求两个小数之和
	static double getSum(double x, double y){
		return x + y;
	}
	
	// 在同一个类中分别打印String、int、double、boolean类型的方法	
	static void pString(String str) {
		System.out.println(str);
	}
	/*
	 * 方法重载判断原则：“两同一不同”
	 * 两同：同类名，方法名相同
	 * 一不同：方法参数不同（参数类型，参数个数，参数顺序）
	 * 注意：方法重载和方法返回值类型无关，只是一般要求返回值类型一直
	 */
	public static void main(String[] args) {
		int a = OverloadDemo.getSum(4,5);
		double b = OverloadDemo.getSum(1.1, 2.3);
		System.out.println(a);
		System.out.println(b);
	}
}
