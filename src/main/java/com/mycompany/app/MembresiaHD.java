package com.mycompany.app;

/**
 * Membresia HD.
 */
public class MembresiaHD extends Membresia {

    /**
     * Constante costo.
     */
    private static final int COST = 129;

    /**
     * Constructor default.
     */
    public MembresiaHD() {
        setDescription("Membresía HD");
    }

    /**
     * Costo de la membresia HD.
     * @return double Costo 129.
     */
    public final double cost() {
        return COST;
    }
}
