package decorate.capiaity;

import decorate.beverage.Beverage;

public class MiddleCap extends Capiaity {
	MiddleCap(Beverage b) {
		this.beverage = b;
	}
	MiddleCap(Beverage b, int cupSizeIn) {
		this.beverage = b;
		this.cupSize = cupSizeIn;
	}

	public String getDescription() {
		return(beverage.getDescription()+", middle cap");
	}
}
