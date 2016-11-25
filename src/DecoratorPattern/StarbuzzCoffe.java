package DecoratorPattern;

/**
 * Created by pengshuang on 16/11/24.
 */
public class StarbuzzCoffe {

    public static void main(String args[]) {
        Beverage beverge = new Espresso();
        System.out.println(beverge.getDescription() + " $" + beverge.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new Espresso();
        beverage3.setSize(Beverage.TALL);
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

    }
}
