/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clases;

/**
 *
 * @author lurduy
 */
public class Clases {
    
    public static void main(String[] args) {
        Animal a1 = new Animal("Firulais", "Perro", 3, "Guau Guau");
        a1.mostrarInformacion();
        a1.mostrarSonido();


        Animal a2 = new Animal("Michi", "Gato", 2, "Miau Miau");
        a2.mostrarInformacion();
        a2.mostrarSonido(); 

        Animal a3 = new Animal("Paco", "Loro", 1, "Hola Hola");
        a3.mostrarInformacion();
        a3.mostrarSonido();

        Animal a4 = new Animal("Nemo", "Pez", 1, "Blub Blub");
        a4.mostrarInformacion();
        a4.mostrarSonido();

        Animal a5 = new Animal("Dumbo", "Elefante", 5, "Barrito");
        a5.mostrarInformacion();
        a5.mostrarSonido();
    }
}
