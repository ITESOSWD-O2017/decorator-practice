package factories;

import beneficios.CanalesKids;
import beneficios.CanalesNaturales;
import beneficios.CanalesRec;
import beneficios.CanalesLive;
import tiposmembresia.MemBasic;
import tiposmembresia.MemKids;
import tiposmembresia.MemLive;
import tiposmembresia.Membresia;
import tiposmembresia.MemPlatinum;
import beneficios.CanalesHBO;
import beneficios.CanalesTeleExtra;
import beneficios.CanalesCine;
/**
 *
 */
public class UKStore extends MembresiaLocal {
    /**
     *
     * @param membresia This is a parameter
     * @return ok
     */
    public final Membresia createMemFactory(final Membresia membresia) {
        if (membresia.getClass() == MemBasic.class) {
            Membresia temp = membresia;
            temp = new CanalesRec(membresia);
            temp = new CanalesHBO(membresia);
            temp = new CanalesCine(membresia);
            return temp;
        } else if (membresia.getClass() == MemKids.class) {
            Membresia temp = membresia;
            temp = new CanalesKids(membresia);
            temp = new CanalesLive(membresia);
            return temp;
        } else if (membresia.getClass() == MemLive.class) {
            Membresia temp = membresia;
            temp = new CanalesKids(membresia);
            temp = new CanalesTeleExtra(membresia);
            temp = new CanalesLive(membresia);
            return temp;
        } else if (membresia.getClass() == MemPlatinum.class) {
            Membresia temp = membresia;
            temp = new CanalesKids(membresia);
            temp = new CanalesNaturales(membresia);
            temp = new CanalesLive(membresia);
            temp = new CanalesHBO(membresia);
            temp = new CanalesTeleExtra(membresia);
            temp = new CanalesRec(membresia);
            temp = new CanalesCine(membresia);
            return temp;
        } else {
            return null;
        }
    }
}
