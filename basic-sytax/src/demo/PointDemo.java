package demo;

// 点对象
class Point {
	private int x; //横坐标
	private int y; //纵坐标
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
}

// 圆对象
class Circle {
	private int r; // 半径
	Circle(int r) {
		this.r = r;
	}
	
	/*
	 * 判断点和圆的关系，
	 *     返回有三种结果
	 * 	    1:表明在圆外
	 * 	    0:表明在圆周上
	 *     -1:表明在圆内
	 */
	int judge(Point p) {
		int distance = p.getX() * p.getX() + p.getY() * p.getY();
		int rr = this.r * this.r;
		if (distance > rr ) {
			return 1;
		} else if (distance < rr) {
			return -1;
		} else {
			return 0;
		}
	}
}
// 构造器
public class PointDemo {
	public static void main(String[] args){
		// 创建一个点对象
		Point p = new Point(3, 4);
		
		Circle c = new Circle(5);
		
		// 判断
		int ret = c.judge(p);	
		
		System.out.println(ret);
	}
}
