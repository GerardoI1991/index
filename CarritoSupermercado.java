
package CarritoSuper;

import java.util.Scanner;

public class CarritoSupermercado {
   
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);  
       
       System.out.println("***************************************");
       System.out.println("*Bienvenido al Supermercado de Gerardo*");
       System.out.println("***************************************");
       System.out.println(""); 
     
       
       System.out.println("Por favor, ingrese un producto a su carrito.."); 
       System.out.println("............................................."); 
       System.out.println("Ingrese el nombre del producto: "); 
       String ProdNombre =   teclado.next();

       System.out.println("Ingrese la cantidad: "); 
       int ProdCantidad = teclado.nextInt();
       
       System.out.println("Ingrese el precio: "); 
       int ProdPrecio = teclado.nextInt();
       
      
       
       System.out.println("Por favor, ingrese un producto a su carrito.."); 
       System.out.println("............................................."); 
       System.out.println("Ingrese el nombre del producto: "); 
       String ProdNombre1 =   teclado.next();

       System.out.println("Ingrese la cantidad: "); 
       int ProdCantidad1 = teclado.nextInt();
       
       System.out.println("Ingrese el precio: "); 
       int ProdPrecio1 = teclado.nextInt();
       
       
       System.out.println("Por favor, ingrese un producto a su carrito.."); 
       System.out.println("............................................."); 
       System.out.println("Ingrese el nombre del producto: "); 
       String ProdNombre2 =   teclado.next();

       System.out.println("Ingrese la cantidad: "); 
       int ProdCantidad2 = teclado.nextInt();
       
       System.out.println("Ingrese el precio: "); 
       int ProdPrecio2 = teclado.nextInt();
       
       Productos comprar = new Productos (ProdNombre1,ProdCantidad1,ProdPrecio1,
               ProdNombre1,ProdCantidad1,ProdPrecio1,ProdNombre1,ProdCantidad1,ProdPrecio1);
       
        
         itemCarrito itemC = new itemCarrito(comprar.ProdNombre, comprar.ProdCantidad, comprar.ProdPrecio,comprar.ProdCantidad*comprar.ProdPrecio);
         System.out.println("Precio sin descuento: " + itemC.ItemCPrecTotal);
         
             
        
        if(itemC.ItemCPrecTotal>1000){
            Descuento compraDesc = new Descuento(
            		itemC.ProdNombre,
            		itemC.ProdCantidad,
            		itemC.ProdPrecio,
            		itemC.ItemCPrecTotal,
            		itemC.ItemCPrecTotal - (itemC.ItemCPrecTotal * 0.10)
            );
            double total = compraDesc.DescuentoDesc;
            System.out.println("...............................");
            System.out.println("Cantidad   Precio Unitario   Producto " );
            System.out.println(  itemC.ProdCantidad + "          " + itemC.ProdPrecio +"             " + itemC.ProdNombre);
            System.out.println(  itemC.ProdCantidad1+ "          " + itemC.ProdPrecio1+"             " + itemC.ProdNombre1);
            System.out.println(  itemC.ProdCantidad2+ "          " + itemC.ProdPrecio2+"             " + itemC.ProdNombre2);
            System.out.println("...............................");
            System.out.println("Total: " + itemC.ItemCPrecTotal);
            System.out.println("..............................."); 
            System.out.println("Descuento del 10%: " + itemC.ItemCPrecTotal * 0.10);
            System.out.println("...............................");
            System.out.println("Total a pagar con descuento: " + total);
            System.out.println("*************************************");
            System.out.println("*GRACIAS POR SU COMPRA VUELVA PRONTO*");
            System.out.println("*************************************");
            
            
        }else{
            System.out.println("...............................");
            System.out.println("Cantidad   Precio Unitario   Producto " );
            System.out.println(  itemC.ProdCantidad + "          " + itemC.ProdPrecio+"             " + itemC.ProdNombre);
            System.out.println(  itemC.ProdCantidad1+ "          "+ itemC.ProdPrecio1+"             " + itemC.ProdNombre1);
            System.out.println(  itemC.ProdCantidad2+ "          "+ itemC.ProdPrecio2+"             " + itemC.ProdNombre2);
            System.out.println("...............................");
            System.out.println("Total: " + itemC.ItemCPrecTotal);
            System.out.println("..............................."); 
            System.out.println("Sin descuento. La compra debe superar los 1000$...");
            System.out.println("*************************************");
            System.out.println("*GRACIAS POR SU COMPRA VUELVA PRONTO*");
            System.out.println("*************************************");
        }
    }
}
 

