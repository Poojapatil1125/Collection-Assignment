package com.Question3;
//3.WAP to store elements in List and remove all duplicates 
//value from it. (Numbers should be inserted). When 
//duplicates are removed print all elements in ascending 
//order.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class Sample {
	public static void main(String[] args) {
	 ArrayList<Integer> list = new ArrayList<>();
     list.add(20);
     list.add(10);
     list.add(5);
     list.add(8);
     list.add(5);
     System.out.println("ArrayList"+list);
     //Construct a new list from the set constucted from elements
     // of the original list
     List<Integer> newList = list.stream()
                                   .distinct()
                                   .collect(Collectors.toList());

     // Print the ArrayList with duplicates removed
     System.out.println("ArrayList with duplicates removed: "
                        + newList);
     Collections.sort(newList);
     System.out.println("ascending order : " + newList);
	}
     
 }

