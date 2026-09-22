/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasenlazadas.pkg21.pkg09;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author lurduy
 */
public class ListasEnlazadas2109 {
    
    static Scanner scanner = new Scanner(System.in);
   
    public static void main(String[] args) {
        LinkedList<String> materias = new LinkedList<>();
        materias.add("Inteligencia Artificial");
        materias.add("Etiqueta");
        int flag = 1; 
        while(flag != 0)
        {
            MostrarMenu();  
            String texto = scanner.nextLine();
            switch(texto)
            {
                case("1"):
                    IngresarMateria(materias);
                    break;
                case("2"):
                    BuscaMateria(materias);
                    break;
                case("6"):
                    MostarLista(materias);
                    break;
                case("0"):   
                    System.out.println("Gracias por su visita");
                    flag = 0;
                    break;
                default: 
                    System.out.println("Seleccione una opción válida");
                    break;
            }
        }
    }
    
    private static void MostrarMenu()
    {
        System.out.println("Bienvenido al menu de manejo de materias");
        System.out.println("1. Ingrear una nueva materia");
        System.out.println("2. Buscar una materia");
        System.out.println("3. Borrar una materia");
        System.out.println("4. Modificar una opción");
        System.out.println("5. Eliminar una materia");
        System.out.println("6. Imprimir las materias");
        System.out.println("7. Numero de elementos");
        System.out.println("8. Eliminar un elemento");
        System.out.println("9. Eliminar todos los elementos");
    }
    
    private static void BuscaMateria(LinkedList<String> materias)
    {
        int i = 0;
        System.out.println("Que Materia desea buscar");
        String objetivo = scanner.nextLine();
        for (String elemento : materias) {
            if (elemento.contains(objetivo)) {
                System.out.println("Encontrado, en la posicion " + i);
                break; 
            }
            i++;
        }
        
    }
    private static void MostarLista(LinkedList<String> materias)
    {
        if(materias.isEmpty())
        {
            System.out.println("La lista no tiene elementos");
        }
        else{
            System.out.println("Las materias listadas son");
            materias.forEach(System.out::println);
    }}
    
     private static void IngresarMateria(LinkedList<String> materias)
    {
        System.out.println("Ingrese la materia a ingresar");
        String materia = scanner.nextLine();
        materias.add(materia);
    }
}
