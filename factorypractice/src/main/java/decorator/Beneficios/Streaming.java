
package decorator.Beneficios;

import decorator.BenefitsDecorator;
import decorator.Membresia;

/**
 *
 */
public class Streaming extends BenefitsDecorator {
    /**
     *
     */
    private Membresia membresia;

    /**
     *
     * @return
     */
    @Override
    public final String getDescription() {
        return membresia.getDescription()
                + ", Acceso a contenido de video";
    }

    /**
     *
     * @param m vvv
     */
    public Streaming(final Membresia m) {
       membresia = m;
    }

    /**
     *
     * @return
     */
    @Override
    public final double cost() {
        return 0 + membresia.cost();
    }

    /**
     *
     * @return
     */
    @Override
    public final double duration() {
        return 0 + membresia.duration();
    }
}
