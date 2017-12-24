package com.superbx.collection_frame;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");
		map.put("key5", "value555");
		System.out.println(map);
		System.out.println(map.containsKey("key1")); //you can understand the mean from word
		System.out.println(map.containsValue("value2"));
		map.remove("key5");
		
		//get all set from Map
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(map.get(key));
		}
		System.out.println("----------------------");
		Collection<Object> values = map.values();
		for(Object val : values) {
			System.out.println(val);
		}
		System.out.println("------------EntrySet------------");
		//获取map中所有的Entry(key-value)
		Set<Map.Entry<String, Object>> entrys = map.entrySet();
		for(Map.Entry<String, Object> entry : entrys) {
			String key = entry.getKey();
			Object val = entry.getValue();
			System.out.println(key + " = " + val);
		}
	}
}
