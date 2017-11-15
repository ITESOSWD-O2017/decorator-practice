package com.iteso.factory.membresias;
import com.iteso.factory.Membresia;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 9/27/13
 * Time: 7:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class Premium extends Membresia {
    public Premium(){
        name = "Membresia Premium para salas VIP, 3D y 4D";
        broth = "Caldo Rojo";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");

    }

}
