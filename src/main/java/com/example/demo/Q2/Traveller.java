package com.example.demo.Q2;

import org.springframework.boot.autoconfigure.SpringBootApplication;


//Loosely Coupled -It basically makes every Class independent to each other and make Code resusable


@SpringBootApplication
public class Traveller {
     static Vehicle vehicle ;
    public void setVehicle(Vehicle vehicle){

        this.vehicle=vehicle;
    }

    public static void main(String[] args) {
        Traveller t=new Traveller();
        t.setVehicle(new Car());
        vehicle.start();
    }
}
