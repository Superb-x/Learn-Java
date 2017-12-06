package demo;
// 定义一个星期几的常量类
class Weekday {
	private Weekday(){}; // 私有化构造器
	public static final Weekday MONDAY = new Weekday();
	public static final Weekday TUESDAY = new Weekday();
	public static final Weekday WEDNSDAY = new Weekday();
	public static final Weekday THURSDAY = new Weekday();
	public static final Weekday FRIDAY = new Weekday();
	public static final Weekday SATURDAY = new Weekday();
	public static final Weekday SUNDAY = new Weekday();
}
/*
 * 还是存在一个弊端，数据类型不安全，可以设置成[1,7]之外的数字
 */
// 枚举类
class Employees {
	private Weekday restDay;//一周的哪一天休息
	
	public Weekday getRestday(){
		return restDay;
	}
	
	public void setRestday(Weekday day) {
		restDay = day;
	}
}
public class EnumDemo {
	public static void main(String[] args) {
		// 创建一个员工对象，并设置他哪一天休息
		Employees e = new Employees();
		e.setRestday(Weekday.WEDNSDAY);
		Weekday restDay = e.getRestday();
		if (restDay == Weekday.SATURDAY || restDay == Weekday.SUNDAY) {
			System.out.println("周末休息");
		} else {
			System.out.println("周一到周五休息");
		}
	}
}
