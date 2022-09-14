package com.Question5;
import java.util.Collections;
import java.util.Vector;
//5.WAP to store data related to item in Vector and after 
//that sort the data.
public class StoreData {
  public static void main(String[] args) {
	Vector<String> vec=new Vector<String>();
	vec.add("book");
	vec.add("mouse");
	vec.add("laptop");
	vec.add("projector");
	System.out.println("Vector elements is "+vec);
	Collections.sort(vec);
	System.out.println("after sorting>> "+vec);
}
}
