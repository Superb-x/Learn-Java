package demo;

class Person2 {
	String name;
	int age;
	public void sleep(){
		System.out.println("˯��");
	}
}
/*
 * Java��һ����ֻ����һ��ֱ�Ӹ���
 * Java���Զ��ؼ̳�
 */
// ��ʦ
class Teacher extends Person2{
	String level;
}

// ѧ��
class Student extends Person2{
	String sn; //ѧ��
}

// Ա��
class Employee extends Person2{
	String hireDate;
}

/*
 * �������඼��һ���ظ��ĵط�
 */
public class ExtendsDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.name); // �Ѿ��̳й�����
	}
}
