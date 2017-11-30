package demo;
/*
 * 包名的命名规范
 *   1、全部小些，并且需要遵循标识符规范
 *   2、企业开发中，包名才有公司域名倒写，例如：
 *           com.superbx
 *           如果有数字，==>com.520==>可以用下划线代替.(com._520)
 *           在Android中，如果package中使用了_ ，则不能部署到模拟器上，此时可以用字母代替
 *           例如: com.m520;
 *           
 *   3、自定义的包名不能以Java.打头        
 *   格式：
 *       package 域名倒写.项目名.模块名.组件名
 *                
 */
import java.util.Arrays;

public class PackageDemo {
	public static void main(String[] args) {
		int[] arr = new int[]{1,5,2,4,3,6,8,9,7};

		String str = Arrays.toString(arr);
		System.out.println(str);
		
		Arrays.sort(arr);
		str = Arrays.toString(arr);
		System.out.println(str);
	}
}
