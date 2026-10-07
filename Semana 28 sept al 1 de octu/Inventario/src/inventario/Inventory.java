/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

import java.util.LinkedList;

/**
 *
 * @author lurduy
 */
public class Inventory {
    
    private LinkedList<Product> products;
    public Inventory()
    {
        products = new LinkedList <>();
    }
    void AddProduct(Product producto) {
        products.add(producto);
    }
    
    boolean ExistID(int ID)
    {
        for(Product p : products)
        {
            if(p.getID() == ID)
            {
                return true;
            }
        }
        return false;
    }
    
    boolean EliminarByID(int ID)
    {
        for(Product p : products)
        {
            if(p.getID() == ID)
            {
                products.remove(p);
                return true;
            }
        }
        return false;
    }
    
    void MostrarElementos()
    {
        System.out.println("");
        System.out.println("Imprimiendo elementos ...");
       for(Product p : products)
        {
            System.out.println("El elemento con ID " + p.getID() + " nombre " + p.getName() 
                    + " Precio " + p.getPrice() + " Existencia " + p.getExistence());
            
        } 
       System.out.println("");
    }
    
}
