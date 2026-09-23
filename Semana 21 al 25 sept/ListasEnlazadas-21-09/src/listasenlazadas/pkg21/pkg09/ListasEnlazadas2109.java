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
        
        int flag = 1; 
        while(flag != 0)
        {
            MostrarMenu();  
            String texto = scanner.nextLine();
            switch(texto)
            {
                case("1"):
                    materias.add("Programación");
                    materias.add("Matematicas");
                    materias.add("Ingles");
                    materias.add("Bases de Datos");
                    materias.add("Redes");
                    break;
                case("2"):
                    IngresarMateria(materias);
                    break;
                case("3"):
                    BuscaMateria(materias);
                    break;
                case("4"):
                    ModificarMateria(materias);
                    break;
                case("5"):
                    EliminarMateria(materias);
                    break;
                case("6"):
                    MostarLista(materias);
                    break;
                case("7"):
                    ContarElementos(materias);
                    break;
                case("8"):
                    EliminarTodo(materias);
                    break;
                case("9"):
                    EliminarPiloto(materias);
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
        System.out.println("1. Iniciar una nueva lista");
        System.out.println("2. Ingresar una materia");
        System.out.println("3. Consultar una materia");
        System.out.println("4. Modificar una materia");
        System.out.println("5. Eliminar una materia");
        System.out.println("6. Imprimir las materias");
        System.out.println("7. Numero de elementos");        
        System.out.println("8. Eliminar todos los elementos");
        System.out.println("9. Eliminar Piloto");
        System.out.println("0. Salir del programa");
    }
    
    private static void BuscaMateria(LinkedList<String> materias)
    {
        int i = 0;
        System.out.println("Que Materia desea buscar");
        String objetivo = scanner.nextLine();
        for (String elemento : materias) {
            if (elemento.equals(objetivo)) {
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
        }
    }
    
     private static void IngresarMateria(LinkedList<String> materias)
    {
        System.out.println("Ingrese la materia a ingresar");
        String materia = scanner.nextLine();
        System.out.println("En que posicion desea añadir la materia");
        while (!scanner.hasNextInt()) {
            System.out.println("¡Error! Eso no es un número entero válido.");
            System.out.print("Inténtalo de nuevo: ");
            scanner.next(); 
        }

        int indice = scanner.nextInt();
        
        materias.add(indice, materia);
    }
     
     private static void EliminarMateria(LinkedList<String> materias)
     {
        System.out.println("Digite la materia a eliminar, debe ser nombre exacto");
        String objetivo = scanner.nextLine();
        if(materias.remove(objetivo))
        {
            System.out.println("Se ha borrado el elemento");
        }
        else
        {
            System.out.println("No se encontro el elemento");
        }
     }
     
     private static void ModificarMateria(LinkedList<String> materias)
     {
         MostarLista(materias);
         System.out.println("Digite la materia a modificar");         
         
         int i = 0;        
        String objetivo = scanner.nextLine();
        for (String elemento : materias) {
            if (elemento.equals(objetivo)) {
                System.out.println("Encontrado, en la posicion " + i);
                
                System.out.println("Digite el valor nuevo");
                materias.set(i, scanner.nextLine());
                System.out.println("Modificado con Exito");
                break;
            }
            i++;
        }
        
        MostarLista(materias);
     }
     
     
     private static void ContarElementos(LinkedList<String> materias)
     {
         if(materias.isEmpty())
         {
             System.out.println("La lista esta vacia");
         }
         else
         {
            System.out.println("la cantidad de elementos es " + materias.size());
         }
     }
    private static void EliminarTodo(LinkedList <String> materias)
    {
        if(materias.removeAll(materias))
        {
            System.out.println("Fueron eliminados todos los elementos");
        }
        MostarLista(materias);
    }
    
    private static void EliminarPiloto(LinkedList <String> materias)
    {
        System.out.println("Digite que texto desea eliminar");
        String objetivo = scanner.next();
        int i = 0;
        for (String elemento : materias) {
            if (elemento.contains(objetivo)) {
                materias.remove(i);
            }
            i++;
        }
        
        System.out.println("Elementos restantes");
        MostarLista(materias);
    }
}
