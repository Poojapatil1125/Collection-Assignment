package com.Question6;
//6.WAP to store data in hashmap. Keys are the city name and 
//values are the population. Now you have to sort the all 
//elements (on the basis of city name ) in hashmap and 
//print the detail
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
public class Basic {
	static Map<String, Integer> map = new HashMap<>();
	public static void sortbykey()
	        {
	            ArrayList<String> sortedKeys
	                = new ArrayList<String>(map.keySet());
	            Collections.sort(sortedKeys);
	            for (String x : sortedKeys)
	                System.out.println("Key = " + x);
	                                   
	        }
	        public static void main(String args[])
	        {
	          
	            map.put("Pune", 80);
	            map.put("Mumbai", 90);
	            map.put("Nagar", 80);
	            map.put("Jalgaon", 75);
	            map.put("Nagpur", 40);
	            System.out.println(map);
	               sortbykey();
	       	}
}
