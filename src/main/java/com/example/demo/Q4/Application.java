package com.example.demo.Q4;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(Application.class, args);  //Application Context
        Employee employee=context.getBean(Employee.class);     //Getbean

        //employee.getName();
        employee.setName("Ritika");
        employee.setTech("JVM");
        System.out.println( employee.getName());
        System.out.println(employee.getTech());             //Displaying its properties


    }
}
