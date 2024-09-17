package com.health.healthprobe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HealthprobeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthprobeApplication.class, args);
	}

}
