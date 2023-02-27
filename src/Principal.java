import java.util.Scanner;

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
        //prueba.probarOpciones ();
        Pila pilaPruebas = new Pila();
        pilaPruebas.apilar(1);
        pilaPruebas.apilar(2);
        pilaPruebas.apilar(3);
        pilaPruebas.apilar(4);
        pilaPruebas.apilar(5);
        System.out.print("1.MostrarInverso.\nElija una opción: ");
        int elección=teclado.nextInt();
        switch (elección){
            case 1:
                pilaPruebas.mostrarInverso(pilaPruebas);
        }
    }
}
