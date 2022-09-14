package com.Question4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

//4.WAP to store elements in List and remove all duplicates names of items.
//After duplicates are removed print all elements in 
//descending order. 
public class Remove {
  public static void main(String[] args) {
	  ArrayList<String> list = new ArrayList<>(Arrays.asList("pen","pencil","pen","bag"));
	  System.out.println("with duplicate "+list);
	 Set<String> set = new LinkedHashSet<>();
	 set.addAll(list);
	 list.clear();
	    list.addAll(set);
	
	System.out.println("without duplicate>>"+list);
	Collections.sort(list);
	Collections.reverse(list);
	System.out.println("descending order is"+list);
	
}
}
