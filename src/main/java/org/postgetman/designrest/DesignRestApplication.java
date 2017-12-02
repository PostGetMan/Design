package org.postgetman.designrest;

import org.postgetman.designrest.configuration.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class DesignRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignRestApplication.class, args);
	}
}
