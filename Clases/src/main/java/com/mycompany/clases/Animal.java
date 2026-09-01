/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clases;

/**
 *
 * @author lurduy
 */
public class Animal {
    String nombre;
    String especie;
    int edad;
    String sonido;
    Animal siguiente;
    
    public Animal(String nombre, String especie, int edad, String sonido)
    {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.sonido = sonido;        
    }
    
    void mostrarInformacion()
    {
        System.out.println("El animal se llama: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad); 
    }
    
    void mostrarSonido()
    {
         System.out.println("El sonido del animal es: " + sonido);
    }
}
