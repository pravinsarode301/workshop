package com.lab.poc;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	
	@GetMapping("/email")
	String sendEmail(@RequestParam("address") String email){
		System.out.print("email service is being called"+email);
		
	
		return "mail sent";
		
	}

}
