package decorate.condiment;

import decorate.beverage.Beverage;

public class BuDing extends Condiment {
    BuDing(Beverage b) {
        this.beverage = b;
    }

	public String getDescription() {
		return(beverage.getDescription()+", +buding");
	}
}
