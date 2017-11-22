// 逻辑运算符
public class LogicalOperatorDemo {
	public static void main(String[] args) {
		/*
		 * 与：  boolean表达式A 与 boolean表达式B
		 *      两个都为true的时候都为true
		 *  & ：位与
		 *  &&：短路与
		 * 或：
		 * 	|： 即使A为true，也会执行B表达式
		 *  ||：短路或，只要A表达式为true，立刻返回true，就不再执行B表达式 
		 */
		System.out.println(true & true); //true
		System.out.println(true & false); //false
		System.out.println(false & true); //false
		System.out.println(false & false); //false
		System.out.println("----------------------");
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false && true); //false
		System.out.println(false && false); //false
		System.out.println("----------------------");
		//System.out.println(false & (1 / 0 == 1)); // 单& 会报错,短路与则不会
		System.out.println(false && (1 / 0 == 1)); // false
		System.out.println("-----------或运算-----------");
		System.out.println(true | true); // true
		System.out.println(true | false); // true
		System.out.println(false | true); // true
		System.out.println(false | false); // false
		System.out.println("----------------------");
		System.out.println(true || true); //true
		System.out.println(true || false); //true
		System.out.println(false || true); //true
		System.out.println(false || false); // false
		System.out.println("-----------异或-----------");
		System.out.println(true ^ true); //false
		System.out.println(true ^ false); //true
		System.out.println(false ^ true); //true
		System.out.println(false ^ false); //false
	}
}
