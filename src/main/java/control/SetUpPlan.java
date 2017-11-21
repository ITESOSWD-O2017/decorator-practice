package control;

import beneficios.CanalesKids;
import tiposmembresia.MemPlatinum;
import tiposmembresia.Membresia;
import factories.AmericaStore;
import factories.MxStore;
/**
 *
 */
public final class SetUpPlan {
    /**
     *
     */
    private SetUpPlan() {  }
    /**
     *
     * @param args This is a parameter
     */
    public static void main(final String[] args) {
        Membresia membresia = new MemPlatinum();
        System.out.println(membresia.description);
        membresia = new CanalesKids(membresia);
        System.out.println(membresia.getDescription());
        AmericaStore store = new AmericaStore();
        Membresia m2 = new MemPlatinum();
        m2 = store.createMemFactory(m2);
        System.out.println(m2.getDescription());
        MxStore tienda = new MxStore();
        m2 = new MemPlatinum();
        m2 = tienda.createMemFactory(m2);
        System.out.println(m2.getDescription());
    }
}
