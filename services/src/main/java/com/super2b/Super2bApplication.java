package com.super2b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Super2bApplication {

	public static void main(String[] args) {
    SpringApplication.run(Super2bApplication.class, args);
  }

	//@RequestMapping(value = "/hello", method = RequestMethod.GET)
	//public ResponseEntity<String> hello() {
	//	System.out.println("Hello super2b rest service");
	//	return new ResponseEntity<>("Hello Super2b Service", HttpStatus.OK);
	//}
}
