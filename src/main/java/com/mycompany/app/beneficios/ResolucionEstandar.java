package com.mycompany.app.beneficios;

import com.mycompany.app.Beneficios;
import com.mycompany.app.Membresia;

public class ResolucionEstandar extends Beneficios {

    Membresia membresia;

    public ResolucionEstandar (Membresia inMembresia) {
        this.membresia = inMembresia;
    }

    public String getDescription() {
        return membresia.getDescription() + ", resolucion estándar";
    }

    public double cost() {
        return membresia.cost() + 10.0;
    }
}
