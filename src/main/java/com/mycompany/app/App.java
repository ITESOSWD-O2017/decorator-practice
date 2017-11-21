package com.mycompany.app;

/**
 * Hello world!
 * @author Jesus Valadez
 * @version 1.0
 */
public class App {
    /**
     * Contructor default para la clase.
     */
    protected App() {
        // prevents calls from subclass
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param args Recibe un arreglo de cadenas como argumento
     */
    public static void main(final String[] args) {
        System.out.println("Hello World!");



    }
}
