/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RegistroEstudiantes;

import java.util.*;

/**
 *
 * @author lurduy
 */
public class RegistroEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector<String> estudiantes = new Vector<>(4);
        estudiantes.add("Ana");
        estudiantes.add("Luis");
        estudiantes.add("Sara");
        System.out.println(estudiantes);
        
        
        String[] arreglo = {"Ana", "Luis", "Sara"};
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        
        System.out.println("comparativa ...");
        System.out.println("largo del arreglo " + arreglo.length);
        System.out.println("Largo del vector " + estudiantes.size());
        System.out.println("Vector elemento 1 " + estudiantes.get(1));
        System.out.println("Arreglo elemento 1 " + arreglo[1]);
        
        if(arreglo.length > 3){
            arreglo[3] = "pedro";
            System.out.println("Asignando");
        }
        
        //estudiantes.set(3, "Pedro");
        
        System.out.println("Datos del Vector");
        System.out.println("Tamaño " + estudiantes.size());
        System.out.println("Capacidad " + estudiantes.capacity());
        
        estudiantes.add("Pedro");
        
        Vector<String> v = new Vector<>(2);
        v.add("Ana"); v.add("Luis"); v.add("Sara");
        System.out.println("Tamaño del vector " + v.size());
        System.out.println("Capacidad del vector "+ v.capacity());
        
        Vector<String> Example = new Vector<>(10);
        
        Example.add("Ejemplo");
        Example.add("Ejemplo 2");
        Example.add("Otro ejemplo");
        Example.add("Paula");
        Example.add("Majo");
        Example.add("Eloisa");
        Example.add("Jose");
        
        for(int i = 0; i < Example.size(); i++)
        {
            System.out.println("Elemento " + i + " " + Example.get(i));
        }
        
        
        System.out.println(Example.get(0));
        Example.set(1, "Sara");
        Example.remove(0);
        for(int i = 0; i < Example.size(); i++)
        {
            System.out.println("Elemento " + i + " " + Example.get(i));
        }
        System.out.println("Tamaño del vector de ejemplo "+ Example.size());
        System.out.println("Capacidad del vector de ejemplo " + Example.capacity());
    }
    
}
