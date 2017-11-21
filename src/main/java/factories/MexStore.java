package factories;

import TiposMembresia.Membresia;

public class MexStore extends MembresiaLocal{
    @Override
    protected Membresia createMemFactory(String tipo) {
        if (tipo.equals("basica"))
            return new BasicaUSA();
        else if (tipo.equals("kids") )
            return new KidsUSA();
        else if (tipo.equals("live"))
            return new LiveUSA();
        else if (tipo.equals("platino") )
            return new PlatUSA();
        else return null;
    }
}
