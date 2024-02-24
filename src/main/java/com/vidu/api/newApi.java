package com.vidu.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class newApi {
	
	
	@GetMapping("/test")
	public String testApi() {
		
		
		
		return "success" ;
	}

}
