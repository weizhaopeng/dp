package factory.material_factory;

import factory.pizza_material.PizzaMaterial;

public class NYMaterialFactory implements MaterialFactory {
    @Override
    public PizzaMaterial prepareMaterial() {
        PizzaMaterial pm = new PizzaMaterial();
        pm.flour = "纽约乡村面粉";
        pm.cheese = "芝加哥奶酪";
        pm.milk = "费城牛奶";

        return pm;
    }
}
