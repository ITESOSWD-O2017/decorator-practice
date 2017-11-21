package com.mycompany.app.benefits;

import com.mycompany.app.Benefits;
import com.mycompany.app.Membership;

/**
 *
 */
public class CortesiaNormal extends Benefits {
    /**
     * Membresia para regresar.
     */
    private Membership membership;
    /**
     *
     * @param membership1 es la membresía a quien se va a decorar.
     */
    public CortesiaNormal(final Membership membership1) {
        this.membership = membership1;
    }
    /**
     *
     * @return descripcion.
     */
    @Override
    public final String getDescription() {
        return membership.getDescription()
                + "ademas de 2 boletos gratis cada mes "
                + "para peliculas normales ";
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
