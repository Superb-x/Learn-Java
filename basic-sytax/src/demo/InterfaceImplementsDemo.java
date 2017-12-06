package demo;

// 已经实现animal类
class Cafe extends Animals implements IWalkable { // 定义一个加菲猫类
	public void walk(){
		System.out.println("胖猫，走猫步");
	}
}

// 定义一个鱼类
class Sharks extends Animals implements ISwimable { // 定义一个鲨鱼类
	public void swim(){
		System.out.println("鲨鱼吃小鱼");
	}
}

// 定义一个两栖动物，青蛙类
class Frogs extends Animals implements IWalkable, ISwimable {
	
	public void swim(){
		System.out.println("蛙泳");
	}
	
	public void walk(){
		System.out.println("蛙跳");
	} 
}
public class InterfaceImplementsDemo {
	public static void main(String[] args) {
		IWalkable c = new Cafe(); // 实例化一个加菲猫
		c.walk();
		ISwimable n = new Sharks(); // 实例化一个鲨鱼
		n.swim();
		Frogs f = new Frogs();//实例化一个青蛙
		f.swim();
		f.walk();
	}
}
