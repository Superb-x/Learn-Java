package demo;
// 局部代码块
public class CodeBlockDemo {
	/*
	 * 一般不要这样去写，把代码写在构造器里就好
	 */
	{
		System.out.println("初始化代码块");
	}
	
	CodeBlockDemo(){
		System.out.println("构造器");
	}
	
	public static void main(String[] args) {
		/*
		 * 一般的我们很少使用代码块，不过会结合if、while、try、catch等方法
		 */
		System.out.println("进入main方法");
		new CodeBlockDemo();
		new CodeBlockDemo();
		new CodeBlockDemo();
	}
}
