package demo;
// super�ؼ���
class Birds {
	// ������η���private����ô����ֶξͲ��ܱ��������̳У�Ҳ�Ͳ����ڸ��ǵĸ���
	public void fly(){
		System.out.println("I can fly");
	}
}

class Penguins extends Birds {
	// ����̳е��˸��࣬���������¶���fly
	@Override // �����ô�װ����������Ƿ�����
	public void fly(){
		System.out.println("I'm a penguin I can't fly");
	}
	
	public void say(){
		super.fly();
	}
}
public class SuperDemo {
	public static void main(String[] args) {
		Penguins p = new Penguins();
		p.fly();
		p.say();
	}
}
