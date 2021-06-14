package com.desafio.pokeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PokeapiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PokeapiApplication.class, args);
	}

}
