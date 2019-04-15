package decorate.condiment;

import decorate.beverage.Beverage;

public class YeGuo extends Condiment{
    public YeGuo(Beverage b) {
        this.beverage = b;
    }
	public String getDescription() {
		return(beverage.getDescription()+", +yeguo");
	}
}
