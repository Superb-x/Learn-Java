package demo;

// 用户类定义
class User {
	private String name;
	private int age;
	
	/*public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("请输入一个有效的年龄值");
			return;
		}
		this.age = age;
	}*/
	
	/*
	 * 定义构造器
	 * 构造器重载时，用this()方法必须要写在代码块的第一行
	 */
	
	User(String name){
		this(name, 0);
		System.out.println(this.name);
	}
	
	User(String name, int age) {
		this.name = name;
	 	this.age = age;
	}
	
	public void show(){
		System.out.println(this.name + "今年" + this.age);
	}
	
	public void sayHello(){
		System.out.println("Hello");
		this.show();
	}
}
public class ThisDemo {
	public static void main(String[] args) {
		/*User u1 = new User(); // 无参数构造器
		u1.setName("小明");
		u1.setAge(23);
		String n = u1.getName();
		int a = u1.getAge();
		System.out.println(n + "今年" + a);
		User u2 = new User();
		u2.setName("小王");
		u2.setAge(33);
		u2.show();*/
		
		User u3 = new User("小明");
		u3.show();
	}
}
