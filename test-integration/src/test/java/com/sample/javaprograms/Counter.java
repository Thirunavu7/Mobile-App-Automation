package com.sample.javaprograms;

public class Counter {

	static int count =0;
	Counter(){
		count++;
		System.out.println("count"+count);
	}

	public static void main(String args[]){
		Counter c = new Counter();
		Counter c1 = new Counter();
	}
}
