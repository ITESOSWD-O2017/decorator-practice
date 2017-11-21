package com.mycompany.app.beneficios;

import com.mycompany.app.Beneficios;
import com.mycompany.app.Membresia;

public class ResolucionUltra extends Beneficios {

    Membresia membresia;

    public ResolucionUltra (Membresia inMembresia) {
        this.membresia = inMembresia;
    }

    public String getDescription() {
        return membresia.getDescription() + ", resolucion ultra";
    }

    public double cost() {
        return membresia.cost() + 30.0;
    }
}
