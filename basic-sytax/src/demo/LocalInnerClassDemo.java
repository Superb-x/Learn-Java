package demo;
/*
 * �ֲ��ڲ��࣬ûɶ�ã����Ǳ���Ҫ֪��
 * ���ܰ�����̬��Ա
 */
public class LocalInnerClassDemo {
	static String name = "XXX";
	public static void main(String[] args){
		System.out.println("���Ǿֲ��ڲ���");
		int age = 17;
		//�ֲ��ڲ��࣬���ֲ�����һ��
		class Inner{
			String info = "INFO";
			public void test(){
				System.out.println(info);
				System.out.println(name);//����ֱ�ӷ����ⲿ��ĳ�Ա
				System.out.println(age);
			}
		}
		
		new Inner().test();
	}
}
