package demo;
class Person {
	String name;
	private int age;
	
	void setAge(int n) {
		if (n <= 0) {
			System.out.println("���䲻��Ϊ����");
			return;
		} 
		age = n;
	}
}
// ��ʾ��װ
public class PersonDemo {
	public static void main(String[] args) {
		// ����һ��Person������������
		Person p = new Person();
		p.name = "С��";
		p.setAge(17);
		
		System.out.println(p.name + " , ");
	}
}
