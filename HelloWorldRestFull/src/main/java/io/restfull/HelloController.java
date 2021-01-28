package io.restfull;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String Hello(@RequestParam(name="name",defaultValue = "World") String name)
	{
		return "Hello "+name+" With Restfull with Spring boot";
	}

}
