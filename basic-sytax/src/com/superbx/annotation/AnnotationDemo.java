package com.superbx.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

//注解的定义和使用

@VIP(level="高级", age=17, hobby={"Java", "Python", "JavaScript"}, sex=Gender.MALE)
class Person {
	@Deprecated
	public void doWork(){
		
	}
}

@SuppressWarnings("all")//这个只能存在于编译时期
public class AnnotationDemo {
	
	@SuppressWarnings({"rawtypes", "unused"})
	public void doWork(){
		Set set = null;
		List list = null;
	}
	
	public void doWork2(){
		@SuppressWarnings({"rawtypes", "unused"})
		Set set = null;
		@SuppressWarnings({"rawtypes", "unused"})
		List list = null;
	}
	
	@Override //它就是注解，装饰器
	public String toString() {
		return super.toString();
	}
	//赋予注解特殊功能
	public static void main(String[] args) throws Exception {
		//获取Person类上的VIP注解中的信息
		Class cls = Person.class;
		Annotation[] as = cls.getAnnotations();
		//判断Person类上是否有VIP注解
		boolean isVip = cls.isAnnotationPresent(VIP.class);
		if(isVip) {
			//去除Person类上的VIP注解
			Annotation a = cls.getAnnotation(VIP.class);
			//获取VIP注解中的属性值
			VIP vip = (VIP)a;
			System.out.println(vip.level());
			System.out.println(vip.age());
			System.out.println(Arrays.toString(vip.hobby()));
			System.out.println(vip.sex()); //这里要把enum提取出来生成单独的文件
		}
		//获取doWrok方法上的Deprecated注解
		//1.获取doWork方法所在的字节码对象
		Class cls1 = Person.class;
		//2、获取doWork方法
		Method m = cls1.getMethod("doWork");
		System.out.println(m);
		Deprecated depre = m.getAnnotation(Deprecated.class);
		System.out.println(depre);
	}
}
