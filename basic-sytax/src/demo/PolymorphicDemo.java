package demo;
// 多态示例代码
class Animals {
	private String name;
	private int age;
	
	public void eat(){
		System.out.println("吃点啥好呢");
	}
}

class Dog extends Animals {
	public void eat(){
		System.out.println("吃骨头");
	}
}

class Cat extends Animals {
	public void eat(){
		System.out.println("吃鱼");
	}
}
public class PolymorphicDemo {
	public static void main(String[] args) {
		/*Dog d = new Dog();
		d.eat();
		Cat c = new Cat();
		c.eat();*/
		Animals d = new Dog(); // 此时多态就产生了
		Animals c = new Cat();
		d.eat();
		c.eat();
	}
}
