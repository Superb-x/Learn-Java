package demo;

// 用户类定义
class User {
	private String name;
	private int age;
	
	public String getName(){
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
	}
	
	public void show(){
		System.out.println(this.name + "今年" + this.age);
	}
}
public class ThisDemo {
	public static void main(String[] args) {
		User u1 = new User();
		u1.setName("小明");
		u1.setAge(23);
		String n = u1.getName();
		int a = u1.getAge();
		System.out.println(n + "今年" + a);
		User u2 = new User();
		u2.setName("小王");
		u2.setAge(33);
		u2.show();
	}
}
