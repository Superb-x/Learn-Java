package demo;

abstract class Graph{  // ������
	abstract public Double getArea(); // ʹ�ó����࣬�޷����壬����Ҫ{}
}
class Circles extends Graph {
	private Integer r;
	
	Circles(Integer r) {
		this.r = r;
	}
	
	// �����
	public Double getArea(){
		return Math.PI * r * r;
	}
}

// ����
class Rectangle extends Graph {
	private Integer width;
	private Integer height;
	
	Rectangle(Integer width, Integer height){
		this.width = width;
		this.height = height;
	}
	
	// �����
	public Double getArea(){
		return width.doubleValue() * height.doubleValue();
	}
}

// ������
class Triangle extends Graph {
	private Integer a;
	private Integer b;
	private Integer c;
	
	Triangle(Integer a, Integer b, Integer c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Double getArea(){
		/*
		 * ���׹�ʽ
		 * 
		 */
		Double p = (a + b + c)/2.0; // Double����
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
/*
 * ���󷽷�������븲�ǣ�������ķ�������ʹprivate static final���η�,final��abstract��ì�ܵģ�final����֮��Ͳ����޸� 
 * ����ʹ��new��������ʵ��
 * ���������Ҫ�����࣬������
 */
public class GraphDemo {
	public static void main(String[] args) {
		
	}
}
