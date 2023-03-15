package factorypattern.pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        super.setName("Cheese Pizza");
    }

    @Override
    public void pizzaProcess() {
        System.out.println(super.getName()+" is reading...");
    }
}
