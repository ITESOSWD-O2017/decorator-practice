package com.mycompany.app;

/**
 * Clase fabrica para crear membresias.
 */
public abstract class MemberStore {
    /**
     *
     * @return una membrecia ya creada con la correcta membresía.
     */
     public final Membership createMembership() {
        Membership mem;

        mem = createMemFactory();
        return mem;
    }

    /**
     *
     * @return la membresía creada con el tipo correcto, es abstracto.
     */
    protected abstract Membership createMemFactory();
}
