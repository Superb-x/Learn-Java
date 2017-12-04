package demo;
// 包装类中的缓存

public class CacheDemo {
	public static void main(String[] args) {
		Integer i1 = new Integer(123);
		Integer i2 = new Integer(123);
		System.out.println(i1 == i2);
		Integer i3 = Integer.valueOf(123);
		Integer i4 = Integer.valueOf(123);
		System.out.println(i3 == i4);
		Integer i5 = 123;
		Integer i6 = 123;
		System.out.println(i5 == i6);
	}
}
