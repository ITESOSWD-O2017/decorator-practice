package com.iteso.benefits;

import com.iteso.memberships.Benefits;

/**
 * Pantalla4.
 */
public class Pantalla4 extends Benefits {

    /**
     * Constructor.
     */
    public Pantalla4() {
        setBenefit("Capacidad para 4 dispositivos a la vez");
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
