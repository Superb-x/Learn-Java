// 演示自定义构造器
class Person {
	String name;
	int age;
	Person(String str){
		name = str;
		System.out.println("自定义构造器, 参数: " + str);
	}
	Person(int num) {
		age = num;
	}
	/*
	 * 构造函数可以重载
	 * 如果我们没有显式提供构造器，则编译器会创建一个缺省的构造器，
	 * 如果我们显式的创建了构造器，编译器就不会再创建构造器
	 */
}

public class PersonDemo {
	public static void main(String[] args) {
		//new Person(); // 表示调用person类中无参数的构造器
		Person p1 = new Person("hello");
		System.out.println(p1.name);
	}
}
