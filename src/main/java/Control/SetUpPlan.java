package Control;

import Beneficios.CanalesKids;
import TiposMembresia.MemPlatinum;
import TiposMembresia.Membresia;
import factories.AmericaStore;
import factories.BasicaUSA;
import factories.MembresiaLocal;

public class SetUpPlan {
    public static void main(String[] args){
        Membresia membresia = new MemPlatinum();
        System.out.println(membresia.description);
        membresia = new CanalesKids(membresia);
        System.out.println(membresia.getDescription());

    }
}
