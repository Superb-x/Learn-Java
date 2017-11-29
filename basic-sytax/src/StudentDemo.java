// 学生缴费案例
class Student {
	String name; // 学生名称
	boolean isFee = false; // 默认未缴费
	
	void fees() {
		isFee = true;
	}
}
public class StudentDemo {
	public static void main(String[] args) {
		// 创建四个学生对象
		Student s1 = new Student();
		s1.name = "方跃";
		s1.isFee = true;
		
		Student s2 = new Student();
		s2.name = "胡坤禹";
		
		Student s3 = new Student();
		s3.name = "王胜凯";
		s3.isFee = false;
		
		Student s4 = new Student();
		s4.name = "谢欢";
		s4.isFee = true;
		
		// 创建一个数组，用于存储所有的学生对象
		Student[] arr = new Student[]{s1,s2,s3,s4};
		
		// 使用循环来迭代数组中每一个元素
		for (Student student: arr) {
			if (!student.isFee) {
				student.fees();
			}
			System.out.println(student.name + " 是否交了学费: " + student.isFee);
		}
	}
}
