package demo;
// 演示基本包装类
/*
 * 八大基本数据类型的包装类都使用final修饰，都是最终类，不能被继承
 */
public class IntegerDemo {
	public static void main(String[] args) {
		//装箱操作:把一个基本类型的值，转换为对应包装类对象
		//方式一
		Integer num = new Integer(17);
		//方式二
		Integer num2 = Integer.valueOf(17);
		// 拆箱操作
		
		int num3 = num.intValue();
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println("--------------");
		
		// 自动装箱：可以直接把一个基本类型的值赋给对应的包装类对象
		Integer num4 = 17;
		// 自动拆箱：可以直接把一个包装类的对象赋给对应的基本类型变量
		int num5 = num4;
		String str = "123";
		int num6 = Integer.parseInt(str);
		System.out.println(num6);
	}
}
