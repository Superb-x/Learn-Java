package demo;

// �Ѿ�ʵ��animal��
class Cafe extends Animals implements IWalkable { // ����һ���ӷ�è��
	public void walk(){
		System.out.println("��è����è��");
	}
}

// ����һ������
class Sharks extends Animals implements ISwimable { // ����һ��������
	public void swim(){
		System.out.println("�����С��");
	}
}

// ����һ�����ܶ��������
class Frogs extends Animals implements IWalkable, ISwimable {
	
	public void swim(){
		System.out.println("��Ӿ");
	}
	
	public void walk(){
		System.out.println("����");
	} 
}
public class InterfaceImplementsDemo {
	public static void main(String[] args) {
		IWalkable c = new Cafe(); // ʵ����һ���ӷ�è
		c.walk();
		ISwimable n = new Sharks(); // ʵ����һ������
		n.swim();
		Frogs f = new Frogs();//ʵ����һ������
		f.swim();
		f.walk();
	}
}
