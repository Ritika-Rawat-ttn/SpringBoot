package com.example.demo.Q5;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
        Car car=context.getBean(Car.class);
        car.Hon();

    }
}

