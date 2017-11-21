package decorator.Membresias;

import decorator.Membresia;

/**
 *
 */
public class Platinum extends Membresia {
    /**
     *
     */
    static final int COSTO = 1200;
    /**
     *
     */
    static final int DURACION = 10;

    /**
     *
     */
    public Platinum() {
    setDescription("Platino");
}

    /**
     *
     * @return fffsfd
     */
    public final String getDescription() {
        return "Platino";
    }

    /**
     *
     * @return
     */
    @Override
    public final double cost() {
        return COSTO;
    }

    /**
     *
     * @return
     */
    @Override
    public final double duration() {
        return DURACION;
    }
}
