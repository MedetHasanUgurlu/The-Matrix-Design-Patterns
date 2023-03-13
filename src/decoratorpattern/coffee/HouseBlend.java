package decoratorpattern.coffee;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        super.setDescription("House Blend: ");
    }

    @Override
    public double cost() {
        return 3;
    }
}
