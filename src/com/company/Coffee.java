package com.company;

public abstract class Coffee {
    protected String description="Unknown Description";

    protected abstract int coast();

    protected String getDescription() {
        return description;
    }
}
