package com.iteso.benefits;

import com.iteso.memberships.Benefits;

/**
 * Pantalla2.
 */
public class Pantalla2 extends Benefits {

    /**
     * Constructor.
     */
    public Pantalla2() {
        setBenefit("Capacidad para 2 dispositivos a la vez");
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
