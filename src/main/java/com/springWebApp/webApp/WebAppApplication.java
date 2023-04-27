package com.springWebApp.webApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springWebApp.webApp.repository.CustomProperties;

@SpringBootApplication
public class WebAppApplication implements CommandLineRunner{
	//injection de la classe CustomProoerties
	@Autowired
	private CustomProperties customProperties;

	public static void main(String[] args) {
		SpringApplication.run(WebAppApplication.class, args);
	}

	@Override
	public void run(String ... args ){
		System.out.println(customProperties.getApiUrl());
	}

}
