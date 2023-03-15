package factorypattern;


import factorypattern.factory.SimplePizzaFactory;
import factorypattern.store.SimplePizzaStore;

/*
    Remember, our
    first principle deals with change and guides us to identify the
    aspects that vary and separate them from what stays the same.


 */
public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        SimplePizzaStore simplePizzaStore = new SimplePizzaStore(simplePizzaFactory);
        simplePizzaStore.orderPizza("cheese");


    }
}
