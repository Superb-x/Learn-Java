package demo;
/*
 * 多态时方法调用问题：
 *     前提：必须存在多态
 */

// 父类
class SuperClass{
	public static void doWork(){
		System.out.println("Super.dowork");
	}
}

// 子类
class SubClass extends SuperClass{
	public static void doWork(){
		System.out.println("sub.dowork");
	}
}
public class MethodCallDemo {
	public static void main(String[] args) {
		SuperClass c1 = new SubClass(); // 编译过程中会去SuperClass中找到dowork方法
		c1.doWork();
		//当使用static修饰时，会使用编译类来调用该方法
	}
}
