package demo;

// �û��ඨ��
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
			System.out.println("������һ����Ч������ֵ");
			return;
		}
		this.age = age;
	}*/
	
	/*
	 * ���幹����
	 * ����������ʱ����this()��������Ҫд�ڴ����ĵ�һ��
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
		System.out.println(this.name + "����" + this.age);
	}
	
	public void sayHello(){
		System.out.println("Hello");
		this.show();
	}
}
public class ThisDemo {
	public static void main(String[] args) {
		/*User u1 = new User(); // �޲���������
		u1.setName("С��");
		u1.setAge(23);
		String n = u1.getName();
		int a = u1.getAge();
		System.out.println(n + "����" + a);
		User u2 = new User();
		u2.setName("С��");
		u2.setAge(33);
		u2.show();*/
		
		User u3 = new User("С��");
		u3.show();
	}
}
