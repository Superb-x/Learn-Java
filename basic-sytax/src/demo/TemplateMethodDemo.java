package demo;
// ģ����Ʒ���

abstract class OperateTimeTemplate { // ���һ������Ǽ�
	// ģ�巽���������㷨�ĹǼ�
	public final long getTotalTime(){ // ģ�巽�����಻��ȥ�޸�
		long begin = System.currentTimeMillis(); // ��ʼʱ��
		// ���巽����������
		this.doWork();
		long end = System.currentTimeMillis(); // ����ʱ��
		long time = end - begin; // ʱ���
		
		return time;
	}
	// ���������������븲��
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
// int������ӣ������ٶ��൱��
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
