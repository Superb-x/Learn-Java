// 99�˷���
public class Table99Demo {
	public static void main(String[] args){
		outer: for(int i = 1;i <= 9;i++) {
			// ������
			for (int j = 1;j <= i;j++) {
				if (i == 5) {
					break outer; // ֻ�ܽ�����ǰѭ��
				}
				System.out.print(i + " * " + j + " = " + i * j + " ");
			}
			System.out.println("");
		}
	}
}
