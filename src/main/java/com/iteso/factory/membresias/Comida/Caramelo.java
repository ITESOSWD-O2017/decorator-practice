package com.iteso.factory.membresias.Comida;

import com.iteso.factory.Membresia;
import com.iteso.factory.membresias.Dulceria;

public class Caramelo extends Dulceria {
    public Caramelo() {
        name = "Palomitas acarameladas";
        broth = "Caldo Rojo";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}