package colapersona;

import java.util.Stack;

/**
 *
 * @author lurduy
 */
public class ColaPersona {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();        

        // TODO 1: Mete con push() tus 3 datos en este orden:
        //         número de lista, día de cumpleaños, mes de cumpleaños.
        //         Después de cada push, llama a imprimirPila(pila);
        
        pila.push(1078992);        
        imprimirPila(pila);
        
        pila.push(17);       
        imprimirPila(pila);
        
        pila.push(12);        
        imprimirPila(pila);

        // TODO 2: Busca tu número de lista con search() e imprime la posición.
        System.out.println("--- BUSQUEDA ---");
        int posicion = pila.search(1078992);
        System.out.println("Posicion del numero de lista: " + posicion + "\n");

        // TODO 3: Vacía la pila de forma segura.
        //         Mientras NO esté vacía: saca con pop(), imprime "Se saco X"
        //         y llama a imprimirPila(pila);
        
        System.out.println("--- VACIANDO LA PILA ---");
        while (!pila.empty()) {
            int elementoSacado = pila.pop();
            System.out.println("Se saco " + elementoSacado);
            imprimirPila(pila);
        }
    }
   
    private static void imprimirPila(Stack<Integer> pila) {
        if (pila.empty()) {
            System.out.println("La pila esta vacia\n");
        } else {
            System.out.println("Cima: " + pila.peek());
            System.out.println("Contenido: " + pila + "  <- la cima es el de la derecha\n");
        }
    }
}