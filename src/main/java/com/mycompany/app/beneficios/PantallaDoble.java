package com.mycompany.app.beneficios;

import com.mycompany.app.Beneficios;
import com.mycompany.app.Membresia;

public class PantallaDoble extends Beneficios {

    Membresia membresia;

    public PantallaDoble (Membresia inMembresia) {
        this.membresia = inMembresia;
    }

    public String getDescription() {
        return membresia.getDescription() + ", pantalla doble";
    }

    public double cost() {
        return membresia.cost() + 20.0;
    }
}
