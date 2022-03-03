package com.example.demo.Q5;

import org.springframework.stereotype.Component;

@Component
public class BMW implements Honk{
    public String Honking(){
        return "BMW Honking";
    }
}