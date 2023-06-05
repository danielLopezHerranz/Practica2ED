import java.util.Scanner;
import java.util.Stack;

/**
 * Clase UtilizacionPila, para desarrollar los ejercicios propuestos en el
 * apartado 2
 *
 * @author Daniel López Herranz
 * @version
 */
public class UtilizacionPila {

    /**
     * TO-Do 1: Método que recibe un texto y una lista de etiquetas. Comprueba
     * si todas las etiquetas del texto están balanceadas (cada etiqueta de
     * apertura se corresponde con una de cierre)
     *
     * @param lista contiene las etiquetas que queremos analizar.
     * @param texto que contiene el contenido de una página html
     * @return verdadero si las etiquetas están balanceadas, falso en caso contrario
     */
    public boolean comprobarTexto (ListaEtiquetas lista, String texto) {
        boolean res=true;
        String[] aux = texto.split(" ");
        Pila pila = new Pila();
        int i=0;
        while(i<aux.length && res)
        {
            if (lista.esApertura(aux[i]))
            {

                pila.apilar(aux[i]);
            }
            else if (lista.esCierre(aux[i]))
            {
                String sAux = pila.desapilar();
                if (!lista.emparejados(sAux,aux[i]))
                {
                    res=false;
                }
            }
            i++;
        }

        if (!pila.vacia())
        {
            System.out.println("En la pila quedan elementos:");
            mostrarInverso(pila);
            res=false;
        }

        return res;
    }

    /**
     * Método que muestra el contenido de la pila invertido (el fondo arriba y la cima abajo)
     * @param pila la pila que deseamos mostrar
     */
    public void mostrarInverso(Pila pila){
        if(!pila.vacia()){
            String elemento=pila.desapilar();
            mostrarInverso(pila);
            System.out.println(elemento + " ");
            pila.apilar(elemento);
        }
    }

}

