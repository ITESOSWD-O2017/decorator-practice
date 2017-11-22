package com.mycompany.app;

/**
 * Membresia estandar.
 */
public class MembresiaEstandar extends Membresia {

    /**
     * Constante costo.
     */
    private static final int COST = 109;

    /**
     * Constructor default.
     */
    public MembresiaEstandar() {
        setDescription("Membresía estándar");
    }

    /**
     * Costo de la membresia estandar.
     * @return double costo.
     */
    public final double cost() {
        return COST;
    }
}
