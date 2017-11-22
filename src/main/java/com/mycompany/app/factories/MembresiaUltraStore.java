package com.mycompany.app.factories;

import com.mycompany.app.Membresia;
import com.mycompany.app.MembresiaUltra;
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
 * Membresia ultra factory.
 */
public final class MembresiaUltraStore extends MembresiaStore {

    /**
     * Creadir de membresia.
     * @param benefit Parametro creador.
     * @return membresia nueva.
     */
    public Membresia createMembership(final String benefit) {

        if (benefit.equals("una pantalla")) {
            return new PantallaUnica(new MembresiaUltra());
        } else if (benefit.equals("dos pantallas")) {
            return new PantallaDoble(new MembresiaUltra());
        } else if (benefit.equals("cuatro pantallas")) {
            return new PantallaCuadruple(new MembresiaUltra());
        } else if (benefit.equals("resolucion estandar")) {
            return new ResolucionEstandar(new MembresiaUltra());
        } else if (benefit.equals("resolucion HD")) {
            return new ResolucionHD(new MembresiaUltra());
        } else if (benefit.equals("resolucion ultra")) {
            return new ResolucionUltra(new MembresiaUltra());
        } else if (benefit.equals("dos dispositivos")) {
            return new DispositivosDos(new MembresiaUltra());
        } else if (benefit.equals("cuatro dispositivos")) {
            return new DispositivosCuatro(new MembresiaUltra());
        } else {
            return null;
        }

    }
}
