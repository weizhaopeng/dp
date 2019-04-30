package factory.pizza_store;

import factory.material_factory.MaterialFactory;
import factory.pizza.BeefPizza;
import factory.pizza.CheesePizza;
import factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    public NYPizzaStore(MaterialFactory mfIn) {
        this.mf = mfIn;
    }

    @Override
    Pizza createPizza(int pizzaType) {
        Pizza ret;

        switch (pizzaType) {
            case 1:
                ret = new BeefPizza();
                break;
            case 2:
                ret = new CheesePizza();
                break;

                default:
                    ret = new BeefPizza();
                    break;
        }
        ret.pm = mf.prepareMaterial();
        return ret;
    }
}
