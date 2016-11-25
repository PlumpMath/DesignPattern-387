package DecoratorPattern;

/**
 * Created by pengshuang on 16/11/24.
 */
public class Espresso extends Beverage{

        public Espresso() {
            description = "Espresso";
        }

        public double cost() {
            return 1.99;
        }
}

