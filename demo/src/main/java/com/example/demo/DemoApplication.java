 package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
	
	
	
	/*
	   steps of Spring Boot using Rest API
	   
	   1. Go to Spring initilizer and crete project 
	   	-select maven version 
	   	- select language
	   	-select spring boot version
	   	- Group : create package
	   	- Artifact : create Folder dame
	   	- jar select 
	   	- java jdk select
	   	- Add Dependency 1.Spring Web
	   					 2.spring Boot Dev tools
	   					 3.Spring Data JPA =for persist Data in sql with JPApi using Spring JPA and HiberNate
	  					 4.MYsql Driver
	  					// 5.Spring Web Services
	    - Generate The jar file and Automaticaly Download inside folder
	  
	  2.Right Click package explorer/Click File
	       -import select import
	       -Maven project
	       -Existing Maven Project 
	       -Add/select Downloded jar file 
	       -Goto build Path ->configer -> update /build
	
	
	3. create Controller Class
	-Mark Class As @RestController 
					:Types that carry this annotation are treated as controllers 
					where @RequestMapping methods assume @ResponseBody semantics by default. 
	 
	- Mark method GetMapping("/url")
	     Annotation for mapping HTTP GET requests onto specific handlermethods.
	
	-RequstMapping("/url")
				Annotation for mapping HTTP GET requests onto specific handlermethods.
	
	
	 */
}
