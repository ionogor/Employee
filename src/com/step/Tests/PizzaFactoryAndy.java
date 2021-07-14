package com.step.Tests;

public class PizzaFactoryAndy implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new PizzaAndy();
    }

    @Override
    public void showPizza() {
        System.out.println("You select pizza Andy");
    }
}
