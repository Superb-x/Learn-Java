package demo;
// ����Ȩ�޿���demo
/*
 * private: ��ʾ˽�еģ���ʾ��˽�У�ֻ���ڱ����з��ʣ��뿪����֮����޷�����
 * ��д��ȱʡ������ʾ��˽�У���ʾ��Ȩ�޷��ʣ������ߵİ�����͵�ǰ������İ���ͬ���ܷ��ʣ��Ӱ�������
 * protected: ��ʾ�������Ȩ�ޣ�ͬ���еĿ��Է��ʣ���ʹ��ͬ���������м̳й�ϵ��Ҳ���Է���
 * public����ʾȫ�ֵģ����Թ�������Ȩ�ޣ����ĳ���ֶ�ʹ��public���Σ�������ڵ�ǰ��Ŀ���κεط����ʣ�
 * ���丸���������public���εĻ����޷�����
 * һ��ģ��ֶζ�ʹ��private���Σ�������أ�Ϊ�˰�ȫ��
 * ӵ��ʵ��ϸ�ڵķ�����һ��ʹ��private���Σ���ϣ����磨�����ߣ�����������ʵ��
 * һ��ķ�������ʹ��public���Σ������ֱ�ӵ���
 * �ڸ���Ҫ��¶����������ʱ��ʹ��protected
 */
class Contact {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
}
public class VisitPropertyDemo {
	public static void main(String[] args) {
		Contact c1 = new Contact();
		c1.setName("С��");
		String a = c1.getName();
		System.out.println(a);
	}
}
