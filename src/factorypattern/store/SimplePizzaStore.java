package factorypattern.store;

import factorypattern.factory.SimplePizzaFactory;
import factorypattern.pizza.Pizza;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class SimplePizzaStore {
    public SimplePizzaFactory simplePizzaFactory;
    public void orderPizza(String type){
        Pizza pizza = simplePizzaFactory.createPizza(type);
        pizza.pizzaProcess();
     }



}
