/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author lurduy
 */
public class Parcial {
    
    
     private static void MateriasIniciales(List<String> Materias)
    {
        Materias.add("Piloto IA");
        Materias.add("Matematicas");
        Materias.add("Calculo");
        Materias.add("Piloto Algebra");
    }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      List<String> Materias = new ArrayList<>();
      
      MateriasIniciales(Materias);
      
       List<String> MateriasNuevas = new ArrayList<>();
      
      System.out.println("Inventario adicional");
      
      int bandera = 0;
      while(bandera == 0)
      {
          System.out.println("Ingrese la nueva materia");
          String Materia = scanner.nextLine();
          MateriasNuevas.add(Materia);
          
          System.out.println("si desea ingresar mas materia digite 0");          
          
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un numero entero (ejemplo: 0). Intente de nuevo:");
                scanner.nextLine(); 
            }

            bandera = scanner.nextInt();

          scanner.nextLine();
      }
      
       System.out.println("Fusionando Listas...");
      
      Materias.addAll(MateriasNuevas);
      
       ListIterator <String> recorrido = Materias.listIterator();
       
       
      System.out.println("Lista consolidada antes de depurar");
      
            
      Materias.forEach(materia -> System.out.println(materia));
       
        System.out.println("\n");
       
       while (recorrido.hasNext()){
            String revisar_materia=recorrido.next();
            
            if (revisar_materia.startsWith("Piloto")){
                recorrido.remove();
                System.out.println(revisar_materia + " fue eliminada");
            }
        }
       
       
       System.out.println("\n Lista consolidada despues de depurar");
       Materias.forEach(materia -> System.out.println(materia));
       
    }
}
