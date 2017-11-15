package com.iteso.factory.membresias.Comida;

import com.iteso.factory.Membresia;
import com.iteso.factory.membresias.Dulceria;

public class Refresco extends Membresia {
    public Refresco() {
        name = "Refresco";
        broth = "Caldo Rojo";
        toppings.add("Sabor Cola");
        toppings.add("Sabor naranja");
        toppings.add("Sabor lima limon");
        toppings.add("Manzana");
        toppings.add("Light");
    }
}