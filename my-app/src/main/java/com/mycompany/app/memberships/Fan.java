package com.mycompany.app.memberships;

import com.mycompany.app.Membership;

/**
 *
 */
public class Fan extends Membership {
    /**
     *  costo de membresía.
     */
    static final double COST = 50.00;
    /**
     * Constructor.
     */
    public Fan() {
        this.setMembership("Membresía Fan");
    }

    /**
     *
     * @return descripcion.
     */
    @Override
    public final String getDescription() {
        return "Membresía Cinepolis Fan ";
    }

    /**
     *
     * @return costo.
     */
    @Override
    public final double cost() {
        return COST;
    }
}
