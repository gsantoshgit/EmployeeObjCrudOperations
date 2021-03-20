package com.gs.demo.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication
 
public class SpringBootEmployeeRestServicesApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringBootEmployeeRestServicesApplication.class);
	public static void main(String[] args) {
		
		log.info("SpringBootEmployeeRestServicesApplication :: main entry ::");
		SpringApplication.run(SpringBootEmployeeRestServicesApplication.class, args);
		log.info("SpringBootEmployeeRestServicesApplication :: main exit ::");
	}

}
