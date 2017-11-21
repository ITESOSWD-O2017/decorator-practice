package com.iteso.memberships;

import com.iteso.Membership;
import com.iteso.benefits.HD;
import com.iteso.benefits.Pantalla1;
import com.iteso.benefits.SD;

/**
 * PantallaHD1.
 */
public class PantallaHD1 extends Membership {

    /**
     * Constructor.
     */
    public PantallaHD1() {
        setUser("HD1");
        setBenefit(new Pantalla1());
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
