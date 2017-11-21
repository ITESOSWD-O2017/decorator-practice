package com.mycompany.app.benefits;

import com.mycompany.app.Benefits;
import com.mycompany.app.Membership;

/**
 *
 */
public class PasePreferencial extends Benefits {
    /**
     * Costo del pase preferencial.
     */
    static final double ADD = 15.00;
    /**
     * Membresia para regresar.
     */
    private Membership membership;
    /**
     *
     * @param membership1 es la membresía a quien se va a decorar.
     */
    public PasePreferencial(final Membership membership1) {
        this.membership = membership1;
    }
    /**
     *
     * @return descripcion.
     */
    @Override
    public final String getDescription() {
        return membership.getDescription()
                + "fila especial, con pase rapido a dulcerías ";
    }

    /**
     *
     * @return costo.
     */
    @Override
    public final double cost() {
        return membership.cost() + ADD;
    }
}
