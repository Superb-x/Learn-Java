/**
 * Ӷ����
 * @author lxl
 *
 */
class Servant {
	String name;
	int age;
	
	void shopping(){
		System.out.println("���");
	}
	
	void cook(){
		System.out.println("����");
	}
	
	void wash(){
		System.out.println("ϴ�·�");
	}
}
// coder
class Coder{
	void coding(){
		System.out.println("д����...");
	}
}
// Java��������̻���
public class ServantDemo {
	public static void main(String[] args) {
		Servant s1 = new Servant();
		s1.name = "С��";
		s1.age = 23;
		
		System.out.println(s1.name + s1.age);
		
		s1.shopping();
		
		Coder c1 = new Coder();
		c1.coding();
	}
}
