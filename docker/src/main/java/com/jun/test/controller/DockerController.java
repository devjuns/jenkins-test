package com.jun.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@GetMapping(value = "/docker")
	public String docker() {
		System.out.println("hohoho");
		System.out.println("hohoho");
		System.out.println("hohoho");
		return "hohoho";
	}
	@GetMapping(value = "/hehe")
	public String hehe() {
		System.out.println("hohoho");
		System.out.println("hohoho");
		System.out.println("hohoho");
		return "hehe";
	}
}
