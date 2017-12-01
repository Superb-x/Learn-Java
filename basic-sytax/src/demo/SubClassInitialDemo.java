package demo;
// ������
class Animal{
	private String name;
	private int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("����Animal��Ĺ�����");
	}
	
	public String getName(){
		return name;
	}
}
// ��
class Fish extends Animal{
	private String color; // ����һ����ɫ
	
	Fish(String name, int age, String color){
		super(name, 5); // ������๹�����в����Ļ����ͱ�����ʽ��������,���ұ���д�����๹������һ��
		this.color = color;
		System.out.println("����Fish�Ĺ�����");
	}
	
	public void say(){
		System.out.println(super.getName() + ", " + this.color);
	}
}

public class SubClassInitialDemo {
	public static void main(String[] args) {
		// ���������У�����ø���Ĺ�����������һ����ʽ���ã�������๹�����в�������ô������ʽ��ȥ����
		Fish f = new Fish("��Ī", 5, "�ٻ�ɫ");
		f.say();
	}
}
