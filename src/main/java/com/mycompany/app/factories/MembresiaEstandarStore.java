package com.mycompany.app.factories;

import com.mycompany.app.Membresia;
import com.mycompany.app.MembresiaEstandar;
import com.mycompany.app.MembresiaStore;
import com.mycompany.app.beneficios.PantallaCuadruple;
import com.mycompany.app.beneficios.PantallaDoble;
import com.mycompany.app.beneficios.PantallaUnica;
import com.mycompany.app.beneficios.ResolucionEstandar;
import com.mycompany.app.beneficios.ResolucionHD;
import com.mycompany.app.beneficios.ResolucionUltra;
import com.mycompany.app.beneficios.DispositivosDos;
import com.mycompany.app.beneficios.DispositivosCuatro;

/**
 * Membresia estandar factory.
 */
public class MembresiaEstandarStore extends MembresiaStore {

    /**
     * Creador de membresia.
     * @param benefit Parametro creador.
     * @return membresia nueva.
     */
    public final Membresia createMembership(final String benefit) {

        if (benefit.equals("una pantalla")) {
            return new PantallaUnica(new MembresiaEstandar());
        } else if (benefit.equals("dos pantallas")) {
            return new PantallaDoble(new MembresiaEstandar());
        } else if (benefit.equals("cuatro pantallas")) {
            return new PantallaCuadruple(new MembresiaEstandar());
        } else if (benefit.equals("resolucion estandar")) {
            return new ResolucionEstandar(new MembresiaEstandar());
        } else if (benefit.equals("resolucion HD")) {
            return new ResolucionHD(new MembresiaEstandar());
        } else if (benefit.equals("resolucion ultra")) {
            return new ResolucionUltra(new MembresiaEstandar());
        } else if (benefit.equals("dos dispositivos")) {
            return new DispositivosDos(new MembresiaEstandar());
        } else if (benefit.equals("cuatro dispositivos")) {
            return new DispositivosCuatro(new MembresiaEstandar());
        } else {
            return null;
        }

    }

}
