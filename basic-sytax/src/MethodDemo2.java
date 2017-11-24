// 方法的定义和调用，高级
public class MethodDemo2 {
	
	// 无参无返回
	static void do1(){
		System.out.println("============");
	}
	
	// 有参无返回
	static void do2(String str){
		System.out.println(str);
	}
	
	// 无参有返回
	static int getAge() {
		int age = 22;
		return age;
	}
	
	// 有参有返回
	static int getSum(int a, int b){
		return a + b;
	}
	public static void main(String[] args) {
		MethodDemo2.do1();
		MethodDemo2.do2("-------我是分隔符-------");
		int age = MethodDemo2.getAge();
		System.out.println(age);
		int result = MethodDemo2.getSum(5, 6); // 需要分配内存来接收返回结果
		System.out.println(result);
	}
}
