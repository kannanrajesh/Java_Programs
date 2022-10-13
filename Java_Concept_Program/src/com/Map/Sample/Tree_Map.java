package com.Map.Sample;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Tree_Map {

	public static void main(String[] args) {
//		Map<Integer, String> map = new TreeMap<Integer, String>();
//		map.put(3, "RAJESH");
//		map.put(8, "KOKILA");
//		map.put(9, "RAM");
//		map.put(4, "YOGESH");
//		map.put(5, "DIVYA");
//		map.put(7, "SUBIKSHA");
//		//map.put(null, "Tree"); //does not accept null key
//		map.put(21, null);		//accepts null values
//		map.put(2, "GEETHA");
//		map.put(1, "DURAI");
//		map.put(6, "SIVANANTHAM");
//		System.out.println("TreeMap is Ascending order :"+map);
//		//size--->return length
//				int size = map.size();
//				System.out.println("Size of Map :"+size);
//				//index--->size-1
//				int index =size-1;
//				System.out.println("Index of Map :"+index);
//				//contains key mehod
//				boolean key = map.containsKey(7);
//				System.out.println("check 7 is present or not :"+key);
//				//contains value method
//				boolean Value = map.containsValue("Ram");
//				System.out.println("check whether given value is present or not :"+Value);
//				//isEmpty method
//				boolean empty = map.isEmpty();
//				System.out.println("map is empty or not :"+empty);
//				//getKey method
//				String string = map.get(1);
//				System.out.println("value of  key :"+string);
//				//keyset method
//				Set<Integer> keySet = map.keySet();
//				System.out.println("keys  :"+keySet);
//				for (Integer i : keySet) {
//					System.out.println(i);
//				}
//				//values
//				Collection<String> values = map.values();
//				System.out.println("values :"+values);
//				for (String xyz : values) {
//					System.out.println(xyz);
//				}
//				//entryset method
//				Set<Entry<Integer, String>> entrySet = map.entrySet();
//				System.out.println("entryset :"+entrySet);
//				for (Entry<Integer, String> entry : entrySet) {
//					System.out.println("entry :"+entry);
//				}
//				map.clear();
//				System.out.println("map is cleared :"+map);
//				boolean empty1 = map.isEmpty();
//				System.out.println("map is empty or not :"+empty1);
		TreeMap<Integer,Integer>map;
        map=new TreeMap<Integer,Integer>();
       Integer[] list = {9,2,3,4,5,6,7,10,3,4,2,3,4,2,3};
       for(Integer num : list)
       if(map.get(num)==null)
       map.put(num,1 );
       else
       map.put(num,map.get(num )+1);
       
       System.out.println(map.values());
	
	}
	
	}
	

