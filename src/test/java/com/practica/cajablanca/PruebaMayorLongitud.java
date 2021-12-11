package com.practica.cajablanca;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class PruebaMayorLongitud {

    @Test
    @DisplayName("Test \"mayorLongitud\"")
    public void testMayorLongitud() throws EmptyCollectionException {
        Editor editorEmpty = new Editor();
        Editor editor1elem = new Editor();
        Editor editor2elem = new Editor();
        Editor editor2elem2 = new Editor();
        editor1elem.leerFichero("texto1elem.txt");
        editor2elem.leerFichero("texto2elem.txt");
        editor2elem2.leerFichero("texto2elem2.txt");

        assertEquals(null, editorEmpty.mayorLongitud());
        assertEquals("Hooola", editor1elem.mayorLongitud());
        assertEquals("Hooola", editor2elem.mayorLongitud());
        assertEquals("Hooolaaa", editor2elem2.mayorLongitud());
    }
}
