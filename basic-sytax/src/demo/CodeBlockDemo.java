package demo;
// �ֲ������
public class CodeBlockDemo {
	/*
	 * һ�㲻Ҫ����ȥд���Ѵ���д�ڹ�������ͺ�
	 */
	{
		System.out.println("��ʼ�������");
	}
	
	CodeBlockDemo(){
		System.out.println("������");
	}
	
	public static void main(String[] args) {
		/*
		 * һ������Ǻ���ʹ�ô���飬��������if��while��try��catch�ȷ���
		 */
		System.out.println("����main����");
		new CodeBlockDemo();
		new CodeBlockDemo();
		new CodeBlockDemo();
	}
}
