package factory.pizza_store;

import factory.material_factory.MaterialFactory;
import factory.pizza.BeefPizza;
import factory.pizza.CheesePizza;
import factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    public ChicagoPizzaStore(MaterialFactory mfIn) {
        this.mf = mfIn;
    }

    @Override
    Pizza createPizza(int pizzaType) {
        Pizza ret;

        switch (pizzaType) {
            case 1:
                ret = new CheesePizza();
                break;
            case 2:
                ret = new BeefPizza();
                break;

            default:
                ret = new CheesePizza();
                break;
        }
        ret.pm = mf.prepareMaterial();
        return ret;
    }
}
