package com.superbx.collection_frame;

import java.util.Vector;

public class VectorMethodDemo {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add("A");
		v1.add("B");
		v1.add("C");
		System.out.println(v1);
		v1.add(0, "LXL");
		System.out.println(v1);
		
		Vector v2 = new Vector();
		v2.add(1);
		v2.add(2);
		v2.add(3);
		
		//v1.add(v1);//[LXL,A,B,C, (this collection)]
		v1.addAll(v2); //会拼接起来
		System.out.println(v1);
	}
}
