package DecoratorPattern;

/**
 * Created by pengshuang on 16/11/24.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    public double cost(){
        return 0.89;
    }
}
