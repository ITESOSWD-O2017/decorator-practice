package com.mycompany.app.beneficios;

import com.mycompany.app.Beneficios;
import com.mycompany.app.Membresia;

/**
 * Resolucion ultra.
 */
public class ResolucionUltra extends Beneficios {

    /**
     * Constante costo.
     */
    private static final int COST = 30;

    /**
     * Atributo membresia.
     */
    private Membresia membresia;

    /**
     * Constructor default.
     * @param inMembresia membresia.
     */
    public ResolucionUltra(final Membresia inMembresia) {
        this.membresia = inMembresia;
    }

    /**
     * Getter descripcion.
     * @return descripcion.
     */
    public final String getDescription() {
        return membresia.getDescription() + ", resolucion ultra";
    }

    /**
     * Costo.
     * @return cost.
     */
    public final double cost() {
        return membresia.cost() + COST;
    }
}
