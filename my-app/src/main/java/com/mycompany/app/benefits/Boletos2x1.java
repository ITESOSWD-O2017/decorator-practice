package com.mycompany.app.benefits;

import com.mycompany.app.Benefits;
import com.mycompany.app.Membership;

/**
 *
 */
public class Boletos2x1 extends Benefits {
    /**
     * Membresia para regresar.
     */
    private Membership membership;

    /**
     *
     * @param membership1 es la membresía a quien se va a decorar.
     */
    public Boletos2x1(final Membership membership1) {
        this.membership = membership1;
    }

    /**
     *
     * @return descripcion.
     */
    @Override
    public final String getDescription() {
        return membership.getDescription()
                + "con boletos 2x1 de lunes a viernes ";
    }

    /**
     *
     * @return costo de la membresía.
     */
    @Override
    public final double cost() {
        return membership.cost();
    }
}
