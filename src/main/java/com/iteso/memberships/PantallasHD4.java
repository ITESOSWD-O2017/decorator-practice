package com.iteso.memberships;

import com.iteso.Membership;
import com.iteso.benefits.HD;
import com.iteso.benefits.Pantalla4;
import com.iteso.benefits.SD;

/**
 * PantallasHD4.
 */
public class PantallasHD4 extends Membership {

    /**
     * Constructor.
     */
    public PantallasHD4() {
        setUser("HD4");
        setBenefit(new Pantalla4());
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
