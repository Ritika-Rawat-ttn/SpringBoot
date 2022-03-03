package com.example.demo.Q6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private Honk honk;

    @Autowired
    public Car(Honk honk) {
        this.honk = honk;
    }


    public void Hon(){
//        String str = hock.Honking();
//        System.out.println(str);
//        System.out.println(honk);
        String s=honk.Honking();
        System.out.println(s);
        System.out.println(honk);
    }
}