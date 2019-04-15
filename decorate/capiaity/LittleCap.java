package decorate.capiaity;

import decorate.beverage.Beverage;

public class LittleCap extends Capiaity {
	LittleCap(Beverage b) {
		this.beverage = b;
	}
	LittleCap(Beverage b, int cupSizeIn) {
		this.beverage = b;
		this.cupSize = cupSizeIn;
	}

	public String getDescription() {
		return(beverage.getDescription()+", little cap");
	}
}
