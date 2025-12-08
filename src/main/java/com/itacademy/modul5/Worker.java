package com.itacademy.modul5;

public class Worker {

    String name;
    double baseSalary;
    private static final double salaryMultiplier = 1.2;
    public  Worker(){

    }
    public Worker ( String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;

    }
    public double calculateFinalSalary(){
        return  baseSalary * salaryMultiplier;
    }
    public String getInfo(){
        return  " Worker name:" + name +  " \n " +
                "Worker base salary:" + baseSalary;
    }
}
