package com.itacademy.modul5;

public class Driver extends Worker{

    String driverLicenceCategory;
    public Driver(String name,double baseSalary,String driverLicenceCategory){
        super(name, baseSalary);
        this.driverLicenceCategory= driverLicenceCategory;
    }
    @Override
    public String getInfo(){
        return  "Driver name:" + name + " \n"+
                "Driver base salary: " + baseSalary + "\n" +
                "Driver licence category:" + driverLicenceCategory;
    }
}
