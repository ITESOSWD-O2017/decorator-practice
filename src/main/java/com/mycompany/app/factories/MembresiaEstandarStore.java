package com.mycompany.app.factories;

import com.mycompany.app.Membresia;
import com.mycompany.app.MembresiaEstandar;
import com.mycompany.app.MembresiaStore;
import com.mycompany.app.beneficios.*;

public class MembresiaEstandarStore extends MembresiaStore {

    public Membresia createMembership(String benefit) {

        if(benefit.equals("una pantalla")) {
            return new PantallaUnica(new MembresiaEstandar());
        } else if(benefit.equals("dos pantallas")) {
            return new PantallaDoble(new MembresiaEstandar());
        } else if(benefit.equals("cuatro pantallas")) {
            return new PantallaCuadruple(new MembresiaEstandar());
        } else if(benefit.equals("resolucion estandar")){
            return new ResolucionEstandar(new MembresiaEstandar());
        } else if(benefit.equals("resolucion HD")){
            return new ResolucionHD(new MembresiaEstandar());
        } else if(benefit.equals("resolucion ultra")) {
            return new ResolucionUltra(new MembresiaEstandar());
        } else if(benefit.equals("dos dispositivos")) {
            return new DispositivosDos(new MembresiaEstandar());
        } else if(benefit.equals("cuatro dispositivos")) {
            return new DispositivosCuatro(new MembresiaEstandar());
        } else {
            return null;
        }

    }

}
