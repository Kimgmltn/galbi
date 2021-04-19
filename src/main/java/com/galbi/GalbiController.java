package com.galbi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GalbiController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}

}
