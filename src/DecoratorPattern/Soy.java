package DecoratorPattern;

/**
 * Created by pengshuang on 16/11/25.
 */
public class Soy extends CondimentDecorator{

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Beverage.TALL){
            cost += 0.10;
        }
        else if (getSize() == Beverage.GRANDE){
            cost += 0.15;
        }
        else if(getSize() == Beverage.VENTI){
            cost += 0.20;
        }
        return cost;
    }
}
