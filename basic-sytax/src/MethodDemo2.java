// �����Ķ���͵��ã��߼�
public class MethodDemo2 {
	
	// �޲��޷���
	static void do1(){
		System.out.println("============");
	}
	
	// �в��޷���
	static void do2(String str){
		System.out.println(str);
	}
	
	// �޲��з���
	static int getAge() {
		int age = 22;
		return age;
	}
	
	// �в��з���
	static int getSum(int a, int b){
		return a + b;
	}
	public static void main(String[] args) {
		MethodDemo2.do1();
		MethodDemo2.do2("-------���Ƿָ���-------");
		int age = MethodDemo2.getAge();
		System.out.println(age);
		int result = MethodDemo2.getSum(5, 6); // ��Ҫ�����ڴ������շ��ؽ��
		System.out.println(result);
	}
}
