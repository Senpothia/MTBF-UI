package com.michel.reliability.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "mtbf-api", url = "http://localhost:6239/")
public interface MicroServiceMTBF extends ProxyGlobal{

	

	

	
}
