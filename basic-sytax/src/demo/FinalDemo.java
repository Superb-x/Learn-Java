package demo;
// final关键字
/*
 * final本身的含义是“最终的，不可改变的”，它可以修饰非抽象类，非抽象方法和变量。
 * 【注意：构造器不能用final修饰，因为构造方法不能被继承，肯定是最终的
 * final修饰的类：表示最终的类，该类不能再有子类
 * 只要满足以下条件就可以把一个类设计成final类
 * 1、某类不是专门为继承设计的
 * 2、出于安全考虑，类的实现细节不允许改动，不准修改源代码
 * 3、确定该类不会被拓展
 * 面试：列出5个java中内置的使用final修饰的类（最终类）
 *     八大数据类型保证类和String等
 * final修饰的方法，子类可以调用但是不能覆盖    
 */
class SuperCls{ // 用final修饰之后，此类就不能有子类
	public void doWork(){} // 此处加上final修饰符之后，编译会报错
}

class SubCls extends SuperCls{
	public void doWork(){}
}
public class FinalDemo {
	public static void main(String[] args) {
		
	}
}
