package demo;
// USB接口示例
// 制定USB规范
interface IUSB{
	void swapData();
}
// USB版本的鼠标类
class Mouses implements IUSB{
	public void swapData(){
		System.out.println("鼠标在移动");
	}
}

// USB版本的打印机类
class Printer implements IUSB{
	public void swapData(){
		System.out.println("我是打印机");
	}
}

// 主板
class MotherBoard {
	// 限制接口个数
	
	private static IUSB[] usbs = new IUSB[6];
	private static int index = 0;
	// 把设备插入到主板当中
	public static void pluginIn(IUSB m) { // 这样的话就可以接收一切IUSB的对象
		if (index == usbs.length) {
			System.out.println("插槽已满");
			return;
		}
		usbs[index] = m;
		index++;
	}
	// 取出主板中的每一个USB设备，并工作
	public static void doWork(){
		for(IUSB usb: usbs) {
			if (usb != null) {
				usb.swapData();	
			}
		}
	}
}

/*
 * 面向接口编程：多态的好处，把实现类对象赋给接口类型变量，屏蔽了不同实现类之间实现的差异，从而可以做到通用编程
 * 按理：使用USB设备来工作
 */
public class USBDemo {
	public static void main(String[] args) {
		MotherBoard.pluginIn(new Mouses());
		MotherBoard.pluginIn(new Printer());
		MotherBoard.pluginIn(new Printer());
		MotherBoard.pluginIn(new Printer());
		// 匿名内部类
		MotherBoard.pluginIn(new IUSB(){
			//匿名内部类体
			public void swapData() {
				System.out.println("键盘正在输入");
			}
		});
		MotherBoard.pluginIn(new Printer());
		MotherBoard.pluginIn(new Printer());
		MotherBoard.pluginIn(new Printer());
		MotherBoard.doWork();
	}
}
