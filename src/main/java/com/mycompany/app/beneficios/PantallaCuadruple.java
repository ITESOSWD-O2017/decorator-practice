package com.mycompany.app.beneficios;

import com.mycompany.app.Beneficios;
import com.mycompany.app.Membresia;

/**
 * Cuatro pantallas.
 */
public class PantallaCuadruple extends Beneficios {

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
    public PantallaCuadruple(final Membresia inMembresia) {
        this.membresia = inMembresia;
    }

    /**
     * Getter descripcion.
     * @return descripcion.
     */
    public final String getDescription() {
        return membresia.getDescription() + ", pantalla cuádruple";
    }

    /**
     * Cosot.
     * @return costo.
     */
    public final double cost() {
        return membresia.cost() + COST;
    }
}
