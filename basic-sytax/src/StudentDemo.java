// ѧ���ɷѰ���
class Student {
	String name; // ѧ������
	boolean isFee = false; // Ĭ��δ�ɷ�
	
	void fees() {
		isFee = true;
	}
}
public class StudentDemo {
	public static void main(String[] args) {
		// �����ĸ�ѧ������
		Student s1 = new Student();
		s1.name = "��Ծ";
		s1.isFee = true;
		
		Student s2 = new Student();
		s2.name = "������";
		
		Student s3 = new Student();
		s3.name = "��ʤ��";
		s3.isFee = false;
		
		Student s4 = new Student();
		s4.name = "л��";
		s4.isFee = true;
		
		// ����һ�����飬���ڴ洢���е�ѧ������
		Student[] arr = new Student[]{s1,s2,s3,s4};
		
		// ʹ��ѭ��������������ÿһ��Ԫ��
		for (Student student: arr) {
			if (!student.isFee) {
				student.fees();
			}
			System.out.println(student.name + " �Ƿ���ѧ��: " + student.isFee);
		}
	}
}
