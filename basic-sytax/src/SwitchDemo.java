// switch语句注意事项
public class SwitchDemo {
	public static void main(String[] args) {
		/*
		 * switch只支持int类型，short、byte都会被提升成int类型
		 */
		char ch = 'C';
		switch(ch) {
			case 'A': System.out.println("A");break;
			case 'B': System.out.println("B");break;
			case 'C': System.out.println("C");break;
			default: System.out.println("可能没有这个符号");
		}
		
		short weekday = 4;
		switch(weekday) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5: System.out.println("今天是工作日");break;
			case 6:
			case 7: System.out.println("休息日");break;
			default: System.out.println("没有这一天");break;
		}
	}
}
