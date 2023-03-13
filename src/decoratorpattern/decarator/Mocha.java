package decoratorpattern.decarator;

import decoratorpattern.coffee.Beverage;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+ 0.2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha ";
    }
}
