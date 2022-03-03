package com.example.demo.Q4;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(Application.class, args);
        Employee employee=context.getBean(Employee.class);

        //employee.getName();
        System.out.println( employee.getName());


    }
}
