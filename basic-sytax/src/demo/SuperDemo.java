package demo;
// super关键字
class Birds {
	// 如果修饰符是private，那么这个字段就不能被子类所继承，也就不存在覆盖的概念
	public void fly(){
		System.out.println("I can fly");
	}
}

class Penguins extends Birds {
	// 子类继承到了父类，在这里重新定义fly
	@Override // 可以用此装饰器来检查是否重载
	public void fly(){
		System.out.println("I'm a penguin I can't fly");
	}
	
	public void say(){
		super.fly();
	}
}
public class SuperDemo {
	public static void main(String[] args) {
		Penguins p = new Penguins();
		p.fly();
		p.say();
	}
}
