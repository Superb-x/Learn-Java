package com.superbx.collection_frame;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, Object> map = new TreeMap<>();
		map.put("A", "Avalue");
		map.put("B", "Bvalue");
		map.put("C", "Cvalue");
		map.put("D", "Dvalue");
		map.put("E", "Evalue");
		map.put("1", "1value");
		map.put("2", "2value");
		System.out.println(map);
	}
}
