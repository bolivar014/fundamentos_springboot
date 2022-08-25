package com.fundamentosPlatzi.springboot.fundamentos;

import com.fundamentosPlatzi.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {
	/*
	// Llamamos a objeto de tipo ComponentDependency a partir de la interfaz
 	*/
	private ComponentDependency componentDependency;

	// Llamamos al constructor e instanciamos la dependencia para poderla inyectar.
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency) {
		this.componentDependency = componentDependency;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);

	}

	@Override
	public void run(String... args){
		// Llamamos a la propiedad componentDependency
		componentDependency.saludar();
	}
}
