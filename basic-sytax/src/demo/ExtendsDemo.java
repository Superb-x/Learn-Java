package demo;

class Person2 {
	String name;
	int age;
	public void sleep(){
		System.out.println("睡觉");
	}
}
/*
 * Java中一个类只能有一个直接父类
 * Java可以多重继承
 */
// 老师
class Teacher extends Person2{
	String level;
}

// 学生
class Student extends Person2{
	String sn; //学号
}

// 员工
class Employee extends Person2{
	String hireDate;
}

/*
 * 这三个类都有一个重复的地方
 */
public class ExtendsDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.name); // 已经继承过来了
	}
}
