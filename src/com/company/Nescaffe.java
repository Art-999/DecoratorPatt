package com.company;

public class Nescaffe extends Coffee {
    public Nescaffe() {
        description = "Nescaffe";
    }


    @Override
    protected int coast() {
        return 5;
    }
}
