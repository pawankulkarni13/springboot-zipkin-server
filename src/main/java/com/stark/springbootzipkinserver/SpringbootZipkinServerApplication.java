package com.stark.springbootzipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SpringbootZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootZipkinServerApplication.class, args);
	}

}
