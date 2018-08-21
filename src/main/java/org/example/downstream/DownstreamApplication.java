package org.example.downstream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DownstreamApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DownstreamApplication.class, args);
	}

}
