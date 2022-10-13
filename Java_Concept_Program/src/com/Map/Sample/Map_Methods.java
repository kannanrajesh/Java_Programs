package com.Map.Sample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Methods {

	public static void main(String[] args) {
			Map<Integer, String> map = new HashMap<Integer, String>();
			map.put(3, "RAJESH");
			map.put(8, "KOKILA");
			map.put(9, "RAM");
			map.put(null, "Bike");
			map.put(34, null);			//acecepts null value and key
			map.put(4, "YOGESH");
			map.put(5, "DIVYA");
			map.put(7, "SUBIKSHA");
			map.put(2, "GEETHA");
			map.put(1, "DURAI");
			map.put(6, "SIVANANTHAM");
			System.out.println("Hashmap is random order :"+map);
			//size--->return length
			int size = map.size();
			System.out.println("Size of Map :"+size);
			//index--->size-1
			int index =size-1;
			System.out.println("Index of Map :"+index);
			//contains key mehod
			boolean key = map.containsKey(7);
			System.out.println("check 7 is present or not :"+key);
			//contains value method
			boolean Value = map.containsValue("donn");
			System.out.println("check whether given value is present or not :"+Value);
			//isEmpty method
			boolean empty = map.isEmpty();
			System.out.println("map is empty or not :"+empty);
			//getKey method
			String string = map.get(1);
			System.out.println("value of  key :"+string);
			//keyset method
			Set<Integer> keySet = map.keySet();
			System.out.println("keys  :"+keySet);
			for (Integer i : keySet) {
				System.out.println(i);
			}
			//values
			Collection<String> values = map.values();
			System.out.println("values :"+values);
			for (String xyz : values) {
				System.out.println(xyz);
			}
			//entryset method
			Set<Entry<Integer, String>> entrySet = map.entrySet();
			System.out.println("entryset :"+entrySet);
			for (Entry<Integer, String> entry : entrySet) {
				System.out.println("entry :"+entry);
				
			}
			//clear
			map.clear();
			System.out.println("map is cleared :"+map);
			
	}
	
  
}
