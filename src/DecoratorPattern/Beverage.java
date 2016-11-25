package DecoratorPattern;

/**
 * Created by pengshuang on 16/11/24.
 */
public abstract class Beverage {

    static int TALL = 1;
    static int GRANDE = 2;
    static int VENTI = 3;

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
