/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author lurduy
 */
public class Product {
    
    private int Existence;
    private int ID;
    private String name;
    private Double Price;
    
    public Product(){
        
    }
    
    public Product(int ID, int Existence, String name, Double Price)
    {
        this.ID = ID;
        this.Existence = Existence;
        this.name = name;
        this.Price = Price;
    }
    
    public void setID(int ID)
    {
        this.ID = ID;
    }    
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPrice(Double Price){
        this.Price = Price;
    }
    public void setExistence(int Existence){
        this.Existence = Existence;
    }
    public void getID(int ID)
    {
        this.ID = ID;
    }    
    public void getName(String name)
    {
        this.name = name;
    }
    public void getPrice(Double Price){
        this.Price = Price;
    }
    public void getExistence(int Existence){
        this.Existence = Existence;
    }
    
    public String MostrarInfo()
    {
        return "El Producto " + this.name + " con el ID " + this.ID + " Tiene " + this.Existence + " en inventario; y su costo es  " + this.Price ;
    }
}
