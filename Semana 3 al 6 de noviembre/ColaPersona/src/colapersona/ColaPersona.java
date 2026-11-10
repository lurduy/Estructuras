package colapersona;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author lurduy
 */
public class ColaPersona {

    public static void main(String[] args) {
        Cola();
        Pila();
        PrioridadPalabras();
        
    }
   
    private static void Pila()
    {
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
    
    private static void Cola()
    {
        Queue<Integer> cola = new LinkedList<>();

        // TODO 1: Mete con offer() los MISMOS 3 datos del ejercicio 1,
        //         en el mismo orden. Después de cada offer, llama a imprimirCola(cola);

        cola.offer(1078992);
        imprimirCola(cola);
        
        cola.offer(17);
        imprimirCola(cola);
        
        cola.offer(12);
        imprimirCola(cola);
        // TODO 2: Atiende al primero con poll(). Guárdalo en una variable Integer,
        //         imprime "Se atendio X" y llama a imprimirCola(cola);
        int X = cola.poll();
        System.out.println("Se atendio " + X);
        imprimirCola(cola);

        // TODO 3: Vacía la cola de forma segura con isEmpty() y poll().
        System.out.println("--- VACIANDO LA COLA ---");
        while(!cola.isEmpty())
        {
            imprimirCola(cola);
            cola.poll();            
        }
        
    }
    
    private static void PrioridadPalabras()
    {
        PriorityQueue<String> colaPrioridad = new PriorityQueue<>();
        // TODO 1: Mete con offer() 4 palabras: tu nombre, tu ciudad,
        //         tu carrera y tu lenguaje de programación favorito.
        //         Luego imprime la cola completa con System.out.println(cola);
        colaPrioridad.offer("Jose Luis");
        colaPrioridad.offer("Soacha");
        colaPrioridad.offer("Tecnologia en Informatica");
        colaPrioridad.offer("C#");
        System.out.println(colaPrioridad);

        // TODO 2: ANTES de ejecutar, escribe aquí en un comentario
        //         cuál crees que será la cabeza. Luego imprímela con peek().
        //         Mi predicción: 
        //la cabeza deberia ser mi nombre
        System.out.println("Cabeza");
        System.out.println(colaPrioridad.peek());
        colaPrioridad.peek();

        // TODO 3: Vacía la cola con isEmpty() y poll(), imprimiendo cada palabra.
        System.out.println("--- VACIANDO LA COLA DE PRIORIDAD---");
        while(!colaPrioridad.isEmpty())
        {
            System.out.println(colaPrioridad);
            colaPrioridad.poll();            
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
    
     private static void imprimirCola(Queue<Integer> cola) {
        if (cola.isEmpty()) {
            System.out.println("La cola esta vacia\n");
        } else {
            System.out.println("Tamano: " + cola.size());
            System.out.println("Cabeza: " + cola.peek());
            System.out.println("Contenido: " + cola + "  <- la cabeza es el de la izquierda\n");
        }
    }
}