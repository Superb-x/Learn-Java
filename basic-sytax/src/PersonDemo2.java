// 人类
class Person2 {
	String name;
	int age;
	
	// 加个static修饰符，表示当前字段不属于对象，而是属于类
	static int totalNum = 5; // 表示总人数
	
	Person2(String n, int a){
		name = n;
		age = a;
		totalNum++;
	}
	// 非static方法，可以访问静态成员，也可以访问实例成员
	void die(){
		totalNum--;
		System.out.println("去世了。。。");
	}
	
	void destroy() {
		totalNum = 0;
		System.out.println("人类毁灭了");
	}
}
public class PersonDemo2 {
	public static void main(String[] args) {
		System.out.println(Person2.totalNum);
		Person2 p1 = new Person2("方跃", 22);
		Person2 p2 = new Person2("胡坤禹", 22); 
		Person2 p3 = new Person2("王圣凯", 22);
		System.out.println(Person2.totalNum);
		System.out.println(p2.totalNum); //表面看是通过对象访问这个字段，其底层还是使用类名访问
		System.out.println(p3.totalNum);
	}
}
