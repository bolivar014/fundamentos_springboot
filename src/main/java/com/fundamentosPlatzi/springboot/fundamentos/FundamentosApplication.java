package com.fundamentosPlatzi.springboot.fundamentos;

import com.fundamentosPlatzi.springboot.fundamentos.bean.MyBean;
import com.fundamentosPlatzi.springboot.fundamentos.bean.MyBeanWithDependency;
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
	private MyBean myBean;

	private MyBeanWithDependency myBeanWithDependency;

	// Llamamos al constructor e instanciamos la dependencia para poderla inyectar.
	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
	}
	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);

	}

	@Override
	public void run(String... args){
		// Llamamos a la propiedad componentDependency
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
	}
}
