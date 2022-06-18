package com.dataconversion.exceltojsonlist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExceltojsonlistApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExceltojsonlistApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("This is Testing");
	}
}
