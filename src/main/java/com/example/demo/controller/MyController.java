package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	
	@GetMapping(value="/",produces={MediaType.APPLICATION_JSON_VALUE})
	public String index(){
		return "AAAA";
	}
	@GetMapping(value="/ok")
	public String index2(){
		return "Hello";
	}
}
