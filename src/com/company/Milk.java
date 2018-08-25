package com.company;

public class Milk extends CoffeeDecorator {
    Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    protected int coast() {
        return coffee.coast() + 5;
    }

    @Override
    protected String getDescription() {
        return coffee.getDescription() + " milk";
    }
}
