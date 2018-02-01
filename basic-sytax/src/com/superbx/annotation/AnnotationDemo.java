package com.superbx.annotation;

import java.util.List;
import java.util.Set;

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
}
