package com.mycompany.app.beneficios;

import com.mycompany.app.Beneficios;
import com.mycompany.app.Membresia;

public class ResolucionHD extends Beneficios {

    Membresia membresia;

    public ResolucionHD (Membresia inMembresia) {
        this.membresia = inMembresia;
    }

    public String getDescription() {
        return membresia.getDescription() + ", resolucion HD";
    }

    public double cost() {
        return membresia.cost() + 20.0;
    }
}
