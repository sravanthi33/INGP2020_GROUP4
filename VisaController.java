package visa.visa.visa.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VisaController {
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/test")
	public String first(){
		return "hello";
	}
}
