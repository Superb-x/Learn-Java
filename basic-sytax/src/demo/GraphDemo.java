package demo;

abstract class Graph{  // 抽象类
	abstract public Double getArea(); // 使用抽象类，无方法体，不需要{}
}
class Circles extends Graph {
	private Integer r;
	
	Circles(Integer r) {
		this.r = r;
	}
	
	// 求面积
	public Double getArea(){
		return Math.PI * r * r;
	}
}

// 矩形
class Rectangle extends Graph {
	private Integer width;
	private Integer height;
	
	Rectangle(Integer width, Integer height){
		this.width = width;
		this.height = height;
	}
	
	// 求面积
	public Double getArea(){
		return width.doubleValue() * height.doubleValue();
	}
}

// 三角形
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
		 * 海伦公式
		 * 
		 */
		Double p = (a + b + c)/2.0; // Double类型
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
/*
 * 抽象方法子类必须覆盖，抽象类的方法不能使private static final修饰符,final跟abstract是矛盾的，final定义之后就不能修改 
 * 不能使用new方法创建实例
 * 抽象类必须要有子类，才有用
 */
public class GraphDemo {
	public static void main(String[] args) {
		
	}
}
