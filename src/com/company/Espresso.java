package com.company;

public class Espresso extends Coffee {
    public Espresso() {
        description = "Espresso";
    }


    @Override
    protected int coast() {
        return 7;
    }
}
