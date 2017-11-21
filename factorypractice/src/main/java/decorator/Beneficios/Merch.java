package decorator.Beneficios;

import decorator.BenefitsDecorator;
import decorator.Membresia;

/**
 *
 */
public class Merch extends BenefitsDecorator {
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
        return membresia.getDescription() + ", Mercancía Exclusiva.";
    }

    /**
     *
     * @param m kkk
     */
    public Merch(final Membresia m) {
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
