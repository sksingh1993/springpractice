package org.arpit.java2blog.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class SpringRestController {
	@Autowired
	private Hello hello;
	@Autowired
	private Welcome welcome;
 @RequestMapping(value = "/{name}", method = RequestMethod.GET)
 public String hello(@PathVariable String name) {
	 hello.greet();
	 welcome.getWelcome();
  String result="Hello "+name;  
  return result;
 }
}