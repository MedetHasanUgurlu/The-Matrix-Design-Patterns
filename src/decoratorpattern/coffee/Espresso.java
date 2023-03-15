package decoratorpattern.coffee;



public class Espresso extends Beverage {

    public Espresso() {
        super.setDescription("e");
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
