package com.mycompany.app.beneficios;

import com.mycompany.app.Beneficios;
import com.mycompany.app.Membresia;

/**
 * Dos pantallas.
 */
public class PantallaDoble extends Beneficios {

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
    public PantallaDoble(final Membresia inMembresia) {
        this.membresia = inMembresia;
    }

    /**
     * Getter descripcion.
     * @return Descripcion.
     */
    public final String getDescription() {
        return membresia.getDescription() + ", pantalla doble";
    }

    /**
     * Costo.
     * @return costo.
     */
    public final double cost() {
        return membresia.cost() + COST;
    }
}
