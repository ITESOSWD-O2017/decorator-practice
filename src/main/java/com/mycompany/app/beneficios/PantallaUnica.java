package com.mycompany.app.beneficios;

import com.mycompany.app.Beneficios;
import com.mycompany.app.Membresia;

/**
 * Una pantalla.
 */
public class PantallaUnica extends Beneficios {

    /**
     * Constante costo añadido.
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
    public PantallaUnica(final Membresia inMembresia) {
        this.membresia = inMembresia;
    }

    /**
     * Getter descripcion.
     * @return String Descripccion.
     */
    public final String getDescription() {
        return membresia.getDescription() + ", pantalla unica";
    }

    /**
     * Costo.
     * @return double costo.
     */
    public final double cost() {
        return membresia.cost() + COST;
    }
}
