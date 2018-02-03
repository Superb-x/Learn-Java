package com.superbx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//定义注解
@Target(ElementType.TYPE)//只能贴在类、接口、枚举上
@Retention(RetentionPolicy.RUNTIME)//可以存在于源文件、字节码文件、JVM中
public @interface VIP {
	//注解是特殊的接口，接口中有抽象的方法，在注解中把抽象方法称为属性
	String level();
	int age() default 20;
	String[] hobby();
	Gender sex() default Gender.NONE;
}
