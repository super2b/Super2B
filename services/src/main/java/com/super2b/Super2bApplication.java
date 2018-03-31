package com.super2b;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Super2bApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(Super2bApplication.class).web(true).run(args);
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<String> hello() {
		System.out.println("Hello super2b rest service");
		return new ResponseEntity<>("Hello Super2b Service", HttpStatus.OK);
	}
}
