package com.company;

public class Main {

    public static void main(String[] args) {
        Coffee coffee = new Nescaffe();
        System.out.println(coffee.getDescription() + " " + coffee.coast() + "$");

        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription() + " " + coffee.coast() + "$");

        coffee=new Soy(coffee);
        System.out.println(coffee.getDescription() + " " + coffee.coast() + "$");


        Coffee coffee1=new Soy(new Nescaffe());
        System.out.println(coffee1.getDescription() + " " + coffee1.coast() + "$");
    }
}
