package com.iteso.factory.membresias.Comida;

import com.iteso.factory.membresias.Dulceria;

public class Frappe extends Dulceria {
    public Frappe() {
        name = "Hielo triturado";
        broth = "Icee";
        toppings.add("Sabor cafe");
        toppings.add("fresa");
        toppings.add("frutos azules");
        toppings.add("frutos rojos");
        toppings.add("Limon");
    }
}