package com.step.Tests;

public class PizzaFactoryRoco implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new PizzaRoco();
    }

    @Override
    public void showPizza() {
        System.out.println("You select Pizza Roco");
    }

}
