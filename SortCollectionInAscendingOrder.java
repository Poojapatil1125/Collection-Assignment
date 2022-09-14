package com.Question1;
//1) WAP to sort Collection elements in ascending order.
import java.util.ArrayList;
import java.util.Collections;
public class SortCollectionInAscendingOrder {
  public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(40);
	al.add(20);
	al.add(30);
	al.add(25);
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
}
}
