package demo;
// USB�ӿ�ʾ��
// �ƶ�USB�淶
interface IUSB{
	void swapData();
}
// USB�汾�������
class Mouses implements IUSB{
	public void swapData(){
		System.out.println("������ƶ�");
	}
}

// USB�汾�Ĵ�ӡ����
class Printer implements IUSB{
	public void swapData(){
		System.out.println("���Ǵ�ӡ��");
	}
}

// ����
class MotherBoard {
	// ���ƽӿڸ���
	
	private static IUSB[] usbs = new IUSB[6];
	private static int index = 0;
	// ���豸���뵽���嵱��
	public static void pluginIn(IUSB m) { // �����Ļ��Ϳ��Խ���һ��IUSB�Ķ���
		if (index == usbs.length) {
			System.out.println("�������");
			return;
		}
		usbs[index] = m;
		index++;
	}
	// ȡ�������е�ÿһ��USB�豸��������
	public static void doWork(){
		for(IUSB usb: usbs) {
			if (usb != null) {
				usb.swapData();	
			}
		}
	}
}

/*
 * ����ӿڱ�̣���̬�ĺô�����ʵ������󸳸��ӿ����ͱ����������˲�ͬʵ����֮��ʵ�ֵĲ��죬�Ӷ���������ͨ�ñ��
 * ����ʹ��USB�豸������
 */
public class USBDemo {
	public static void main(String[] args) {
		MotherBoard.pluginIn(new Mouses());
		MotherBoard.pluginIn(new Printer());
		MotherBoard.pluginIn(new Printer());
		MotherBoard.pluginIn(new Printer());
		// �����ڲ���
		MotherBoard.pluginIn(new IUSB(){
			//�����ڲ�����
			public void swapData() {
				System.out.println("������������");
			}
		});
		MotherBoard.pluginIn(new Printer());
		MotherBoard.pluginIn(new Printer());
		MotherBoard.pluginIn(new Printer());
		MotherBoard.doWork();
	}
}
