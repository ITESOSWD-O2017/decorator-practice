package com.iteso.benefits;

import com.iteso.memberships.Benefits;

/**
 * SD.
 */
public class SD extends Benefits {

    /**
     * Constructor.
     */
    public SD() {
        setBenefit("Pantallas Calidad Normal");
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
