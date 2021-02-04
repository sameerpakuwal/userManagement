package com.vastika.um.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/sam")
	public ModelAndView sayHelloo() {
		ModelAndView view = new ModelAndView("intro");
		return view;
	}
	
	@RequestMapping("/hello")
	public ModelAndView sayHello() {
		ModelAndView view = new ModelAndView("greet");
		view.addObject("hi", "My name is sameer.");
		return view;
	}

	@RequestMapping("/greet1/{first_name}")
	public ModelAndView greet1(@PathVariable("first_name") String firstName) {
		ModelAndView view = new ModelAndView("greet");
		view.addObject("hi", "My name is " + firstName + ".");
		return view;
	}

	@RequestMapping("/greet2/{first_name}/{lastName}")
	public ModelAndView greet2(@PathVariable("first_name") String firstName, @PathVariable String lastName) {
		ModelAndView view = new ModelAndView("greet");
		view.addObject("hi", "My first name is " + firstName + " and last name is "+lastName+".");
		return view;
	}
	@RequestMapping("/greet3/{first_name}/{last_name}")
	public ModelAndView greet3(@PathVariable Map<String,String> info) {
		ModelAndView view = new ModelAndView("greet");
		view.addObject("hi", "My first name is " + info.get("first_name") + " and last name is "+info.get("last_name")+".");
		return view;
	}
	@RequestMapping("/greet4")
	public ModelAndView greet4(@RequestParam String firstName, @RequestParam String lastName) {
		ModelAndView view = new ModelAndView("greet");
		view.addObject("hi", "My first name is " + firstName + " and last name is "+lastName+".");
		return view;
	}
	
	@RequestMapping("/greet5" )
	public ModelAndView greet5(@RequestParam Map<String,String> info) {
		ModelAndView view = new ModelAndView("greet");
		view.addObject("hi", "My first name is " + info.get("first_name") + " and last name is "+info.get("last_name")+".");
		return view;
	}
}
