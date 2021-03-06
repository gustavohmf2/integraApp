package br.com.integra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="br.com.integra")
@EnableAutoConfiguration
public class Aplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(Aplication.class);//objeto de configuração do spring
		
	}
	
	public static void main(String[] args){
		SpringApplication.run(Aplication.class, args);
	}
}
