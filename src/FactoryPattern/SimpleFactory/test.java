package FactoryPattern.SimpleFactory;

/**
 * Created by pengshuang on 16/11/25.
 */
public class test {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza("cheese");
    }
}
