package decorate.beverage;

public abstract class Beverage {

	String description = "beverage";
	double price = 0;

	public String getDescription() {
		return this.description;
	}

	public abstract double cost();
}

