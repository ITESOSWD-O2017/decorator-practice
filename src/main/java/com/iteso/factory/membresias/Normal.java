package com.iteso.factory.membresias;

import com.iteso.factory.Membresia;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Normal extends Membresia {
    public Normal(){
        name = "Membresia normal para salas de cine";
        broth = "Caldo Verde";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");

    }
}
