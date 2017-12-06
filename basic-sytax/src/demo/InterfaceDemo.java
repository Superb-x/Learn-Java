package demo;
// 接口语法
// 陆地爬行动物规范
interface IWalkable {
	String NAME = "sock";
	void walk();
	interface ABC {
		
	}
}
//水生动物规范
interface ISwimable {
	String NAME = "fish";
	void swim();
}
// 两栖动物规范
interface IAmphibiousable extends IWalkable, ISwimable {
	String NAME = "turtle";
}

// 来定义一个cat类
class Husky implements IWalkable {
	public void walk(){ // 实现类中的方法修饰符   只能用public，因为接口中的方法是公共的，抽象的，所以实现类必须是公共的
		System.out.println("风中一匹狼");
	}
}
/*
 * 接口成功编译之后会和类一样具有一份字节码
 * 接口不应该有实例
 * 接口存在的成员：
 *  1、接口不应该有构造器，推论：接口不能创建对象，不能用new方法，并且不能定义普通方法
 *  2、接口中定义的成员变量，实质是全局静态常量，默认使用public static final来修饰
 *     public static final String NAME = "刘祥麟"
 *  3、接口中定义的成员都是公共的抽象方法，默认的修饰符就是public abstract来修饰方法   
 *  4、接口中定义的内部类都是公共的静态内部类
 * 标志接口：接口中没有任何成员，就仅仅是一个定义的接口，就是一个标志，其他类实现该接口，就属于该家族，
 * 			我们可以通过第三方代码赋予该接口实现特殊的功能（不推荐）    
 */
public class InterfaceDemo {
	public static void main(String args){
		// Husky h = new Husky(); //不应该用这种方法，应该把实现类对象赋值过来
		IWalkable h = new Husky(); //面向接口编程，存在多态
		h.walk(); //执行哈士奇的方法
	}
}
