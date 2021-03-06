package com.duniv;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EntityScan(basePackages= {"com.duniv"})
@SpringBootApplication
public class CafelodiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CafelodiApplication.class, args);
	}

}
