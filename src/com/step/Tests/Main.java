package com.step.Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        PizzaFactory pizzaFactory=createPizza("roco");

        Pizza pizza=pizzaFactory.createPizza();

        pizza.typePizza();


    }
    static PizzaFactory createPizza(String pizzaType)
    {
       if(pizzaType.equalsIgnoreCase("Andy"))
       {
           return new PizzaFactoryAndy();

       }
       else if(pizzaType.equalsIgnoreCase("Roco"))
       {
           return new PizzaFactoryRoco();
       }
       else{
            throw new RuntimeException(pizzaType+"nu e clar de care pizza vrei");
       }
    }

}
