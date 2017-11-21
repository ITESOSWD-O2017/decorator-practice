package decorator.Membresias;

import decorator.Membresia;

/**
 *
 */
public class Plata extends Membresia {
    /**
     *
     */
    static final int COSTO = 600;
    /**
     *
     */
    static final int DURACION = 3;

    /**
     *
     */
    public Plata() {
        setDescription("Plata");
    }

    /**
     *
     * @return ffff
     */
    public final String getDescription() {
        return "Plata";
    }

    /**
     *
     * @return ffffffff
     */
    @Override
    public final double cost() {
        return COSTO;
    }

    /**
     *
     * @return ffffff
     */
    @Override
    public final double duration() {
        return DURACION;
    }
}
