package com.iteso.benefits;

import com.iteso.memberships.Benefits;

/**
 * HD.
 */
public class HD extends Benefits {

    /**
     * Constructor.
     */
    public HD() {
        setBenefit("Pantallas Calidad HD");
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
