package com.mycompany.app.beneficios;

import com.mycompany.app.Beneficios;
import com.mycompany.app.Membresia;

public class DispositivosCuatro extends Beneficios {

    Membresia membresia;

    public DispositivosCuatro (Membresia inMembresia) {
        this.membresia = inMembresia;
    }

    public String getDescription() {
        return membresia.getDescription() + ", cuatro dispositivos";
    }

    public double cost() {
        return membresia.cost() + 30.0;
    }
}
