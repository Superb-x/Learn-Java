package demo;
// �ӿ��﷨
// ½�����ж���淶
interface IWalkable {
	String NAME = "sock";
	void walk();
	interface ABC {
		
	}
}
//ˮ������淶
interface ISwimable {
	String NAME = "fish";
	void swim();
}
// ���ܶ���淶
interface IAmphibiousable extends IWalkable, ISwimable {
	String NAME = "turtle";
}

// ������һ��cat��
class Husky implements IWalkable {
	public void walk(){ // ʵ�����еķ������η�   ֻ����public����Ϊ�ӿ��еķ����ǹ����ģ�����ģ�����ʵ��������ǹ�����
		System.out.println("����һƥ��");
	}
}
/*
 * �ӿڳɹ�����֮������һ������һ���ֽ���
 * �ӿڲ�Ӧ����ʵ��
 * �ӿڴ��ڵĳ�Ա��
 *  1���ӿڲ�Ӧ���й����������ۣ��ӿڲ��ܴ������󣬲�����new���������Ҳ��ܶ�����ͨ����
 *  2���ӿ��ж���ĳ�Ա������ʵ����ȫ�־�̬������Ĭ��ʹ��public static final������
 *     public static final String NAME = "������"
 *  3���ӿ��ж���ĳ�Ա���ǹ����ĳ��󷽷���Ĭ�ϵ����η�����public abstract�����η���   
 *  4���ӿ��ж�����ڲ��඼�ǹ����ľ�̬�ڲ���
 * ��־�ӿڣ��ӿ���û���κγ�Ա���ͽ�����һ������Ľӿڣ�����һ����־��������ʵ�ָýӿڣ������ڸü��壬
 * 			���ǿ���ͨ�����������븳��ýӿ�ʵ������Ĺ��ܣ����Ƽ���    
 */
public class InterfaceDemo {
	public static void main(String args){
		// Husky h = new Husky(); //��Ӧ�������ַ�����Ӧ�ð�ʵ�������ֵ����
		IWalkable h = new Husky(); //����ӿڱ�̣����ڶ�̬
		h.walk(); //ִ�й�ʿ��ķ���
	}
}
