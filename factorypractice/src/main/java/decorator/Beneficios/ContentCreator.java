package decorator.Beneficios;


import decorator.BenefitsDecorator;
import decorator.Membresia;

/**
 *
 */
public class ContentCreator extends BenefitsDecorator {
    /**
     *
     */
    private Membresia membresia;
    /**
     *
     */
    static final int COSTO = 400;
    /**
     *
     */
    static final int DURACION = 2;
    @Override
    /**
     *
     */
    public final String getDescription() {
        return membresia.getDescription()
               + ", Herramientas de edición de vídeos";
    }

    /**
     *
     * @param m kk
     */
    public ContentCreator(final Membresia m) {
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
        return DURACION + membresia.duration();
    }
}
