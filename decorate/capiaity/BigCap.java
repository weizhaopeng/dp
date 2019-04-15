package decorate.capiaity;

import decorate.beverage.Beverage;

public class BigCap extends Capiaity {
	public BigCap(Beverage b) {
		this.beverage = b;
	}
	BigCap(Beverage b, int cupSizeIn) {
		this.beverage = b;
		this.cupSize = cupSizeIn;
	}

	public String getDescription() {
		return(beverage.getDescription()+", big cap");
	}
}
