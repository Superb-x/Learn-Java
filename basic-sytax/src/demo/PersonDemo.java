package demo;
class Person {
	String name;
	private int age;
	
	void setAge(int n) {
		if (n <= 0) {
			System.out.println("年龄不能为负数");
			return;
		} 
		age = n;
	}
}
// 演示封装
public class PersonDemo {
	public static void main(String[] args) {
		// 创建一个Person对象并设置年龄
		Person p = new Person();
		p.name = "小明";
		p.setAge(17);
		
		System.out.println(p.name + " , ");
	}
}
