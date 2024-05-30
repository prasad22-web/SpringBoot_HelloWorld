package com.sample.helloworld_gradel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	
	@GetMapping("/show")
	public String show() {
		return "Hello World";
	}

}
