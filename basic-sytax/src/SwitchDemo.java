// switch���ע������
public class SwitchDemo {
	public static void main(String[] args) {
		/*
		 * switchֻ֧��int���ͣ�short��byte���ᱻ������int����
		 */
		char ch = 'C';
		switch(ch) {
			case 'A': System.out.println("A");break;
			case 'B': System.out.println("B");break;
			case 'C': System.out.println("C");break;
			default: System.out.println("����û���������");
		}
		
		short weekday = 4;
		switch(weekday) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5: System.out.println("�����ǹ�����");break;
			case 6:
			case 7: System.out.println("��Ϣ��");break;
			default: System.out.println("û����һ��");break;
		}
	}
}
