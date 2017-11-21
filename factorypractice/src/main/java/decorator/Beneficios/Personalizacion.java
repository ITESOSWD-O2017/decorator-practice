package decorator.Beneficios;

import decorator.BenefitsDecorator;
import decorator.Membresia;

/**
 *
 */
public class Personalizacion extends BenefitsDecorator {
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
                + ", Personaliza la ventana a tu gusto";
    }

    /**
     *
     * @param m hxjcbzm
     */
    public Personalizacion(final Membresia m) {
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
