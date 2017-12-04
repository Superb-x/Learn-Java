package demo;
// 包装类中的缓存

public class CacheDemo {
	public static void main(String[] args) {
		Integer i1 = new Integer(123);
		Integer i2 = new Integer(123);
		System.out.println(i1 == i2);
		Integer i3 = Integer.valueOf(123); // 如果范围在[-128, 127)，之间，就获取缓存中的数据
		Integer i4 = Integer.valueOf(123);
		System.out.println(i3 == i4);
		Integer i5 = 123;
		Integer i6 = 123;
		System.out.println(i5 == i6);
		System.out.println("----------------------");
		Integer i11 = new Integer(250);
		Integer i22 = new Integer(250);
		System.out.println(i11 == i22);
		Integer i33 = Integer.valueOf(250);
		Integer i44 = Integer.valueOf(250);
		System.out.println(i33 == i44);
		Integer i55 = 123;
		Integer i66 = 123;
		System.out.println(i55 == i66);
	}
}
