package com.sample.javaprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringOperations {

	public static void main(String[] args) {
		
		List<StringBuilder> myList = new ArrayList<StringBuilder>();
		myList.add(new StringBuilder("Hi"));
		myList.add(new StringBuilder("I"));
		myList.add(new StringBuilder("am"));
		myList.add(new StringBuilder("Thiru"));
		System.out.println("My List ="+myList);
		for(StringBuilder sb:myList){
			sb.append("90T");
			System.out.println(sb);
		}
		
		Object[] myArray1 = myList.toArray();
		System.out.println("My Array :"+Arrays.toString(myArray1));
		List<String> myTwoList = new ArrayList<String>();
		myTwoList.add("One");
		myTwoList.add("Two");
		myTwoList.add("Three");
		String[] myArray2 = myTwoList.toArray(new String[0]);
		myArray2[0] = "Oneone";
		System.out.println(Arrays.toString(myArray2));
		System.out.println("My List 2"+myTwoList);
		Arrays.sort(myArray2);
		System.out.println(Arrays.toString(myArray2));
		List<Integer> ls1 = new ArrayList<Integer>();
		ls1.add(90);
		ls1.add(01);
		ls1.add(100);
		ls1.add(02);
		Collections.sort(ls1);
		System.out.println(ls1);
		
		String ss = "Hello";
		ss = ss + "World";
		System.out.println(ss);
	}
}
