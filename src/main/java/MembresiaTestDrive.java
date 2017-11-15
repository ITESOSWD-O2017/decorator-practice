import com.iteso.factory.MembresiaStore;
import com.iteso.factory.Membresia;
import com.iteso.factory.factories.*;


public class MembresiaTestDrive {
    public static void main (String[] args){
        MembresiaStore premiumStore = new MembresiaPremiumStore();
        MembresiaStore normalStore = new MembresiaNormalStore();
        MembresiaStore streamStore = new MembresiaStreamStore();
        MembresiaStore dulceriaStore = new MembresiaDulceriaStore();
        MembresiaStore juegosStore = new MembresiaJuegosStore();

        Membresia membresia = premiumStore.orderMembresia("VIP");

        System.out.println("First order is: "+ membresia.getName());
        System.out.println();
        System.out.println();
        membresia = normalStore.orderMembresia("Sala normal asiento J12");

        System.out.println("Second order is: "+ membresia.getName());
        System.out.println();
        System.out.println();
        membresia = normalStore.orderMembresia("Sala normal asiento J13");

        membresia = streamStore.orderMembresia("Pelicula gratis en el stream");

        System.out.println("Third order is: "+ membresia.getName());

        Membresia membresia1 = dulceriaStore.orderMembresia("Refresco y nachos");

        Membresia membresia2 = juegosStore.orderMembresia("Media hora en Capcom vs SNK");
    }
}
