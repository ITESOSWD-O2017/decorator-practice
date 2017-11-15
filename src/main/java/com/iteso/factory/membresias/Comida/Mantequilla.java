package com.iteso.factory.membresias.Comida;

import com.iteso.factory.membresias.Dulceria;

public class Mantequilla extends Dulceria {
    public Mantequilla() {
        name = "Palomitas de mantequilla";
        broth = "Caldo Rojo";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}