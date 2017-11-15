package com.iteso.factory.factories;

import com.iteso.factory.Membresia;
import com.iteso.factory.MembresiaStore;
import com.iteso.factory.membresias.*;




public class MembresiaDulceriaStore extends MembresiaStore {
    @Override
    protected Membresia createMembresiaFactory(String pedido) {
        if (pedido.equals("oreja"))
            return new TresD();
        else if (pedido.equals("pierna") )
            return new CuatroD();
        else if (pedido.equals("trompa"))
            return new MembresiaRojoTrompa();
        else return null;


    }
}
