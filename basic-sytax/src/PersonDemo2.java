// ����
class Person2 {
	String name;
	int age;
	
	// �Ӹ�static���η�����ʾ��ǰ�ֶβ����ڶ��󣬶���������
	static int totalNum = 5; // ��ʾ������
	
	Person2(String n, int a){
		name = n;
		age = a;
		totalNum++;
	}
	// ��static���������Է��ʾ�̬��Ա��Ҳ���Է���ʵ����Ա
	void die(){
		totalNum--;
		System.out.println("ȥ���ˡ�����");
	}
	
	void destroy() {
		totalNum = 0;
		System.out.println("���������");
	}
}
public class PersonDemo2 {
	public static void main(String[] args) {
		System.out.println(Person2.totalNum);
		Person2 p1 = new Person2("��Ծ", 22);
		Person2 p2 = new Person2("������", 22); 
		Person2 p3 = new Person2("��ʥ��", 22);
		System.out.println(Person2.totalNum);
		System.out.println(p2.totalNum); //���濴��ͨ�������������ֶΣ���ײ㻹��ʹ����������
		System.out.println(p3.totalNum);
	}
}
