package com.capgemini.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamdaMethodReference {

	
	public static void main(String[] args) {
		
		
		List<String> strings =Arrays.asList("one","two","three","four","five");
		
		//Consumer<String> c1= s -> System.out.println(s);
		
		//using method reference
		List<String> result= new ArrayList<String>();
		
		Consumer<String> c1=System.out::println;
	//	Consumer<String> c2= s-> result.add(s);
		Consumer<String> c2= result::add;
		
		strings.forEach(c1);
		System.out.println("===========");
		strings.forEach(c1.andThen(c2));
				
		
				
	}
}
