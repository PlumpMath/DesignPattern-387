package FactoryPattern.Factory;

/**
 * Created by pengshuang on 16/11/25.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.createPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        Pizza pizza1 = chicagoStore.createPizza("cheese");
        System.out.println("Joe1 ordered a " + pizza1.getName() + "\n");
    }
}
