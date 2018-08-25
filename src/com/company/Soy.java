package com.company;

public class Soy extends CoffeeDecorator {
    Coffee coffee;

    public Soy(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    protected int coast() {
        return coffee.coast() + 5;
    }

    @Override
    protected String getDescription() {
        return coffee.getDescription() + " soy";
    }
}
