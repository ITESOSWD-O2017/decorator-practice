package decorator.Beneficios;

import decorator.BenefitsDecorator;
import decorator.Membresia;

/**
 *
 */
public class Video4K extends BenefitsDecorator {
    /**
     *
     */
    private Membresia membresia;
    /**
     *
     */
    static final int COSTO = 50;

    /**
     *
     * @return
     */
    @Override
    public final String getDescription() {
        return membresia.getDescription() + ", Contenido 4K";
    }

    /**
     *
     * @return
     */
    @Override
    public final double cost() {
        return COSTO + membresia.cost();
    }

    /**
     *
     * @param m fffff
     */
    public Video4K(final Membresia m) {
       membresia = m;
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

