package com.mycompany.app;

/**
 * Membresia gratis.
 */
public class MembresiaGratis extends Membresia {

    /**
     * Constante costo.
     */
    private static final int COST = 0;

    /**
     * Constructor default.
     */
    public MembresiaGratis() {
        setDescription("Membresia gratis");
    }

    /**
     * Costo de la membresia gratis.
     * @return double Costo 0.
     */
    public final double cost() {
        return COST;
    }

}
