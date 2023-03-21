import java.util.Scanner; 
	     /**
	      * A continuacion veremos un ejercicio de tipo escaner
	      * @author Gerardo Morales
	      */
	    public class Clase4_3 {  
	    	/**
	         * En un supermercado se hace un 20% de descuento a los clientes cuya compra 
	         * supere los 1000$ en las áreas de frutas, verduras y gaseosas. 
	         * ¿ Cual será el total que pagara una persona por su compra ?, 
	         * se debe mostrar el nombre del cliente , producto, precio , cantidad , 
	         * descuento y total a pagar. 
	         */
	       public static void main (String []args){ 
	    	   /**
	    	     * usamos el metodo Scanner y metodo String 
	    	     * primero declaramos las variables
	    	     */ 
	       
	      Scanner Datos = new Scanner(System.in);
	      String nombre = ""; 
	      int verduras = 0;
	      int frutas = 0;
	      int gaseosas =0;
	      int verduras1 =0;
	      int frutas1 = 0;
	      int gaseosas1 =0;
	      double total = 0;
	      int cantidad =0;
	      
	      double totalcdes = 0; // agregamos una variable que almacene la diferencia entre el precio total y el desc 
	      
	      System.out.println("***************************************");
	      System.out.println("*Bienvenido al Supermercado de Gerardo*");
	      System.out.println("***************************************");
	      System.out.println(""); 
	      System.out.println("");
	      
	      
	      System.out.println("¿Cual es su Nombre y Apellido? ");//imprime en pantalla 
	      nombre = Datos.nextLine();//se almacena datos de linea en la variable nombre
		   
	      
              System.out.println("lista disponible");
              String verdurass[]={"lechugas", "Espinaca","Acelga"};
	      double preciosV[]={20,100,40};{
              for (int i=0;i<verdurass.length;i++){
	      System.out.println(""+ verdurass[i]+" Precio: $" + preciosV[i]);}
		 
	      System.out.println("¿Que Verdura desea; ingrese el presio?: ");
	      verduras = Datos.nextInt();
	      System.out.println("indique la cantidad que desea llevar: ");
	      verduras1 = Datos.nextInt(); 
		   
		   
	      System.out.println("lista disponible");
	      String frutass[]={"Naranja", "Manzana","Banana"};
	      double preciosF[]={30,10,40};{
	      for (int i=0;i<frutass.length;i++){
	      System.out.println("" + frutass[i]+ " Precio: $"+ preciosF[i]);}
			
	      System.out.println("¿Que Fruta desea; ingrese el presio?: ");
	      frutas = Datos.nextInt();
	      System.out.println("indique la cantidad que desea llevar: ");
	      frutas1 = Datos.nextInt();
		   
             
	      System.out.println("lista disponible");
	      String gaseosass[]={"Gaseosa Cola", "Gaseosa Lima","Gaseosa Naranja"};
	      double precios[]={200,300,100};{
              for (int i=0;i<gaseosass.length;i++){
	      System.out.println("" + gaseosass[i]+ " Precio: $"+ precios[i]);}
		     
              System.out.println("¿Que Gaseosas desea; ingrese el presio?: ");
	      gaseosas = Datos.nextInt();
	      System.out.println("indique la cantidad que desea llevar: ");
	      gaseosas1 = Datos.nextInt();
	      System.out.println("");
		   
		  
	     total = ((verduras*verduras1)+(frutas* frutas1)+(gaseosas*gaseosas1));
	     cantidad = (verduras1+frutas1+gaseosas1);

	     System.out.println(""+ nombre.toUpperCase()+ " Cantidad de productos "+cantidad+ " TOTAL a paga: $"+total+"");
	     System.out.println("Por compra mayor a $1000 recibira decuento 20%");
		   
	     if(total > 1000 ){
	     System.out.println("" + nombre.toUpperCase()+" Tiene decuento del 20% $"+((total * 20)/ 100));
	     totalcdes= total - (total*0.20); // aca usamos la variable nueva, para almacenar la diferencia 
	     System.out.println("" + nombre.toUpperCase()+" El importe a pagar es: $"+ totalcdes); // luego la imprimimos
	     } else{
	     System.out.println("" + nombre.toUpperCase()+ " No tiene descuento del 20% "+total);
}}}}}}
	       
		 	