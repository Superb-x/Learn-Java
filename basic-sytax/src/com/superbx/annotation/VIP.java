package com.superbx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//����ע��
@Target(ElementType.TYPE)//ֻ�������ࡢ�ӿڡ�ö����
@Retention(RetentionPolicy.RUNTIME)//���Դ�����Դ�ļ����ֽ����ļ���JVM��
public @interface VIP {
	//ע��������Ľӿڣ��ӿ����г���ķ�������ע���аѳ��󷽷���Ϊ����
	String level();
	int age() default 20;
	String[] hobby();
	Gender sex() default Gender.NONE;
}
