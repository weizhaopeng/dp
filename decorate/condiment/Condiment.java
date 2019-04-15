package decorate.condiment;
import decorate.beverage.*;

public abstract class Condiment extends Beverage {
    Beverage beverage;

	public abstract String getDescription();

    public double cost() {
        return(beverage.cost()+2);
    }
}


