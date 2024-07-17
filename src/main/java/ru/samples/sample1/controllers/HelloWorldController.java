package ru.samples.sample1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloWorldController {
	@GetMapping(produces= "text/html")
	public String sayHello () {
		return 
"<!DOCTYPE html>"+
"<html>"+
"	<head><title>Hello world!</title></head>"+
"	<body>Hello world!</body>"+
"</html>"
			;
	}
}
