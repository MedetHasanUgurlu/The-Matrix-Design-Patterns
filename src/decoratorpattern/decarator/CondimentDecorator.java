package decoratorpattern.decarator;

import decoratorpattern.coffee.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
