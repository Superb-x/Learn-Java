package demo;
// ��������

class Bird {
	// ������η���private����ô����ֶξͲ��ܱ��������̳У�Ҳ�Ͳ����ڸ��ǵĸ���
	public void fly(){
		System.out.println("I can fly");
	}
}

class Penguin extends Bird {
	// ����̳е��˸��࣬���������¶���fly
	@Override // �����ô�װ����������Ƿ�����
	public void fly(){
		System.out.println("I'm a penguin I can't fly");
	}
}
public class OverrideDemo {
	public static void main(String[] args) {
		Penguin p = new Penguin();
		p.fly();
	}
}
