// �������� ��byte��int��short��long��
public class IntegerDemo {
	public static void main(String[] args) {
		/**
		 * �ٶ�������������0b����0B��ͷ�����磺int a = 0B110;
		 * �ڰ˽���������Ҫ����0��ͷ�����磺int a = 012��
		 * ��ʮ�����������磺int a = 17;
		 * ��ʮ������������Ҫ����0X����0x��ͷ����int a = 0x12��
		 */
		// ��ʾʮ���Ƶĳ���
		System.out.println(100);
		// ��ʾ�����Ƶĳ���
		System.out.println(0b01101110);  // byte����
		System.out.println(0b00000000_01101110); // short������ռ�����ֽ�
		System.out.println(0b00000000_00000000_00000000_01101110); // int�ĳ���
		// ��ʾ�˽��Ƶĳ���
		System.out.println(0156);
		// ��ʾʮ�����Ƶĳ���
		System.out.println(0x6E);
		
		// �����ı���
		// �������� ���� = ����ֵ�ĳ���;
		byte age = 127;
		System.out.println(age);
		
		// ��Java�����������ͷ�Χ�и�����ɣ�����ͨ��ʹ��int
	}
}
