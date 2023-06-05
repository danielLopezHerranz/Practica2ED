/**
 * Clase UtilizacionCola, para desarrollar los ejercicios propuestos en el
 * apartado 4
 *
 * @author Daniel López Herranz
 */
public class UtilizacionCola {

    /**
     * TO-DO 1: Método que recibe una lista de etiquetas html y un String
     * conteniendo una página html.
     * Genera una cola que contiene las etiquetas de la lista contenidas en el texto
     *
     * @param lista lista que contiene las etiquetas que queremos comprobar
     * @param texto la página que vamos a analizar
     * @return la cola que contiene las etiquetas de la lista contenidas en el texto
     */
    public Cola leerTexto(ListaEtiquetas lista, String texto) {
        Cola resultado=new Cola();
        int i =0;
        String[]etiquetas=texto.split(" ");


        return resultado;
    }

    /**
     * Método que recibe una cola y una lista de etiquetas. Comprueba si todas las etiquetas
     * de la cola están balanceadas (cada etiqueta de apertura se corresponde con una de cierre)
     *
     * @param cola  que contiene las etiquetas extraídas de una página html
     * @param lista contiene las etiquetas que queremos analizar.
     * @return verdadero si las etiquetas están balanceadas, falso en caso contrario
     */
    public boolean comprobarHtml(Cola cola, ListaEtiquetas lista) {
        boolean res=true;
        Pila pila = new Pila();
        String elemento;

        for (int i=0;i<cola.getNumElementos();i++)
        {

            elemento = cola.desencolar();
            if (lista.esApertura(elemento))
            {
                pila.apilar(elemento);
            }
            else
            {

                String cima = pila.desapilar();
                if (!lista.emparejados(cima,elemento))
                {
                    res=false;
                }
            }
            cola.encolar(elemento);
        }
        if (!pila.vacia())
        {
            System.out.println("En la pila quedan elementos:");
            pila.mostrar();
            res=false;
        }
        return res;
    }
}
