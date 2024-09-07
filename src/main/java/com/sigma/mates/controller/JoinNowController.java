package com.sigma.mates.controller;

import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoinNowController {
	
@GetMapping("/join")
public String login() {
	return "Pintu Bhaiya";
}

}
