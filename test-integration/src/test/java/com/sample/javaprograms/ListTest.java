package com.sample.javaprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class ListTest {

	public static void main(String[] args) {
		
		List<String> lst  = new ArrayList<String>();
		List<Integer> lstInt = new ArrayList<Integer>();
		lst.add("Thiru");
		lst.add("Sumdoth");
		lst.add("Aakash");
		lst.add("Abhiroop");
		System.out.println(lst);
		
		Iterator<String> iterator = lst.iterator();
		System.out.println("Iterator = "+iterator);
		
		while(iterator.hasNext()){
			String nextelement = iterator.next();
			System.out.println("Next Element = "+nextelement);
		}
		
		for(String str1 : lst)
			System.out.println(str1);
		
		Integer intobj  = new Integer(322);
		int i = intobj.intValue();
		System.out.println("Ivalue"+i);
		
		Integer a =32;
		int ab =a;
		System.out.println("abv"+ab);
		
		for (int j= 0; j < 10; j++) {
			System.out.println();
		}
		
		Random random = new Random();
		for(int k=0;k<5;k++){
			lstInt.add(random.nextInt(5));
		}
		System.out.println("Integer List :"+lstInt);
		
		Iterator<Integer> iter = lstInt.iterator();
		while(iter.hasNext()){
			int lstval = iter.next();
			System.out.println("Integers in the Iterator List are"+lstval);
		}
		
		for(int ki:lstInt){
			System.out.println("Integers in Enhanced For Loop:"+ki);
		}
		for(int p=0;p<lstInt.size();p++){
			System.out.println(lstInt.get(p));
		}
	}
}
