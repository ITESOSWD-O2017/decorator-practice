package com.iteso.benefits;

import com.iteso.memberships.Benefits;

/**
 * NoRegionBlocker.
 */
public class NoRegionBlocker extends Benefits {

    /**
     * Constructor.
     */
    public NoRegionBlocker() {
        setBenefit("Sin bloqueo de región");
    }

    /**
     * Obtiene características.
     * @return devulve todas las características en un string.
     */
    public final String getCharacteristics() {
        return "Tipo de usuario: " + getUser()
                +
                ", Tipo de beneficio:" + getBenefit();
    }

}
