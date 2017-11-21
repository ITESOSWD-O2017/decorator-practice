package com.mycompany.app.beneficios;

import com.mycompany.app.Beneficios;
import com.mycompany.app.Membresia;

public class PantallaCuadruple extends Beneficios {

    Membresia membresia;

    public PantallaCuadruple (Membresia inMembresia) {
        this.membresia = inMembresia;
    }

    public String getDescription() {
        return membresia.getDescription() + ", pantalla cuádruple";
    }

    public double cost() {
        return membresia.cost() + 30.0;
    }
}
