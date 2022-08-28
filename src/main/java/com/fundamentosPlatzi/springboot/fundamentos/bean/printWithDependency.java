package com.fundamentosPlatzi.springboot.fundamentos.bean;

public class printWithDependency implements MyBeanWithDependency {


    @Override
    public void printWithDependency() {
        System.out.println("Hola desde la implementación de un bin con dependencias...");
    }
}
