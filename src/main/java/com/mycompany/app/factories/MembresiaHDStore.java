package com.mycompany.app.factories;

import com.mycompany.app.Membresia;
import com.mycompany.app.MembresiaHD;
import com.mycompany.app.MembresiaStore;
import com.mycompany.app.beneficios.*;

public class MembresiaHDStore extends MembresiaStore {
    public Membresia createMembership(String benefit) {

        if(benefit.equals("una pantalla")) {
            return new PantallaUnica(new MembresiaHD());
        } else if(benefit.equals("dos pantallas")) {
            return new PantallaDoble(new MembresiaHD());
        } else if(benefit.equals("cuatro pantallas")) {
            return new PantallaCuadruple(new MembresiaHD());
        } else if(benefit.equals("resolucion estandar")){
            return new ResolucionEstandar(new MembresiaHD());
        } else if(benefit.equals("resolucion HD")){
            return new ResolucionHD(new MembresiaHD());
        } else if(benefit.equals("resolucion ultra")) {
            return new ResolucionUltra(new MembresiaHD());
        } else if(benefit.equals("dos dispositivos")) {
            return new DispositivosDos(new MembresiaHD());
        } else if(benefit.equals("cuatro dispositivos")) {
            return new DispositivosCuatro(new MembresiaHD());
        } else {
            return null;
        }

    }
}
