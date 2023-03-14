import java.util.Stack;

/**
 * Clase UtilizacionPila, para desarrollar los ejercicios propuestos en el
 * apartado 2
 *
 * @author
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
        boolean resultado=true, fin=false;
        Stack<String>etiquetasApertura=new Stack<>();
        int i =0,j=0;
        String[]etiquetas=texto.split(" ");
        UtilizacionStack utilizacionStack=new UtilizacionStack();
        do{
            j++;
            System.out.println(etiquetas[j]);
            System.out.println(j);
        }while(etiquetas[j].length()>0);
        do {
            i++;
            if(lista.esEtiqueta(etiquetas[i])){
                if (lista.esApertura(etiquetas[i])){
                    etiquetasApertura.push(etiquetas[i]);
                }else{
                    String elemento=etiquetasApertura.pop();
                    System.out.println(etiquetas[i].replace("/",""));
                    System.out.println(elemento);
                    if (etiquetas[i].replace("/","").compareTo(elemento)!=0){
                        resultado=false;
                    }
                    System.out.println(resultado);
                }
            }
        }while (i!=j);
        if(!etiquetasApertura.empty()){
            System.out.println("En la pila quedan elementos:");
            utilizacionStack.mostrarInverso(etiquetasApertura);
            resultado=false;
        }
        return  resultado;
    }

    /**
     * Método que muestra el contenido de la pila invertido (el fondo arriba y la cima abajo)
     * @param pila la pila que deseamos mostrar
     */
    public void mostrarInverso(Pila pila){
        if(!pila.vacia()){
            int elemento=pila.desapilar();
            mostrarInverso(pila);
            System.out.println(elemento + " ");
            pila.apilar(elemento);
        }
    }

}

