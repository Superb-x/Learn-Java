// ���������
public class RectangleDemo {
	public static void main(String[] args){
		for (int line = 1;line <= 7;line++){
			for (int i = 0;i <= 5;i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("==================");
		// ��������
		int l = 10;
		// ��һ��
		for (int i = 0;i <= l;i++) {
			for (int j = 0;j <= i;j++) {
				System.out.print("*");	
			}
			System.out.println("");
		}
	}
}
