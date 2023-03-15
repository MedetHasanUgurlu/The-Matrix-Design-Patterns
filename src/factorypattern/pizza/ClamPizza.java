package factorypattern.pizza;

public class ClamPizza extends Pizza{
    public ClamPizza() {
        super.setName("Claim Pizza");
    }

    @Override
    public void pizzaProcess() {
        System.out.println(super.getName()+" is reading...");
    }
}
