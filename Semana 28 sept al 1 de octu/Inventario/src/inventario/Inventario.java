/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventario;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author lurduy
 */
public class Inventario {

    static LinkedList<Product> productos = new LinkedList();
    static Inventory inventario = new Inventory();
    static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opcion = "";
        while(!"0".equals(opcion)){
        mostrarMenu();
        opcion = scanner.nextLine();
            switch(opcion)
            {
                case "1":
                    añadirProducto();
                 break;
                case "2":
                    EliminarProducto();
                    break;
                case "3":
                    inventario.MostrarElementos();
                    break;
                case "4":
                    BuscarProducto();
                    break;
                case"5":
                    ActualizaValor();
                    break;
                case "6":
                    CambiaCategoriaxID();
                    break;
                case "7":
                    ActualizaExistencia();
                    break;
                default:
                    System.out.println("Seleccione una opción Valida");
                    break;
            }
        }
    }
 
    public static void mostrarMenu()
    {
        System.out.println("Bienvenido al sistema de Inventario seleccione una opcion");
        System.out.println("1. Para ingresar un nuevo producto al inventario");
        System.out.println("2. Para eliminar un producto del inventario");
        System.out.println("3. Para mostrar el inventario");
        System.out.println("4. Buscar Producto");
        System.out.println("5. Actualizar Precio de un producto");
        System.out.println("6. Cambiar la categoria de un producto");
        System.out.println("7. Actualizar la existencia de un producto");
        System.out.println("0. Para Salir del inventario");
    }
    
    private static void añadirProducto()
    {
        System.out.println("Ingrese El ID del producto");
        Product producto = new Product();
        Boolean Exist = true;
        int id = 0;
        while(Exist){
            id = leerEntero();
            Exist = inventario.ExistID(id);
            if(Exist)
            {
                System.out.println("El ID ya esta siendo usado, intenta de nuevo");
            }
        }
        producto.setID(id);
        
        
        System.out.println("Ingrese el nombre del producto"); 
        String nombre = scanner.nextLine();
        producto.setName(nombre);
        
        System.out.println("Ingrese el valor del producto");
        
        producto.setPrice(leerDouble());
        
        System.out.println("Ingrese la existencia del producto");
        producto.setExistence(leerEntero());
        
        System.out.println("Ingrese la categoria del producto");
        producto.setCategoria(scanner.nextLine());
        
        
        inventario.AddProduct(producto);
    }
    
    
    private static void EliminarProducto()
    {
        System.out.println("Ingrese el Id a borrar");
        
        int id = leerEntero();
        
        if(inventario.EliminarByID(id))
        {
            System.out.println("El producto ha sido eliminado");
        }
        else
        {
            System.out.println("El ID indicado no existe en el catalogo");
        }
    }
    
    private static int leerEntero()
    {
        while (true) {
            try {
                int n = Integer.parseInt(scanner.nextLine().trim());
                if (n >= 0) {
                    return n;
                }
                System.out.println("El valor no puede ser negativo.");
            } catch (NumberFormatException e) {
                System.out.println("Eso no es un número entero válido.");
            }
            System.out.print("Intenta de nuevo: ");
        }
    }
    
    private static double leerDouble()
    {
        while (true) {
            try {
                double n = Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));
                if (n >= 0) {
                    return n;
                }
                System.out.println("El valor no puede ser negativo.");
            } catch (NumberFormatException e) {
                System.out.println("Eso no es un número válido.");
            }
            System.out.print("Intenta de nuevo: ");
        }
    }
    
    
    private static void BuscarProducto()
    {
        System.out.println("Digite el producto a buscar?");
        String Producto = scanner.nextLine();
        inventario.BuscarProducto(Producto);
    }
    
    private static void ActualizaValor()
    {
        System.out.println("Digite el id del producto a actualizar");
        
        int id = leerEntero();
        
        if(inventario.ExistID(id))
        {
            System.out.println("Digite el valor correspondiente");
            inventario.ActualizarValorxID(id, leerDouble());
            inventario.MostrarElementos();
        }
        else
        {
            System.out.println("El ID indicado no existe en el catalogo");
        }
    }
    
    private static void CambiaCategoriaxID()
    {
        System.out.println("Digite el ID del producto a actualizar");
        
        int id = leerEntero();
         if(inventario.ExistID(id))
        {
            System.out.println("Digite la nueva categoria");
            String categoria = scanner.nextLine();
            inventario.ActualizarCateroriaxID(id, categoria);
            inventario.MostrarElementos();
        }
        else
        {
            System.out.println("El ID indicado no existe en el catalogo");
        }
        
    }
    private static void ActualizaExistencia()
    {
        System.out.println("Digite el ID del producto a actualizar");
        int id = leerEntero();
        
        if(inventario.ExistID(id))
        {
            System.out.println("Digite la nueva existencia");
            inventario.ActualizarExistenciaxID(id, leerEntero());
            inventario.MostrarElementos();
        }
        else
        {
            System.out.println("El producto no existe");
        }
    }
    
    public static void ClassAntigua()
    {
        Product p1 = new Product();
        p1.setID(1);
        p1.setExistence(45);
        p1.setName("Papa Criolla");
        p1.setPrice((double)25000);
        productos.add(p1);
        
        //Product p2 = new Product(2, 25,"Papa Pastusa", (double)15000);
        //productos.add(p2);
        //Product p3 = new Product(3, 5,"salchipapa", (double)5000);
        //productos.add(p3);
        //Product p4 = new Product(4, 1,"empanada", (double)3200);
        //productos.add(p4);
        //Product p5 = new Product(5, 100,"gaseosa", (double)3500);
        //productos.add(p5);
        
        //System.out.println("El producto con ID 1 es " + p1.MostrarInfo());
        //System.out.println("El producto con ID 2 es " + p2.MostrarInfo());
        //System.out.println("El producto con ID 3 es " + p3.MostrarInfo());
        //System.out.println("El producto con ID 4 es " + p4.MostrarInfo());
        //System.out.println("El producto con ID 5 es " + p5.MostrarInfo());
        
        //p1.setPrice(14500.00);
        
        System.out.println("El producto con ID 1 es " + p1.MostrarInfo());
    }
    
}
