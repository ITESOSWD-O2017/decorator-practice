package decorator.Beneficios;

import decorator.BenefitsDecorator;
import decorator.Membresia;

/**
 *
 */
public class SinAnuncios extends BenefitsDecorator {
    /**
     *
     */
    private Membresia membresia;
    /**
     *
     */
    static final int COSTO = 100;

    /**
     *
     * @return
     */
    @Override
    public final String getDescription() {
        return membresia.getDescription()
                + ", Disfruta de nuestro contenido sin anuncios";
    }

    /**
     *
     * @param m ccc
     */
    public SinAnuncios(final Membresia m) {
        membresia = m;
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
     * @return
     */
    @Override
    public final double duration() {
        return 0 + membresia.duration();
    }
}
