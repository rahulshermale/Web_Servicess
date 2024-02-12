package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/bridgenum")
	int getBridgeNumber() {
		System.out.println(2);
		return 200;
	}
	
	
	@RequestMapping("/bridgename/{name}")
	List<String> getBridgeName(@PathVariable String name){
		System.out.println("This is Name "+name);
		
		
		List<String> list=new ArrayList<String>();
		
		System.out.println(1);
		list.add("Rajaram Bridge");
		list.add("Z Bridge");
		list.add("Navale Bridge");
		list.add("Warje Bridge");
		
		return list;
		
		
	}
}
