package factory.material_factory;

import factory.pizza_material.PizzaMaterial;

public class ChicagoMaterialFactory implements MaterialFactory {
    @Override
    public PizzaMaterial prepareMaterial() {
        PizzaMaterial pm = new PizzaMaterial();
        pm.flour = "芝加哥老面粉";
        pm.cheese = "芝加哥好奶酪";
        pm.milk  = "拉斯维加斯好牛奶";

        return pm;
    }
}
