package com.docker.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	
	
	@GetMapping("/getMessage")
	public String getMessage() {
		
		return "Hello docker.?";
	}
}
