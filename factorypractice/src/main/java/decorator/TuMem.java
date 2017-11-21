package decorator;


import decorator.Factory.MemFact;
import decorator.Factory.MemLA;
import decorator.Factory.MemUS;
import decorator.Membresias.Bronce;
import decorator.Membresias.Oro;
import decorator.Membresias.Plata;
import decorator.Membresias.Platinum;
import decorator.Membresias.Cobre;

/**
 *
 */
public final class TuMem {
    /**
     *
     */
    private TuMem() {

    }


    /**
     *
     * @param args fffffff
     */


    public static void main(final String[] args) {

        Membresia platinum = new Platinum();
        Membresia plata = new Plata();
        Membresia gold = new Oro();
        Membresia bronce = new Bronce();
        Membresia bronceUS = new Bronce();
        Membresia cobre = new Cobre();
        MemFact jhon = new MemUS();
        MemFact juan = new MemLA();
        bronce = juan.createmembership(bronce);
        System.out.println(bronce.getDescription());
        System.out.println(bronce.cost());
        System.out.println();
        System.out.println();

        bronceUS = jhon.createmembership(bronceUS);
        System.out.println(bronceUS.getDescription());
        System.out.println(bronceUS.cost());
        System.out.println();
        System.out.println();


        /*platinum=new Merch(platinum);
        platinum= new ContentCreator(platinum);
        platinum=new Exclusivo(platinum);
        platinum=new Video4K(platinum);
        platinum=new VariosDispositivos(platinum);
        platinum=new Personalizacion(platinum);
        platinum=new SinAnuncios(platinum);
        platinum= new Streaming(platinum);
        platinum=new SubirVideos(platinum);
        System.out.println(platinum.description);
        System.out.println(platinum.cost());
        System.out.println();
        System.out.println();

        gold=new Exclusivo(gold);
        gold=new Exclusivo(gold);
        gold=new Video4K(gold);
        gold=new VariosDispositivos(gold);
        gold=new Personalizacion(gold);
        gold=new SinAnuncios(gold);
        gold= new Streaming(gold);
        gold=new SubirVideos(gold);
        System.out.println(gold.description);
        System.out.println(gold.cost());
        System.out.println();
        System.out.println();

        plata=new VariosDispositivos(plata);
        plata=new Personalizacion(plata);
        plata=new SinAnuncios(plata);
        plata= new Streaming(plata);
        plata=new SubirVideos(plata);
        System.out.println(plata.description);
        System.out.println(plata.cost());
        System.out.println();
        System.out.println();

        bronce =new Personalizacion(bronce);
        bronce=new SinAnuncios(bronce);
        bronce= new Streaming(bronce);
        bronce=new SubirVideos(bronce);
        System.out.println(bronce.description);
        System.out.println(bronce.cost());
        System.out.println();
        System.out.println();

        cobre= new Streaming(cobre);
        cobre=new SubirVideos(cobre);
        System.out.println(cobre.description);
        System.out.println(cobre.cost());
        System.out.println();
        System.out.println();
*/




    }
}
