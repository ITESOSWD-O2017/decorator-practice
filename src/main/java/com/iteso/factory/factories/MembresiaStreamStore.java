package com.iteso.factory.factories;
import com.iteso.factory.Membresia;
import com.iteso.factory.MembresiaStore;
import com.iteso.factory.membresias.*;

public class MembresiaStreamStore extends MembresiaStore {

    @Override
    protected Membresia createMembresiaFactory(String pedido) {
        if (pedido.equals("pollo"))
            return new Juegos();
        else if (pedido.equals("cachete") )
            return new VIP();
        else if (pedido.equals("oreja"))
            return new Stream();
        else if (pedido.equals("pierna") )
            return new Dulceria();
        else if (pedido.equals("trompa"))
            return new Normal();
        else if(pedido.equals("camaron"))
            return new TresD();
        else return null;

    }
}

