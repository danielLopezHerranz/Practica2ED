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
        //prueba.probarOpciones ();
        UtilizacionPila pruebasPilas=new UtilizacionPila();
        Pila pilaPruebas = new Pila();
        pilaPruebas.apilar(1);
        pilaPruebas.apilar(2);
        pilaPruebas.apilar(3);
        pilaPruebas.apilar(4);
        pilaPruebas.apilar(5);
        UtilizacionStack utilizacionStackPruebas=new UtilizacionStack();
        Stack<String>stackPruebas=new Stack<>();
        stackPruebas.push("Fola?");
        stackPruebas.push("pa");
        stackPruebas.push("ti");
        stackPruebas.push("mi");
        stackPruebas.push("cola");
        System.out.print("1.MostrarInverso.\n3.MostrarStack.\nElija una opción: ");
        int elección=teclado.nextInt();
        switch (elección){
            case 1:
                pruebasPilas.mostrarInverso(pilaPruebas);
                break;
            case 3:
                utilizacionStackPruebas.mostrar(stackPruebas);
                break;
        }
    }
}
