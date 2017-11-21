package com.iteso.memberships;

import com.iteso.Membership;
import com.iteso.benefits.HD;
import com.iteso.benefits.Pantalla2;
import com.iteso.benefits.SD;

/**
 * PantallasHD2.
 */
public class PantallasHD2 extends Membership {

    /**
     * Constructor.
     */
    public PantallasHD2() {
        setUser("HD2");
        setBenefit(new Pantalla2());
        setBenefit(new SD());
        setBenefit(new HD());
    }

    /**
     * getCharacteristics.
     * @return retorna las características.
     */
    public final String getCharacteristics() {
        return "Tipo de usuario: " + getUser();
    }

}
