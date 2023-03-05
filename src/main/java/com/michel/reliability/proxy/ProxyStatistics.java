package com.michel.reliability.proxy;

import org.springframework.web.bind.annotation.GetMapping;

public interface ProxyStatistics {
	
	@GetMapping("/test1")
	void activeTest1();
	
	@GetMapping("/reg")
	void regression();
	
	@GetMapping("/test3")
	void activeTest2();
	
	@GetMapping("/coef")
	void coefficients();

}
