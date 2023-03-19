import java.util.Scanner;
import java.util.Stack;

/**
 * Clase Principal, desde la que se llama a la clase Pruebas
 *
 * Esta clase se entrega completamente desarrollada, no se tiene que modificar
 *
 * @author Pilar Martinez Garcia
 * @version 1.0
 */
public class Principal {//Esta clase se daría completa, tal y como está
    public static void main (String [] args) {
        Scanner teclado= new Scanner(System.in);
        Pruebas prueba = new Pruebas();
        prueba.probarOpciones ();
    }
}
