package com.michel.reliability;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MtbTmeterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MtbTmeterApplication.class, args);
	}

}
