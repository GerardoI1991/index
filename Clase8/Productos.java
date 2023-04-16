
package CarritoSuper;

public class Productos {
   

    String ProdNombre;  
    int ProdCantidad;    
    double ProdPrecio;

    public Productos(String ProdNombre, int ProdCantidad, double ProdPrecio){  
        this.ProdNombre = ProdNombre; 
        this.ProdCantidad= ProdCantidad; 
        this.ProdPrecio = ProdPrecio;
    }
}


class itemCarrito extends Productos{   
    double ItemCPrecTotal; 
    
  
        public itemCarrito(String ProdNombre, int ProdCantidad, double ProdPrecio, double ItemCPrecTotal){

        super(ProdNombre, ProdCantidad, ProdPrecio);  
        this.ItemCPrecTotal =  ItemCPrecTotal;  		   
    }

}



class Descuento extends itemCarrito { 
    double DescuentoDesc;  


    
    public Descuento(String ProdNombre, int ProdCantidad, double ProdPrecio, double ItemCPrecTotal, double DescuentoDesc){
        super(ProdNombre,ProdCantidad,ProdPrecio,ItemCPrecTotal);
        this.DescuentoDesc = DescuentoDesc;
    }


}