// ��������������ֵ
public class SwapVarDemo {
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a="+a + ", b="+b);
		
		// ���ַ�������������ֻ���������������ͣ��������ǲ����Ե�
		int c = 10;
		int d = 20;
		c = c ^ d;
		d = d ^ c;
		c = c ^ d;
		
		System.out.println("�������֮���ֵ: "+ c);
		
		System.out.println(100 ^ 5 ^ 5); // ������������Ҳ����
	}
}
