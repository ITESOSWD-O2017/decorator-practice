package com.mycompany.app.beneficios;

import com.mycompany.app.Beneficios;
import com.mycompany.app.Membresia;

public class DispositivosDos extends Beneficios {

    Membresia membresia;

    public DispositivosDos (Membresia inMembresia) {
        this.membresia = inMembresia;
    }

    public String getDescription() {
        return membresia.getDescription() + ", dos dispositivos";
    }

    public double cost() {
        return membresia.cost() + 20.0;
    }
}
