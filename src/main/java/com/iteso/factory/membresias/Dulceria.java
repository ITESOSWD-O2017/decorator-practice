package com.iteso.factory.membresias;

import com.iteso.factory.Membresia;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dulceria extends Membresia {
    public Dulceria(){
        name = "Membresia para dulceria";
        broth = "Caldo Verde";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");

    }
}
