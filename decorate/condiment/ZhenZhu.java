package decorate.condiment;

import decorate.beverage.Beverage;

public class ZhenZhu extends Condiment {
    ZhenZhu(Beverage b) {
        this.beverage = b;
    }

	public String getDescription() {
		return(beverage.getDescription()+", +zhenzhu");
	}
}
