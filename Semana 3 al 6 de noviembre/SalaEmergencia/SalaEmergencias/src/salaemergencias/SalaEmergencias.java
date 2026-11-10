/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salaemergencias;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author lurduy
 */


// Clase Paciente: va en el mismo archivo, sin "public"
class Paciente implements Comparable<Paciente> {
    String nombre;
    String Id;
    int prioridad;
    String diagnostico;

    // PASO 1: Constructores
    public Paciente() {        
    }

    public Paciente(String nombre, String Id, int prioridad, String diagnostico) {
        this.nombre = nombre;
        this.Id = Id;
        this.prioridad = prioridad;
        this.diagnostico = diagnostico;
    }
    
    String getNombre()
    {
        return this.nombre;
    }
    String getId()
    {
        return this.Id;
    }
    
    int getPrioridad()
    {
        return this.prioridad;
    }
    
    String getDiagnostico()
    {
        return this.diagnostico;
    }
    void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    void setId(String Id)
    {
        this.Id = Id;
    }
    void setPrioridad(int prioridad)
    {
        this.prioridad = prioridad;
    }
    void setDiagnostico(String diagnostico)
    {
        this.diagnostico = diagnostico;
    }
    
    // PASO 2: getGravedadTexto() y toString()
    String getGravedadTexto(int prioridad){
        String gravedad;
        switch(prioridad){
            case 1:
                gravedad =  "Leve";
                break;
            case 2:
                gravedad = "Moderada";
                break;
            case 3:
                gravedad = "Grave";
                break;
            case 4:
                gravedad = "Muy Grave";
                break;
            default:
                gravedad = "opcion no valida";
                break;
        }
        
        return gravedad;
    }

    @Override
    public String toString() {
        return "Paciente { Nombre: " + nombre + ", ID: " + Id + ", Prioridad: " + prioridad + " (" + getGravedadTexto(prioridad) + "), Diagnóstico: " + diagnostico + " }";
    }

    // PASO 5: compareTo()
    @Override
    public int compareTo(Paciente otro) {
        // En triage, el paciente con mayor número de prioridad (4: Muy Grave) se atiende primero
        return Integer.compare(otro.prioridad, this.prioridad);
    }

}
public class SalaEmergencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PASO 1 y 2: prueba tu clase Paciente aquí
        System.out.println("--- PASO 1 Y 2: PRUEBA DE CLASE PACIENTE ---");
        Paciente pPrueba = new Paciente("Ana Lopez", "1001", 3, "Fractura de brazo");
        System.out.println(pPrueba);
        System.out.println();

        // PASO 3: sala de espera (Cola normal FIFO - First In, First Out)
        System.out.println("--- PASO 3: SALA DE ESPERA (Llegada FIFO) ---");
        Queue<Paciente> salaEspera = new LinkedList<>();
        salaEspera.offer(new Paciente("Carlos Perez", "101", 1, "Dolor leve de cabeza"));
        salaEspera.offer(new Paciente("Maria Gomez", "102", 4, "Paro respiratorio"));
        salaEspera.offer(new Paciente("Juan Rodriguez", "103", 2, "Fiebre alta"));
        salaEspera.offer(pPrueba); // Prioridad 3

        System.out.println("Pacientes en sala de espera en orden de llegada:");
        for (Paciente p : salaEspera) {
            System.out.println("- " + p.getNombre() + " (Prioridad: " + p.getPrioridad() + ")");
        }
        System.out.println();

        // PASO 4: triage (Cola de prioridad organizada por gravedad)
        System.out.println("--- PASO 4: CLASIFICACIÓN EN TRIAGE ---");
        PriorityQueue<Paciente> colaTriage = new PriorityQueue<>();
        while (!salaEspera.isEmpty()) {
            colaTriage.offer(salaEspera.poll()); // Pasan de la sala de espera al triage
        }
        System.out.println("Pacientes ingresados a la cola de triage exitosamente.\n");

        // PASO 6: atención e historial (Pila LIFO - Last In, First Out)
        System.out.println("--- PASO 6: ATENCIÓN DE PACIENTES SEGÚN PRIORIDAD ---");
        Stack<Paciente> historial = new Stack<>();

        // Se atienden en orden de prioridad (el más grave primero)
        while (!colaTriage.isEmpty()) {
            Paciente atendido = colaTriage.poll();
            System.out.println("Atendiendo a: " + atendido.getNombre() + " | Urgencia: " + atendido.getGravedadTexto(atendido.getPrioridad()));
            historial.push(atendido); // Se guarda en el historial (Pila)
        }

        // Consultar el historial
        System.out.println("\n--- HISTORIAL DE ATENCIONES (PILA) ---");
        System.out.println("Último paciente atendido (tope de la pila): " + historial.peek().getNombre());

        System.out.println("\nLista de pacientes atendidos (del más reciente al más antiguo):");
        while (!historial.isEmpty()) {
            Paciente p = historial.pop();
            System.out.println("- " + p.getNombre() + " [" + p.getGravedadTexto(p.getPrioridad()) + "]");
        }
    }
    
}
