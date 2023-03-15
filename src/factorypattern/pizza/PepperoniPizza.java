package factorypattern.pizza;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        super.setName("Pepperoni Pizza");
    }

    @Override
    public void pizzaProcess() {
        System.out.println(super.getName()+" is reading...");
    }
}
