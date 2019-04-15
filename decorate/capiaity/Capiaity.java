package decorate.capiaity;
import decorate.beverage.*;

public abstract class Capiaity extends Beverage {
	Beverage beverage;
	float cupSize = 1;

	public abstract String getDescription();

	public double cost() {
		return(beverage.cost()*this.cupSize);
	}
}



