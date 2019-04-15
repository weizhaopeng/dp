package decorate.beverage;

public class Coffee extends Beverage {
	public Coffee() {
		this.price = 10;
		this.description = "coffee:";
	}
	Coffee(double priceIn) {
		this.price = priceIn;
		this.description = "coffee:";
	}

	public double cost() {
		return this.price;
	}
}
