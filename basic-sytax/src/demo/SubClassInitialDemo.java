package demo;
// 动物类
class Animal{
	private String name;
	private int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("这是Animal类的构造器");
	}
	
	public String getName(){
		return name;
	}
}
// 鱼
class Fish extends Animal{
	private String color; // 鱼有一个颜色
	
	Fish(String name, int age, String color){
		super(name, 5); // 如果父类构造器有参数的话，就必须显式的来调用,并且必须写在子类构造器第一行
		this.color = color;
		System.out.println("这是Fish的构造器");
	}
	
	public void say(){
		System.out.println(super.getName() + ", " + this.color);
	}
}

public class SubClassInitialDemo {
	public static void main(String[] args) {
		// 创建过程中，会调用父类的构造器，存在一个隐式调用，如果父类构造器有参数，那么必须显式的去调用
		Fish f = new Fish("尼莫", 5, "橘黄色");
		f.say();
	}
}
