package com.iteso.benefits;

import com.iteso.memberships.Benefits;

/**
 * Pantalla1.
 */
public class Pantalla1 extends Benefits {

    /**
     * Constructor.
     */
    public Pantalla1() {
        setBenefit("Capacidad para 1 dispositivo a la vez");
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
