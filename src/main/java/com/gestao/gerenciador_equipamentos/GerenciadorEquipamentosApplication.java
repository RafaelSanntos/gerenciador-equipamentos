package com.gestao.gerenciador_equipamentos;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciadorEquipamentosApplication {

	public static void main(String[] args) {
		// Carrega o arquivo .env
		Dotenv dotenv = Dotenv.load();

		// Define as variáveis de ambiente para o Spring Boot
		System.setProperty("DB_URL", dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD"));

		// Inicializa a aplicação Spring Boot
		SpringApplication.run(GerenciadorEquipamentosApplication.class, args);
	}
}
