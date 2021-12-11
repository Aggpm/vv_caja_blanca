package com.practica.cajablanca;
import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;
public class PruebaSustPalabra {
    @Test
    public void primero() throws EmptyCollectionException{
        Editor e1 = new Editor();
        Editor e2 = new Editor();
        Editor e3 = new Editor();
        Editor e4 = new Editor();
        e1.leerFichero("vacio.txt");
        e2.leerFichero("sustpalabra1.txt");
        e3.leerFichero("sustpalabra2.txt");
        e4.leerFichero("sustpalabra3.txt");

        e1.sustituirPalabra("Hola","Adios");
        assertEquals(0, e1.size());

        e2.sustituirPalabra("Hola","Adios");
        assertEquals("[Adios]",e2.getLinea(1).toString());

        e3.sustituirPalabra("Hola","Adios");
        assertEquals("[Mario]",e3.getLinea(1).toString());

        e4.sustituirPalabra("Hola","Adios");
        assertAll("tests 5 camino",
                ()-> assertEquals("[Adios]",e4.getLinea(1).toString()),
                ()-> assertEquals("[Adios]",e4.getLinea(2).toString())
        );
    }
}
