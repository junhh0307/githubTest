package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class HelloController {

	@GetMapping("/hello")
	public String hello(Model model) {

		model.addAttribute("data", "hello!!");

		model.addAttribute("aaa", "ㅋㄷㅋㄷㅋㄷㄷ");

		return "hello";
	}


	@GetMapping("/hello-mvc")
	public String helloMvc( Model model) {

		String name = "한준희";

		System.out.println("name        ////    " + name);

		model.addAttribute("name", name);

		return "hello-template";
	}


	@GetMapping("hello-string")
	@ResponseBody
	public String helloString(@RequestParam("name") String name) {


		return "hello " + name;
	}


	@GetMapping("/component")
	public String component(Model model) {

		return "component";
	}

}
