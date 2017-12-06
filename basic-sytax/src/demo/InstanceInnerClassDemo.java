package demo;
// 实例内部类demo
class Outer{
	static String name = "Outer.name";
	String name2 = "Outer.this.name";
	public void ooxx(){
		System.out.println(new Inner().age);
	}
	//实例内部
	/*
	 * 实例内部类都不能用static
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
// 演示实例内部类
/*
 * 创建实例内部类之前，必须存在外部类对象
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
