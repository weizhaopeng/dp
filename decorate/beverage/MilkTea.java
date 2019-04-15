package decorate.beverage;

public class MilkTea extends Beverage {
	MilkTea() {
		this.price = 12;
		this.description = "milk tea:";
	}
	MilkTea(double priceIn) {
		this.price = priceIn;
		this.description = "milk tea:";
	}
	public double cost() {
		return this.price;
	}
}
