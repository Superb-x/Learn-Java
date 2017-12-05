package demo;
// 模板设计方法

abstract class OperateTimeTemplate { // 设计一个父类骨架
	// 模板方法，总体算法的骨架
	public final long getTotalTime(){ // 模板方法子类不能去修改
		long begin = System.currentTimeMillis(); // 开始时间
		// 具体方法留给子类
		this.doWork();
		long end = System.currentTimeMillis(); // 结束时间
		long time = end - begin; // 时间差
		
		return time;
	}
	// 具体操作，子类必须覆盖
	protected abstract void doWork();
}
class StringOperate extends OperateTimeTemplate{
	protected void doWork(){
		String str = "";
		for(int i = 0;i < 10000000;i++) {
			str += i;
		}
		
	}
}
// int类型相加，运算速度相当快
class IntOperate extends OperateTimeTemplate{
	protected void doWork(){
		
		int sum = 0;
		for (int i = 0;i < 10000;i++) {
			sum += i;
		}
	}
}
public class TemplateMethodDemo {
	public static void main(String[] args) {
		long time = new StringOperate().getTotalTime();
		System.out.println(time);
		System.out.println(new IntOperate().getTotalTime());
	}
}
