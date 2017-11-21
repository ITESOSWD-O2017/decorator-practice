
package decorator.Beneficios;

import decorator.BenefitsDecorator;
import decorator.Membresia;


/**
 *
 */
public class Exclusivo extends BenefitsDecorator {
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
        return membresia.getDescription() + ", Contenido Exclusivo";
    }

    /**
     *
     * @param m kk
     */
    public  Exclusivo(final Membresia m) {
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
