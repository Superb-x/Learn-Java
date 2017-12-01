package demo;
// 方法重载

class Bird {
	// 如果修饰符是private，那么这个字段就不能被子类所继承，也就不存在覆盖的概念
	public void fly(){
		System.out.println("I can fly");
	}
}

class Penguin extends Bird {
	// 子类继承到了父类，在这里重新定义fly
	@Override // 可以用此装饰器来检查是否重载
	public void fly(){
		System.out.println("I'm a penguin I can't fly");
	}
}
public class OverrideDemo {
	public static void main(String[] args) {
		Penguin p = new Penguin();
		p.fly();
	}
}
