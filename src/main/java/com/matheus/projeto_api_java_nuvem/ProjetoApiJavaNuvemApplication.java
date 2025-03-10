package com.matheus.projeto_api_java_nuvem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
public class ProjetoApiJavaNuvemApplication implements CommandLineRunner {

	@Value("${spring.datasource.url}")
	private String datasourceUrl;

	@Value("${spring.datasource.username}")
	private String datasourceUser;

	@Value("${spring.datasource.password}")
	private String datasourcePassword;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoApiJavaNuvemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Verificando se as variáveis de ambiente estão sendo lidas corretamente
		System.out.println("DATABASE URL: " + datasourceUrl);
		System.out.println("DATABASE USER: " + datasourceUser);

		System.out.println("DATABASE PASSWORD: " + (datasourcePassword != null ? "******" : "NOT SET"));
	}
}
