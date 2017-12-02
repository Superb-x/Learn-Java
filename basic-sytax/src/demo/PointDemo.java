package demo;

// �����
class Point {
	private int x; //������
	private int y; //������
	
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

// Բ����
class Circle {
	private int r; // �뾶
	Circle(int r) {
		this.r = r;
	}
	
	/*
	 * �жϵ��Բ�Ĺ�ϵ��
	 *     ���������ֽ��
	 * 	    1:������Բ��
	 * 	    0:������Բ����
	 *     -1:������Բ��
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
// ������
public class PointDemo {
	public static void main(String[] args){
		// ����һ�������
		Point p = new Point(3, 4);
		
		Circle c = new Circle(5);
		
		// �ж�
		int ret = c.judge(p);	
		
		System.out.println(ret);
	}
}
