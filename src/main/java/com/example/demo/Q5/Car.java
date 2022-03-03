package com.example.demo.Q5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private Honk honk;


    public void Hon(){
        String str = honk.Honking();
        System.out.println(str);
        System.out.println(honk);
    }
}