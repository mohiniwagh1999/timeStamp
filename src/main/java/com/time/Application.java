package com.time;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.time.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext c=SpringApplication.run(Application.class, args);
		ProductService pc=c.getBean(ProductService.class);
				pc.saveProduct();
	}

}
