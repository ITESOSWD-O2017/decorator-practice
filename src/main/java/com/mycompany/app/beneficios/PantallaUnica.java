package com.mycompany.app.beneficios;

import com.mycompany.app.Beneficios;
import com.mycompany.app.Membresia;

public class PantallaUnica extends Beneficios {

    Membresia membresia;

    public PantallaUnica (Membresia inMembresia) {
        this.membresia = inMembresia;
    }

    public String getDescription() {
        return membresia.getDescription() + ", pantalla unica";
    }

    public double cost() {
        return membresia.cost() + 10.0;
    }
}
