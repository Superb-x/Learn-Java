package demo;
// ʵ���ڲ���demo
class Outer{
	static String name = "Outer.name";
	String name2 = "Outer.this.name";
	public void ooxx(){
		System.out.println(new Inner().age);
	}
	//ʵ���ڲ�
	/*
	 * ʵ���ڲ��඼������static
	 */
	static class Inner{
		int age = 17;
		String name = "Inner.name";
		public void test(){
			String name = "local.name";
			System.out.println(name);
			System.out.println(this.name);
			System.out.println(Outer.name);
			System.out.println(new Outer().name2);
		}
	}
}
// ��ʾʵ���ڲ���
/*
 * ����ʵ���ڲ���֮ǰ����������ⲿ�����
 */
public class InstanceInnerClassDemo {
	public static void main(String[] args) {
		Outer out = new Outer();
		System.out.println(out.name);
		Outer.Inner n = new Outer.Inner();
		System.out.println(n);
		n.test();
	}
}
