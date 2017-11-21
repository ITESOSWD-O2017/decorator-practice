package com.mycompany.app.benefits;

import com.mycompany.app.Benefits;
import com.mycompany.app.Membership;

/**
 *
 */
public class ComboGratis extends Benefits {
    /**
     * Membresia para regresar.
     */
    private Membership membership;

    /**
     *
     * @param membership1 es la membresía a quien se va a decorar.
     */
    public ComboGratis(final Membership membership1) {
        this.membership = membership1;
    }

    /**
     *
     * @return descripcion.
     */
    @Override
    public final String getDescription() {
        return membership.getDescription()
                + "con una Cortesía de un Combo Cuates Gratis ";
    }

    /**
     *
     * @return costo.
     */
    @Override
    public final double cost() {
        return membership.cost();
    }
}
