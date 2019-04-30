package factory.pizza;

import factory.pizza_material.PizzaMaterial;

public abstract class Pizza {
    public PizzaMaterial pm;
    public String name;

    public void printDetail() {
        System.out.println(this.name+"完成");
    }
}
