package decoratorpattern.decarator;

import decoratorpattern.coffee.Beverage;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost()+0.4;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }
}
