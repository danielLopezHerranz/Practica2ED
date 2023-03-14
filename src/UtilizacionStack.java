import java.util.Stack;

/**
 * Clase UtilizacionStack, para desarrollar los ejercicios propuestos en el apartado 3
 * @author
 * @version
 */
public class UtilizacionStack {

    /**
     * Método que recibe un texto y una lista de etiquetas. Comprueba si todas las etiquetas
     * del texto están balanceadas (cada etiqueta de apertura se corresponde con una de cierre)
     *
     * @param lista contiene las etiquetas que queremos analizar.
     * @param texto que contiene el contenido de una página html
     * @return verdadero si las etiquetas están balanceadas, falso en caso contrario
     */
    public boolean comprobarLineaStack (ListaEtiquetas lista, String texto) {
        return false;
    }
    /**
     * Método que muestra el contenido de la pila
     * @param pila la pila que deseamos mostrar
     */
    public void mostrar (Stack <String> pila)  {
        String elemento="";
        if(!pila.empty()){
            elemento=pila.pop();
            System.out.println(elemento);
            mostrar(pila);
            pila.push(elemento);
        }else{
            System.out.println("Contenido de la pila:");
        }
    }
    /**
     * Método que muestra el contenido de la pila invertido (el fondo arriba y la cima abajo)
     * @param pila la pila que deseamos mostrar
     */
    public void mostrarInverso (Stack <String> pila) {
        String elemento;
        if(!pila.empty()){
            elemento=pila.pop();
            mostrarInverso(pila);
            System.out.println(elemento+" ");
            pila.push(elemento);
        }
    }
}
