package com.iteso.memberships;

import com.iteso.Membership;
import com.iteso.benefits.Pantalla1;
import com.iteso.benefits.SD;

/**
 * PantallasHD4.
 */
public class PantallaSD1 extends Membership {

    /**
     * Constructor.
     */
    public PantallaSD1() {
        setUser("SD1");
        setBenefit(new Pantalla1());
        setBenefit(new SD());
    }

    /**
     * getCharacteristics.
     * @return retorna las características.
     */
    public final String getCharacteristics() {
        return "Tipo de usuario: " + getUser();
    }

}
