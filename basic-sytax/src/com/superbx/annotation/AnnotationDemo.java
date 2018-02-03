package com.superbx.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

//ע��Ķ����ʹ��

@VIP(level="�߼�", age=17, hobby={"Java", "Python", "JavaScript"}, sex=Gender.MALE)
class Person {
	@Deprecated
	public void doWork(){
		
	}
}

@SuppressWarnings("all")//���ֻ�ܴ����ڱ���ʱ��
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
	
	@Override //������ע�⣬װ����
	public String toString() {
		return super.toString();
	}
	//����ע�����⹦��
	public static void main(String[] args) throws Exception {
		//��ȡPerson���ϵ�VIPע���е���Ϣ
		Class cls = Person.class;
		Annotation[] as = cls.getAnnotations();
		//�ж�Person�����Ƿ���VIPע��
		boolean isVip = cls.isAnnotationPresent(VIP.class);
		if(isVip) {
			//ȥ��Person���ϵ�VIPע��
			Annotation a = cls.getAnnotation(VIP.class);
			//��ȡVIPע���е�����ֵ
			VIP vip = (VIP)a;
			System.out.println(vip.level());
			System.out.println(vip.age());
			System.out.println(Arrays.toString(vip.hobby()));
			System.out.println(vip.sex()); //����Ҫ��enum��ȡ�������ɵ������ļ�
		}
		//��ȡdoWrok�����ϵ�Deprecatedע��
		//1.��ȡdoWork�������ڵ��ֽ������
		Class cls1 = Person.class;
		//2����ȡdoWork����
		Method m = cls1.getMethod("doWork");
		System.out.println(m);
		Deprecated depre = m.getAnnotation(Deprecated.class);
		System.out.println(depre);
	}
}
