package org.postgetman.designrest;

import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.postgetman.designrest.configuration.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class DesignRestApplication {

	@Bean
	public DozerBeanMapperFactoryBean configDozer() throws IOException {
		DozerBeanMapperFactoryBean mapper = new DozerBeanMapperFactoryBean();
		Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath*:mapping.xml");
		mapper.setMappingFiles(resources);
		return mapper;
	}
	public static void main(String[] args) {
		SpringApplication.run(DesignRestApplication.class, args);
	}
}
