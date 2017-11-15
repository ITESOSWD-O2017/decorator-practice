package com.iteso.factory.factories;

import com.iteso.factory.Membresia;
import com.iteso.factory.MembresiaStore;
import com.iteso.factory.membresias.*;


public class MembresiaNormalStore extends MembresiaStore {
    @Override
    protected Membresia createMembresiaFactory(String pedido) {
        if (pedido.equals("pollo"))
            return new MembresiaRojoPollo();
        else if (pedido.equals("cachete") )
            return new VIP();
        else if (pedido.equals("oreja"))
            return new TresD();
        else if (pedido.equals("pierna") )
            return new CuatroD();
        else if (pedido.equals("trompa"))
            return new MembresiaRojoTrompa();
        else return null;


    }
}
