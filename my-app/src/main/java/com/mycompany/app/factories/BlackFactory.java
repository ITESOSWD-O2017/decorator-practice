package com.mycompany.app.factories;

import com.mycompany.app.MemberStore;
import com.mycompany.app.Membership;
import com.mycompany.app.benefits.Boletos2x1;
import com.mycompany.app.benefits.Cortesia3D;
import com.mycompany.app.benefits.Nachos2x1;
import com.mycompany.app.memberships.Black;

/**
 *
 */
public class BlackFactory extends MemberStore {
    /**
     *
     * @return la membresia black ya creada.
     */
    @Override
    protected final Membership createMemFactory() {
       Membership mem = new Black();
       mem = new Boletos2x1(mem);
       mem = new Cortesia3D(mem);
       mem = new Nachos2x1(mem);
       return mem;
    }
}
