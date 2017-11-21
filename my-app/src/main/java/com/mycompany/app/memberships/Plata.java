package com.mycompany.app.memberships;

import com.mycompany.app.Membership;

/**
 *
 */
public class Plata extends Membership {
    /**
     *  costo de membresía.
     */
    static final double COST = 150.00;
    /**
     * Constructor.
     */
    public Plata() {
        this.setMembership("Membresía Plata");
    }

    /**
     *
     * @return regresa la descripcion.
     */
    @Override
    public final String getDescription() {
        return "Membresía Cinepolis Plata ";
    }

    /**
     *
     * @return regresa el costro de la mebresia
     */
    @Override
    public final double cost() {
        return COST;
    }
}
