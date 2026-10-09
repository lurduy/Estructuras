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
        return products.removeIf(p -> p.getID() == ID);
    }
    
    void MostrarElementos()
    {
        System.out.println("");
        System.out.println("Imprimiendo elementos ...");
       for(Product p : products)
        {
            System.out.println("El elemento con ID " + p.getID() + " nombre " + p.getName() 
                    + " Precio " + p.getPrice() + " Existencia " + p.getExistence() + " Categoria " + p.getCategoria());
            
        } 
       System.out.println("");
    }
    
    
    void BuscarProducto(String Producto)
    {
        boolean encontrado = false;
        String buscado = Producto.trim().toLowerCase();
        for(Product p : products)
        {
            if(p.getName() != null && p.getName().toLowerCase().contains(buscado))
            {
                encontrado = true;
                System.out.println("El producto tiene el ID " + p.getID() + " nombre completo " + p.getName() + " Valor " + p.getPrice() 
                + " categoria " + p.getCategoria() + " con existencia " + p.getExistence());
           }
        }
        if(!encontrado)
        {
            System.out.println("El producto no se encuentra en el inventario");
        }
    }
    
    void ActualizarValorxID(int ID, double Valor)
    {
        for(Product p : products)
        {
            if(p.getID() == ID)
            {
               p.setPrice(Valor);
                System.out.println("Producto Actualizado");
            }
        }
    }
    
    void ActualizarCateroriaxID(int ID, String categoria)
    {
     for(Product p : products)
        {
            if(p.getID() == ID)
            {
               p.setCategoria(categoria);
                System.out.println("Producto Actualizado");
                
            }
        }   
    }
}
