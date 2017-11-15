package com.iteso.factory;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/26/13
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class MembresiaStore {
    public Membresia orderMembresia(String normal){
        Membresia membresia;

        membresia = createMembresiaFactory(normal);

        membresia.prepare();
        membresia.serve();

        return membresia;
    }

    protected abstract Membresia createMembresiaFactory(String normal);
}
