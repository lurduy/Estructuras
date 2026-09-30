/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventario;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author lurduy
 */
public class Inventario {

    static LinkedList<Product> productos = new LinkedList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setID(1);
        p1.setExistence(45);
        p1.setName("Papa Criolla");
        p1.setPrice((double)25000);
        productos.add(p1);
        
        Product p2 = new Product(2, 25,"Papa Pastusa", (double)15000);
        productos.add(p2);
        Product p3 = new Product(3, 5,"salchipapa", (double)5000);
        productos.add(p3);
        Product p4 = new Product(4, 1,"empanada", (double)3200);
        productos.add(p4);
        Product p5 = new Product(5, 100,"gaseosa", (double)3500);
        productos.add(p5);
        
        System.out.println("El producto con ID 1 es " + p1.MostrarInfo());
        System.out.println("El producto con ID 2 es " + p2.MostrarInfo());
        System.out.println("El producto con ID 3 es " + p3.MostrarInfo());
        System.out.println("El producto con ID 4 es " + p4.MostrarInfo());
        System.out.println("El producto con ID 5 es " + p5.MostrarInfo());
        
        p1.setPrice(14500.00);
        
        System.out.println("El producto con ID 1 es " + p1.MostrarInfo());
    }
    
}
