package com.mycompany.app.factories;

import com.mycompany.app.MemberStore;
import com.mycompany.app.Membership;
import com.mycompany.app.benefits.Boletos2x1;
import com.mycompany.app.benefits.CortesiaNormal;
import com.mycompany.app.memberships.Fan;

/**
 *
 */
public class FanFactory extends MemberStore {
    /**
     *
     * @return la membresia Fan ya creada.
     */
    @Override
    protected final Membership createMemFactory() {
        Membership mem = new Fan();
        mem = new Boletos2x1(mem);
        mem = new CortesiaNormal(mem);
        return mem;
    }
}
