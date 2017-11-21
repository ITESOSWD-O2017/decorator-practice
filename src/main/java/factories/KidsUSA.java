package factories;
import Beneficios.CanalesKids;
import Beneficios.CanalesLive;
import TiposMembresia.Membresia;

public class KidsUSA extends Membresia{
    Membresia membresia;
    public KidsUSA(){
        this.membresia = membresia;
        membresia = new CanalesKids(membresia);
        membresia = new CanalesLive(membresia);
        System.out.println(membresia.getDescription());
    }
    public double costo() {
        return 1.2;
    }
}
