/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estructurasactividad_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lurduy
 */


public class EstructurasActividad_0809 {

    private static void InventarioSemanal(List<String> Frutas)
    {
    Frutas.add("Pera");
    Frutas.add("Manzana");
    Frutas.add("Granadilla");
    }
    
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      List<String> Frutas = new ArrayList<>();
    
      InventarioSemanal(Frutas);
      
      System.out.println("Inventario Inicial");
      Frutas.forEach(Fruta -> System.out.println(Fruta));
      
      List<String> FrutasNuevas = new ArrayList<>();
      
      System.out.println("Inventario adicional");
      
      int bandera = 0;
      while(bandera == 0)
      {
          System.out.println("Ingrese la nueva fruta");
          String Fruta = scanner.nextLine();
          FrutasNuevas.add(Fruta);
          
          System.out.println("si desea ingresar mas frutas digite 0");          
          
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un numero entero (ejemplo: 0). Intente de nuevo:");
                scanner.nextLine(); 
            }

            bandera = scanner.nextInt();

          scanner.nextLine();
      }
      
      System.out.println("Fusionando Inventarios...");
      
      Frutas.addAll(FrutasNuevas);
      
      
      System.out.println("Inventario Final");
      
      Frutas.forEach(Fruta -> System.out.println(Fruta));
    }
}
