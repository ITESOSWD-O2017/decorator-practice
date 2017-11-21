package com.mycompany.app.benefits;

import com.mycompany.app.Benefits;
import com.mycompany.app.Membership;

/**
 *
 */
public class Nachos2x1 extends Benefits {
    /**
     * Membresia para regresar.
     */
    private Membership membership;
    /**
     *
     * @param membership1 es la membresía a quien se va a decorar.
     */
    public Nachos2x1(final Membership membership1) {
        this.membership = membership1;
    }
    /**
     *
     * @return descripcion.
     */
    @Override
    public final String getDescription() {
        return membership.getDescription()
                + "nachos 2x1 todos los días ";
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
