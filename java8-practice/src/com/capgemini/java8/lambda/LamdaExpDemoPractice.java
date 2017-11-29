package com.capgemini.java8.lambda;
import java.io.File;
import java.io.FileFilter;


public class LamdaExpDemoPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		//using fileFileter interface by using ananymous class instance   
		
	/*	FileFilter fileFilter= new FileFilter() {
			
			
			public boolean accept(File file) {
				return file.getName().endsWith(".java");
				
			}
			
		};*/
		
		//using lamda expression
				
		FileFilter lamda=(File file) -> file.getName().endsWith(".java");
		
		File dir= new File("D:\\temp");
		File[] files= dir.listFiles(lamda);
		for (File f:files) {
			System.out.println("files"+f);
		}
		
	
		
		
		
				
		
	}

}
