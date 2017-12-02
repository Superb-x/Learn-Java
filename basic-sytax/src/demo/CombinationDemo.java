package demo;
// 组合关系
class Combine {
	private ArraysUtil util = new ArraysUtil(); // 使用组合关系实现代码复用
	
	public void test(){
		int[] arr = new int[]{-2,1,9,0,5};
		util.sort(arr);
		String a = java.util.Arrays.toString(arr);
		System.out.println(a);
	}
}
public class CombinationDemo {
	public static void main(String[] args) {
		int[] array = new int[]{10,9,8,7,6,5,4,3,2,1,0};
		Combine c = new Combine();
		c.test();
	}
}
