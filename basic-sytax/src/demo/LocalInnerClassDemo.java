package demo;
/*
 * 局部内部类，没啥用，但是必须要知道
 * 不能包含静态成员
 */
public class LocalInnerClassDemo {
	static String name = "XXX";
	public static void main(String[] args){
		System.out.println("这是局部内部类");
		int age = 17;
		//局部内部类，跟局部变量一样
		class Inner{
			String info = "INFO";
			public void test(){
				System.out.println(info);
				System.out.println(name);//可以直接访问外部类的成员
				System.out.println(age);
			}
		}
		
		new Inner().test();
	}
}
