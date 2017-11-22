// 复制运算符
public class AssigningOperatorDemo {
	public static void main(String[] args) {
		// 功能是复制给变量，语法跟js一样，并且自带隐式类型转换
		String name;
		name = "Will"; // 赋值
		/*
		 * 1.声明int类型变量age
		 * 2.在内存中存贮常量数据17
		 * 3.把17赋予age变量
		 */
		// 声明一个int类型变量，并初始化
		int age = 17;
		
		int a = 10;
		a += 5;
		short s = 30;
		//s = s + 5; 
		s = (short)(s + 5);
		//s += 5;
		System.out.println(s);
		
	}
}
