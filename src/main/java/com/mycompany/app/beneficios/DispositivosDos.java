package com.mycompany.app.beneficios;

import com.mycompany.app.Beneficios;
import com.mycompany.app.Membresia;

/**
 * Dos dispositivos.
 */
public class DispositivosDos extends Beneficios {

    /**
     * Constante costo añadido.
     */
    private static final int COST = 20;

    /**
     * Atributo membresia.
     */
    private Membresia membresia;

    /**
     * Constructor default.
     * @param inMembresia Crea una membresia.
     */
    public DispositivosDos(final Membresia inMembresia) {
        this.membresia = inMembresia;
    }

    /**
     * Getter descripcion.
     * @return String Descripcion.
     */
    public final String getDescription() {
        return membresia.getDescription() + ", dos dispositivos";
    }

    /**
     * Costo añadido.
     * @return double costo.
     */
    public final double cost() {
        return membresia.cost() + COST;
    }
}
