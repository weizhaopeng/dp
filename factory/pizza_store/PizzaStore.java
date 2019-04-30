package factory.pizza_store;

import factory.material_factory.MaterialFactory;
import factory.pizza.Pizza;
import factory.pizza_material.PizzaMaterial;

public abstract class PizzaStore {
    MaterialFactory mf;

    abstract Pizza createPizza(int pizzaType);

    public void setMaterialFactory(MaterialFactory mfIn) {
        this.mf = mfIn;
    }

    public Pizza orderPizza(int pizzaType) {
        PizzaMaterial pm = this.mf.prepareMaterial();
        System.out.println(pm.toString());
        return (this.createPizza(pizzaType));
    }
}
