package com.practica.cajablanca;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class NumPalabrasTest {

    @Test
    @DisplayName("Test \"numPalabras\"")
    public void testNumPalabras(){
        Editor editorFull = new Editor();
        Editor editorEmpty = new Editor();
        String word = "Hola";
        editorFull.leerFichero("texto.txt");

        assertThrows(IllegalArgumentException.class,
                () -> editorFull.numPalabras(0, 1, word), "La predicción de la excepción ha fallado"
        );
        assertThrows(IllegalArgumentException.class,
                () -> editorEmpty.numPalabras(1, 2, word), "La predicción de la excepción ha fallado"
        );
        assertEquals(0 , editorEmpty.numPalabras(1,0, word));
        assertEquals(0 , editorFull.numPalabras(2,2, word));
        assertEquals(0 , editorFull.numPalabras(1,3, "Arbol"));
        assertEquals(7 , editorFull.numPalabras(1,3, word));
    }

}
