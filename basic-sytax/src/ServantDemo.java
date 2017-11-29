/**
 * 佣人类
 * @author lxl
 *
 */
class Servant {
	String name;
	int age;
	
	void shopping(){
		System.out.println("买菜");
	}
	
	void cook(){
		System.out.println("做饭");
	}
	
	void wash(){
		System.out.println("洗衣服");
	}
}
// coder
class Coder{
	void coding(){
		System.out.println("写代码...");
	}
}
// Java面向对象编程基础
public class ServantDemo {
	public static void main(String[] args) {
		Servant s1 = new Servant();
		s1.name = "小丽";
		s1.age = 23;
		
		System.out.println(s1.name + s1.age);
		
		s1.shopping();
		
		Coder c1 = new Coder();
		c1.coding();
	}
}
