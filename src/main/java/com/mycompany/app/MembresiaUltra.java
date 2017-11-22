package com.mycompany.app;

/**
 * Membresia ultra.
 */
public class MembresiaUltra extends Membresia {

    /**
     * Constante costo.
     */
    private static final int COST = 0;

    /**
     * Constructor default.
     */
    public MembresiaUltra() {
        setDescription("Membresía ultra");
    }

    /**
     * Costo de membresia.
     * @return double costo 199.
     */
    public final double cost() {
        return COST;
    }
}
