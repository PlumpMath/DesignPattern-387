package FactoryPattern.Factory;

/**
 * Created by pengshuang on 16/11/25.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else return null;
    }
}
