package demo;
// ����һ�����ڼ��ĳ�����
class Weekday {
	private Weekday(){}; // ˽�л�������
	public static final Weekday MONDAY = new Weekday();
	public static final Weekday TUESDAY = new Weekday();
	public static final Weekday WEDNSDAY = new Weekday();
	public static final Weekday THURSDAY = new Weekday();
	public static final Weekday FRIDAY = new Weekday();
	public static final Weekday SATURDAY = new Weekday();
	public static final Weekday SUNDAY = new Weekday();
}
/*
 * ���Ǵ���һ���׶ˣ��������Ͳ���ȫ���������ó�[1,7]֮�������
 */
// ö����
class Employees {
	private Weekday restDay;//һ�ܵ���һ����Ϣ
	
	public Weekday getRestday(){
		return restDay;
	}
	
	public void setRestday(Weekday day) {
		restDay = day;
	}
}
public class EnumDemo {
	public static void main(String[] args) {
		// ����һ��Ա�����󣬲���������һ����Ϣ
		Employees e = new Employees();
		e.setRestday(Weekday.WEDNSDAY);
		Weekday restDay = e.getRestday();
		if (restDay == Weekday.SATURDAY || restDay == Weekday.SUNDAY) {
			System.out.println("��ĩ��Ϣ");
		} else {
			System.out.println("��һ��������Ϣ");
		}
	}
}
