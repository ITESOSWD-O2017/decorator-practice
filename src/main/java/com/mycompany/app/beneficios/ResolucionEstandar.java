package com.mycompany.app.beneficios;

import com.mycompany.app.Beneficios;
import com.mycompany.app.Membresia;

/**
 * Resolucion estandar.
 */
public class ResolucionEstandar extends Beneficios {

    /**
     * Constante costo.
     */
    private static final int COST = 10;

    /**
     * Atributo membresia.
     */
    private Membresia membresia;

    /**
     * Constructor default.
     * @param inMembresia membresia.
     */
    public ResolucionEstandar(final Membresia inMembresia) {
        this.membresia = inMembresia;
    }

    /**
     * Getter description.
     * @return descripcion.
     */
    public final String getDescription() {
        return membresia.getDescription() + ", resolucion estándar";
    }

    /**
     * Cosot.
     * @return costo.
     */
    public final double cost() {
        return membresia.cost() + COST;
    }
}
