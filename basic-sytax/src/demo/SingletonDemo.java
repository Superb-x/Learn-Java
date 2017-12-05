package demo;

class ArrayUtil {
	// 1、必须在该类中，自己创建出一个对象
	private static ArrayUtil instance = new ArrayUtil();
	// 2、私有化自身的构造器，防止外界通过构造器创建新的对象
	private ArrayUtil(){}
	// 3、向外暴露一个公共的静态方法用于获取自身的对象
	public static ArrayUtil getInstance(){
		return instance;
	}
	public void sort(int[] arr) {
		System.out.println("我需要排序");
	}
}
// 单例
public class SingletonDemo {
	public static void main(String[] args) {
		System.out.println(ArrayUtil.getInstance() == ArrayUtil.getInstance()); // 此时结果为true，因为指向的是同一个内存地址
		// 需要做排序处理：不同的类中
		ArrayUtil.getInstance().sort(null);
		// 需要做排序处理
		ArrayUtil.getInstance().sort(null);
		// 需要做排序处理
		ArrayUtil.getInstance().sort(null);
		// 需要做排序处理
		ArrayUtil.getInstance().sort(null);
	}
}
