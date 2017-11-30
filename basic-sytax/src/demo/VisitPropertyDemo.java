package demo;
// 访问权限控制demo
/*
 * private: 表示私有的，表示类私有，只能在本类中访问，离开本类之后就无法访问
 * 不写（缺省）：表示包私有，表示包权限访问，访问者的包必须和当前定义类的包相同才能访问，子包都不行
 * protected: 表示子类访问权限，同包中的可以访问，即使不同包，但是有继承关系，也可以访问
 * public：表示全局的，可以公共访问权限，如果某个字段使用public修饰，则可以在当前项目中任何地方访问，
 * 但其父类如果不事public修饰的话就无法访问
 * 一般的，字段都使用private修饰，表达隐藏，为了安全性
 * 拥有实现细节的方法，一般使用private修饰，不希望外界（调用者）看到方法的实现
 * 一般的方法我们使用public修饰，供外界直接调用
 * 在父类要暴露方法给子类时，使用protected
 */
class Contact {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
}
public class VisitPropertyDemo {
	public static void main(String[] args) {
		Contact c1 = new Contact();
		c1.setName("小明");
		String a = c1.getName();
		System.out.println(a);
	}
}
