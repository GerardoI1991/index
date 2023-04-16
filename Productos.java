
package CarritoSuper;

public class Productos {
   
    String ProdNombre;  
    int ProdCantidad;    
    double ProdPrecio;

    
    String ProdNombre1;  
    int ProdCantidad1;    
    double ProdPrecio1;
    
    String ProdNombre2;  
    int ProdCantidad2;    
    double ProdPrecio2;
    
    public Productos(String ProdNombre, int ProdCantidad, double ProdPrecio,
                     String ProdNombre1,int ProdCantidad1, double ProdPrecio1,
                     String ProdNombre2, int ProdCantidad2, double ProdPrecio2){ 
        
        this.ProdNombre = ProdNombre; 
        this.ProdCantidad= ProdCantidad; 
        this.ProdPrecio = ProdPrecio;
        this.ProdNombre1 = ProdNombre1; 
        this.ProdCantidad1= ProdCantidad1; 
        this.ProdPrecio1 = ProdPrecio1;
        this.ProdNombre2 = ProdNombre2; 
        this.ProdCantidad2= ProdCantidad2; 
        this.ProdPrecio2 = ProdPrecio2;
        
    }
}



class itemCarrito extends Productos{   
    double ItemCPrecTotal; 
    
    
        public itemCarrito(String ProdNombre, int ProdCantidad, double ProdPrecio, double ItemCPrecTotal,
                String ProdNombre1, int ProdCantidad1, double ProdPrecio1,
                String ProdNombre2, int ProdCantidad2, double ProdPrecio2){

        super(ProdNombre, ProdCantidad, ProdPrecio,
              ProdNombre, ProdCantidad, ProdPrecio,
              ProdNombre, ProdCantidad, ProdPrecio);  
        this.ItemCPrecTotal =  ItemCPrecTotal;  		   
    }

}


class Descuento extends itemCarrito { 
    double DescuentoDesc;  

     
    public Descuento(String ProdNombre, int ProdCantidad, double ProdPrecio, double ItemCPrecTotal, double DescuentoDesc,
            String ProdNombre1, int ProdCantidad1, double ProdPrecio1,
            String ProdNombre2, int ProdCantidad2, double ProdPrecio2){
        super(ProdNombre,ProdCantidad,ProdPrecio,ItemCPrecTotal,
                ProdNombre, ProdCantidad, ProdPrecio,
              ProdNombre, ProdCantidad, ProdPrecio);
        this.DescuentoDesc = DescuentoDesc;
    }


}


