import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;


/*
 * RETO 12: ¿Quedó vacío el historial?
 * Estudiante: Barrera Jose Luis
 *
 * Que debo hacer: Al final del main, imprime si el historial está vacío. Usa el método empty().
 * Pregunta: ¿Qué sale: true o false? ¿Por qué?
 *
 * 1. Mi prediccion (ANTES de ejecutar):
 *
 * 2. Lo que salio en la consola:
 *
 * 3. Por que salio asi:
 *
 */

/*
 * ============================================================
 *  SALA DE EMERGENCIAS
 *  Estructura de Datos - UNIMINUTO
 * ============================================================
 *  Nombre completo:
 *
 *  INSTRUCCIONES
 *  1. Ejecuta el programa y mira la salida en la consola.
 *  2. Responde las 8 preguntas (P1 a P8). Escribe tu respuesta
 *     en la línea "// R:" que está debajo de cada pregunta.
 *  3. Respuestas cortas: la respuesta y una frase de por qué.
 *  4. No borres ni cambies el código de este archivo.
 * ============================================================
 */
public class SalaEmergencias {

    // Clase Paciente: el "molde" de cada paciente.
    // Va dentro de SalaEmergencias (por eso lleva static).
    static class Paciente implements Comparable<Paciente> {

        private String nombre;
        private int gravedad;   // 1 Leve, 2 Moderada, 3 Grave, 4 Muy grave

        public Paciente(String nombre, int gravedad) {
            this.nombre = nombre;
            this.gravedad = gravedad;
        }
        // P1. En "this.nombre = nombre", ¿cuál de los dos es el atributo
        //     del paciente y cuál es el dato que llegó entre paréntesis?
        // R:  this.nombre es el atributo nombre del paciente, y el otro valor es el valor entero que corresponde a la gravedad del paciente

        public String getNombre() {
            return nombre;
        }

        public int getGravedad() {
            return gravedad;
        }

        public String getGravedadTexto() {
            switch (gravedad) {
                case 1: return "Leve";
                case 2: return "Moderada";
                case 3: return "Grave";
                case 4: return "Muy grave";
                default: return "Desconocida";
            }
        }
        // P2. Si un paciente tuviera gravedad 7, ¿qué texto mostraría? ¿Por qué?
        // R: Desconocida

        @Override
        public String toString() {
            return nombre + " (" + getGravedadTexto() + ")";
        }

        @Override
        public int compareTo(Paciente otro) {
            return Integer.compare(otro.gravedad, this.gravedad);
        }
        // P3. compareTo decide quién va primero en el triage.
        //     Si se escribiera Integer.compare(this.gravedad, otro.gravedad),
        //     ¿quién saldría primero: el más grave o el menos grave?
        // R:
    }

    public static void main(String[] args) {

        // ---------- 1. SALA DE ESPERA (Queue: orden de llegada) ----------
        Queue<Paciente> salaEspera = new LinkedList<>();
        salaEspera.offer(new Paciente("Juan", 1));
        salaEspera.offer(new Paciente("Raquel", 3));
        salaEspera.offer(new Paciente("Ignacio", 2));
        salaEspera.offer(new Paciente("Omar", 4));
        salaEspera.offer(new Paciente("Beatriz", 3));
        salaEspera.offer(new Paciente("Xochilt", 1));
        System.out.println("Orden de llegada: " + salaEspera);
        // P4. ¿Por qué Juan aparece de primero en la sala de espera?
        // R: Porque fue el primer paciente en llegar  

        // ---------- 2. TRIAGE (PriorityQueue: el más grave primero) ----------
        PriorityQueue<Paciente> triage = new PriorityQueue<>();
        while (!salaEspera.isEmpty()) {
            triage.offer(salaEspera.poll());
        }
        System.out.println("Paciente mas urgente: " + triage.peek());
        System.out.println();
        // P5. Al terminar este while, ¿cuántos pacientes quedan en salaEspera? ¿Por qué?
        // R: Ninguno, ya que se ejecuta hasta que sala de espera quede vacia

        // ---------- 3. ATENCIÓN E HISTORIAL (Stack: el último queda arriba) ----------
        Stack<Paciente> historial = new Stack<>();
        while (!triage.isEmpty()) {
            Paciente atendido = triage.poll();
            System.out.println("Atendiendo a: " + atendido);
            historial.push(atendido);
        }
        // P6. Juan llegó de primero, pero lo atienden de quinto. ¿Por qué?
        // R: Porque no tenia la suficiente prioridad para ser atendido antes

        System.out.println();
        System.out.println("Ultimo paciente atendido: " + historial.peek());
        System.out.println("Total atendidos: " + historial.size());
        // P7. ¿Por qué historial.peek() muestra a Xochilt y no a Omar?
        // R: Porque historial.peek() muestra al ultimo, y al estar al final en la cola de prioridad, es el que nos muestra
        // en el historial

        // P8. ¿Qué diferencia hay entre peek() y poll()? Da un ejemplo de este código.
        // R: peek() solo nos muestra el ultimo elemento de la cola, pero poll, ademas de recuperar el elemento en una pila, pero poll()
        // ademas de recuperarlo, lo saca de la pila, el mejor ejemplo, esta en la linea 124, donde con .peek() obtenemos el ultimo
        // elemento de la pila, sin afectar la pila, si usaramos poll(), se quitaria un elemento
    }
}
