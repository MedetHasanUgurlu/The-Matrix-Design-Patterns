package factorypattern.pizza;

public class VeggiePizza extends Pizza{
    public VeggiePizza() {
        super.setName("Veggie Pizza");
    }

    @Override
    public void pizzaProcess() {
        System.out.println(super.getName()+" is reading...");
    }
}
