package de.ratopi.springboot.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController
{
	@RequestMapping( "/" )
	String home()
	{
		return "Hello World!";
	}
}
