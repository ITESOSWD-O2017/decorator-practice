package factories;

import TiposMembresia.Membresia;

public abstract class MembresiaLocal {
    public Membresia generarCuenta(String tipo){
        Membresia membresia;
        membresia = createMemFactory(tipo);
        return membresia;
    }

    protected abstract Membresia createMemFactory(String tipo);
}
