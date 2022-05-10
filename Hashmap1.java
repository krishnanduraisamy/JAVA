package com.collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {

	public static void main(String[] args) {


	HashMap<Integer,Integer> map = new HashMap<>();
		
		map.put(1,100);
		map.put(2,101);
		map.put(3,103);
		
		
				
		for(Map.Entry m: map.entrySet()) {
			
			System.out.println(m);
		}
				
	}

}
