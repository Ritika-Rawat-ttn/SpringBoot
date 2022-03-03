package com.example.demo.Q4;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private int cid;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    private String Cname;

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", Cname='" + Cname + '\'' +
                '}';
    }
    public void compile(){
        System.out.println("Customer Compiling");
    }
}
