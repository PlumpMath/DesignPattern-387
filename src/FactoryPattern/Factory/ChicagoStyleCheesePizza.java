package FactoryPattern.Factory;

/**
 * Created by pengshuang on 16/11/25.
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Plum Tomato Cheese");
    }
}
