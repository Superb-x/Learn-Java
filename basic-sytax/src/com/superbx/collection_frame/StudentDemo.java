package com.superbx.collection_frame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentDemo {
	public static void main(String[] args) {
		//使用Set集合存储一个班级学生的名称
		Set<String> names1 = new HashSet();
		names1.add("赵一");
		names1.add("钱二");
		names1.add("孙三");
		
		Set<String> names2 = new HashSet();
		names2.add("西门吹雪");
		names2.add("叶孤城");
		names2.add("陆小凤");
		
		//使用Map来存储多个班级的学生
		//学院A
		Map<String, Set<String>> classMap1 = new HashMap<>();
		classMap1.put("学前班", names1);
		classMap1.put("大神班", names2);
		
		//学院B
		Map<String, Set<String>> classMap2 = new HashMap<>();
		classMap2.put("学前班", names1);
		classMap2.put("大神班", names2);
		
		//使用List来存储所有学院的学生姓名
		List<Map<String, Set<String>>> school = new ArrayList<>();
		school.add(classMap1);
		school.add(classMap2);
		
		System.out.println(school); //这种数据结构比较灵活
	}
}
