// 99乘法表
public class Table99Demo {
	public static void main(String[] args){
		outer: for(int i = 1;i <= 9;i++) {
			// 控制列
			for (int j = 1;j <= i;j++) {
				if (i == 5) {
					break outer; // 只能结束当前循环
				}
				System.out.print(i + " * " + j + " = " + i * j + " ");
			}
			System.out.println("");
		}
	}
}
