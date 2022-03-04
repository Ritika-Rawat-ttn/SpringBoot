package com.example.demo.Q4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//Component - This inject Dependency is an annotation that allows Spring to automatically detect our custom beans.
@Component
public class Employee {

    private int id;
    private String name;
    private String tech;


    @Autowired
    private Customer customer;

    public Employee() {
        super();
        System.out.println("no object"); //Constructor
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void show(){             //Printing
        System.out.println("This is Employee ");
        customer.compile();  //Autowrite printing


    }
}
