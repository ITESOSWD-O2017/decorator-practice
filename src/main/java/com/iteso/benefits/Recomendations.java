package com.iteso.benefits;

import com.iteso.memberships.Benefits;
/**
 * Recomendations.
 */
public class Recomendations extends Benefits {

    /**
     * Constructor.
     */
    public Recomendations() {
        setBenefit("Netflix otorga recomendaciones");
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
