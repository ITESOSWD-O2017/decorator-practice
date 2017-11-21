package factories;
import Beneficios.CanalesKids;
import Beneficios.CanalesLive;
import TiposMembresia.Membresia;

public class PlatUSA extends Membresia{
    Membresia membresia;
    public PlatUSA(){
        this.membresia = membresia;
        membresia = new CanalesKids(membresia);
        membresia = new CanalesLive(membresia);
        System.out.println(membresia.getDescription());
    }
    public double costo() {
        return 1.2;
    }
}
