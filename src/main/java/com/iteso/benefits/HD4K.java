package com.iteso.benefits;

import com.iteso.memberships.Benefits;

/**
 * HD4K.
 */
public class HD4K extends Benefits {

    /**
     * Constructor.
     */
    public HD4K() {
        setBenefit("Pantallas Calidad 4K");
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
