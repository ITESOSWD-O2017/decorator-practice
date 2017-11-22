package com.mycompany.app.beneficios;

import com.mycompany.app.Beneficios;
import com.mycompany.app.Membresia;

/**
 * Resolucion HD.
 */
public class ResolucionHD extends Beneficios {

    /**
     * Constante costo.
     */
    private static final int COST = 20;

    /**
     * Atributo membresia.
     */
    private Membresia membresia;

    /**
     * Constructor default.
     * @param inMembresia membresia.
     */
    public ResolucionHD(final Membresia inMembresia) {
        this.membresia = inMembresia;
    }

    /**
     * Getter descripcion.
     * @return descripcion.
     */
    public final String getDescription() {
        return membresia.getDescription() + ", resolucion HD";
    }

    /**
     * Cosot.
     * @return costo.
     */
    public final double cost() {
        return membresia.cost() + COST;
    }
}
