package com.michel.reliability;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.michel.reliability.Constants.Constants;

@Configuration
public class MvcConfiguration  implements WebMvcConfigurer{
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
		
		// Version linux
		registry.addResourceHandler(Constants.RESSOURCE_FOLDER)
		.addResourceLocations(Constants.RESSOURCE_LOCATION);
		
		
		
	}
	
	

}
