package decoratorpattern;

import decoratorpattern.coffee.Beverage;
import decoratorpattern.coffee.Espresso;
import decoratorpattern.coffee.HouseBlend;
import decoratorpattern.decarator.Mocha;
import decoratorpattern.decarator.Soy;
import decoratorpattern.decarator.Whip;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Medetbucks");
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.cost()+" "+ beverage.getDescription());
        System.out.println("*************************");
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Soy(beverage1);
        System.out.println( beverage1.getDescription()+" "+beverage1.cost()+" ");

    }
}
