package demo;
// ��̬ʾ������
class Animals {
	private String name;
	private int age;
	
	public void eat(){
		System.out.println("�Ե�ɶ����");
	}
}

class Dog extends Animals {
	public void eat(){
		System.out.println("�Թ�ͷ");
	}
}

class Cat extends Animals {
	public void eat(){
		System.out.println("����");
	}
}
public class PolymorphicDemo {
	public static void main(String[] args) {
		/*Dog d = new Dog();
		d.eat();
		Cat c = new Cat();
		c.eat();*/
		Animals d = new Dog(); // ��ʱ��̬�Ͳ�����
		Animals c = new Cat();
		d.eat();
		c.eat();
	}
}
