package com.test;

import java.util.HashMap;
import java.util.Map;

public class CountArray {
	public static void main(String[] args) {
		
		int a[]= { 10,20,40,30,50};
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i],map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		System.out.println(map);
	}
	

}
