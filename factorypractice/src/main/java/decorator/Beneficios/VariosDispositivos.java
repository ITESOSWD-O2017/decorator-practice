package decorator.Beneficios;

import decorator.BenefitsDecorator;
import decorator.Membresia;

/**
 *
 */
public class VariosDispositivos extends BenefitsDecorator {
    /**
     *
     */
    private Membresia membresia;
    /**
     *
     */
    static final int COSTO = 200;

    /**
     *
     * @return
     */
    @Override
    public final String getDescription() {
        return membresia.getDescription()
                + ", Hacer uso de la aplicación desde varios dispositivos";
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
     * @param m ccccc
     */
    public VariosDispositivos(final Membresia m) {
        membresia = m;
    }

    /**
     *
     * @return
     */
    @Override
    public final double duration() {
        return 1 + membresia.duration();
    }
}
