package com.example.demo.Q1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		BinarySearch binarySearch=new BinarySearch();
		int result=binarySearch.binarySearch(new int[]{12,2,3,4,6},3);


		;
		System.out.println(result);//Tight coupling

		//SpringApplication.run(DemoApplication.class, args);
	}

}
