package Trabajos;

	import java.util.Scanner; 
	     /**
	      * A continuacion veremos un ejercicio de tipo escaner
	      * @author Gerardo Morales
	      */
	    public class Clase4_2 {  
	    	/**
	         * Diseñe un método que imprima los datos de una persona ingresados por 
	         * teclado e indicar si es mayor o menor de edad.  
	         */
	       public static void main (String []args){ 
	    	   /**
	    	     * usamos el metodo Scanner y metodo String 
	    	     * primero declaramos las variables
	    	     */ 
	       
	      Scanner Datos = new Scanner(System.in);
	      String nombre = "";  
	      String apellido =""; 
	      int edad = 0;
	   
	       System.out.println("¿Cual es su Nombre? ");//imprime en pantalla 
		   nombre = Datos.nextLine();//se almacena datos de linea en la variable nombre
		   System.out.println("¿Cual es su Apellido?");//imprime en pantalla 
		   apellido = Datos.nextLine();//se almacena datos de linea en variable apellido
		   System.out.println("¿Cual es su Edad?");//imprime en pantalla
		   edad = Datos.nextInt();// se almacena datos de numeros en la variable edad
		   System.out.println("El Nombre del Usuario es " + nombre.toUpperCase() +(" ")+ apellido.toUpperCase());
		   System.out.println(" y su edad es de " + edad + " años." );
		   //se imprime en pantalla con saltos de linea y cambiando a mayusculas los datos ingresados.
		    
		   if(edad <18){ 
		   		System.out.println("El Usuario es menor de edad");  }
		   else{  // imprime en patalla segun condicion if menor de 18 
		   		System.out.println("El Usuario es mayor de edad");  } 
		   	}     // imprime en pantalla segun condicion else mayor de 18
	  
		
	}