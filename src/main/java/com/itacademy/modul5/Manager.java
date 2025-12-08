package com.itacademy.modul5;

public class Manager extends Worker{
    String type;

    public  static  final double managerBonusMultiplier= 1.7;
    public Manager(String name,  double baseSalary, String type){
        super(name, baseSalary);
        this.type = type;

    }
    @Override
    public String getInfo(){
        return "Manager name:" + name + "\n" +
                "Manager base salary:" + baseSalary + "\n" +
                "Manager type:" + type;
    }
    @Override
    public  double calculateFinalSalary(){
        return super.calculateFinalSalary()* managerBonusMultiplier;
    }

}
