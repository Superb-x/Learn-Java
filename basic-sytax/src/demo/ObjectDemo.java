package demo;
// object类
public class ObjectDemo {
	public static void main(String[] args) {
		String str1 = new String("AA");
		String str2 = new String("AA");
		
		Object o1 = new Object();
		
		Object o2 = new Object();
		/*
		 * 官方推荐：在每一个子类里重写equals方法
		 */
		System.out.println(str1.equals(str2));
		System.out.println(o1.equals(o2));
	}
}
