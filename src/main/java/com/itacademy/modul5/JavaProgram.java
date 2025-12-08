package com.itacademy.modul5;

public class JavaProgram {
    public static void main(String[] args) {
        Worker worker = new Worker("John Lord", 50000);
        System.out.println(worker.getInfo());
        System.out.println("Final salary" + worker.calculateFinalSalary());

        Driver driver = new Driver("Ben Torrance", 7000,"E");
        System.out.println(driver.getInfo());
        System.out.println(" Driver final salary: "+ driver.calculateFinalSalary());

        Manager manager = new Manager("Tom Lord", 100000,"executive");
        System.out.println(manager.getInfo());
        System.out.println("Manager final salary:" + manager.calculateFinalSalary());
    }
}
