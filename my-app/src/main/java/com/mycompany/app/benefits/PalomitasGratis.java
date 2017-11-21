package com.mycompany.app.benefits;

import com.mycompany.app.Benefits;
import com.mycompany.app.Membership;

/**
 *
 */
public class PalomitasGratis extends Benefits {
    /**
     * Membresia para regresar.
     */
    private Membership membership;
    /**
     *
     * @param membership1 es la membresía a quien se va a decorar.
     */
    public PalomitasGratis(final Membership membership1) {
        this.membership = membership1;
    }
    /**
     *
     * @return descripcion.
     */
    @Override
    public final String getDescription() {
        return membership.getDescription()
                + "con una cortesía cada mes de palomitas grandes ";
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
