// ��ʾ�Զ��幹����
class Person {
	String name;
	int age;
	Person(String str){
		name = str;
		System.out.println("�Զ��幹����, ����: " + str);
	}
	Person(int num) {
		age = num;
	}
	/*
	 * ���캯����������
	 * �������û����ʽ�ṩ����������������ᴴ��һ��ȱʡ�Ĺ�������
	 * ���������ʽ�Ĵ����˹��������������Ͳ����ٴ���������
	 */
}

public class PersonDemo {
	public static void main(String[] args) {
		//new Person(); // ��ʾ����person�����޲����Ĺ�����
		Person p1 = new Person("hello");
		System.out.println(p1.name);
	}
}
