package conexion.clinica;

   
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
    import java.util.InputMismatchException;
    import java.util.Scanner;
	import java.util.logging.Level;
	import java.util.logging.Logger;

	
	public class ClinicaDelSol {
	    Connection conexion = null;
	    Statement sentencia = null; 

	   
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ClinicaDelSol m = new ClinicaDelSol();
	        m.conectar();    
	        boolean salir = false;
	        boolean continua;
	        
	 	   do {
	            try {
	 	   continua = false;
	        
	        
	        
	            switch (menuPrin()) {
	            	case 1:
	            		m.consultarTablaPacientes();  
	            		break;
	            	case 2:
	            		m.agregarTablaPacientes();    
	            		break;
	            	case 3:
	            		m.eliminarRegistoPaciente(); 
	            		break;
	            	case 4:
	            		m.consultarTablaMedicos();  
	            		break;
	            	case 5:
	            		m.agregarTablaMedicos();    
	            		break;
	            	case 6:
	            		m.eliminarRegistoMedicos(); 
	                case 0:
	                    System.out.println("Cerrando Sistema");
	                    m.desconectar();              
	                    salir = true;
	                    break;
	                default:
	                    System.out.println("Opción incorrecta");
	                    break;
	            }
	          
	    
	 	  } catch (InputMismatchException ex) {
	 		   System.out.println("Debe ingresar obligatoriamente un número de las Opciones.");
	 		   sc.next(); 
	 		   continua = true;}
	 		   } while (!salir);}
	    
	    
	       
	    private static int menuPrin() {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("**********************************");
            System.out.println("* BIENVENIDOS A CLINICA DEL SOL  *");
            System.out.println("**********************************");
	        System.out.println("---------------------------------------");
	        System.out.println("Conexión Base de datos CLINICA DEL SOL ");
	        System.out.println("---------------------------------------");
	        System.out.println("1.MOSTRAR EL CONTENIDO DE LA TABLA PACIENTES");
	        System.out.println("2.INSERTAR UN REGISTRO EN LA TABLA PACIENTES");  
	        System.out.println("3.ELIMINAR UN REGISTRO EN LA TABLA PACIENTES");
	        System.out.println("4.MOSTRAR EL CONTENIDO DE LA TABLA MEDICOS");
	        System.out.println("5.INSERTAR UN REGISTRO EN LA TABLA MEDICOS");  
	        System.out.println("6.ELIMINAR UN REGISTRO EN LA TABLA MEDICOS");
	        System.out.println("0.SALIR");
	        System.out.println("\n Por favor, escoja una opción.");
	        System.out.println("--------------------------------");

	        return sc.nextInt();

	    }

	
	    public void conectar() {
	        try {
	            Class.forName("com.mysql.jdbc.Driver"); 
	             conexion = DriverManager.getConnection("jdbc:mysql://localhost/consultorioclinicadelsol", "root","Vacano@1991");
	            
	            System.out.println("**************************************");
	            System.out.println("*  CONEXIÓN REALIZADA CORRECTAMENTE  *");
	            System.out.println("**************************************");
	        } catch (Exception e) {
	            System.out.println("*****************************************");
	            System.out.println(" * NO SE HA PODIDO REALIZAR LA CONEXIÓN * ");
	            System.out.println("*****************************************");
	        }

	    }
	    private void desconectar() {
	        try {
	            conexion.close(); 
	            System.out.println("****************************************************");
	            System.out.println("*  La conexion a la base de datos se ha terminado  *");
	            System.out.println("****************************************************");
	            System.out.println("*******GRACIAS POR UTILIZAR BASE DE DATOS***********");
	            System.out.println("****************CLINICA DEL SOL*********************");
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	        }

	    }
        ///////////////////////PACIENTES/////////////
	        private void consultarTablaPacientes() {
	       
	        ResultSet r = buscar("select PacDNI,PacNom,PacDom from pacientes"); 
	        try {
	            System.out.println("REGISTROS DE LA TABLA PACIENTES");
	           
	            while (r.next()) {
	                
	                System.out.println
	                (r.getInt("PacDNI") + " | " + r.getString("PacNom") + " | " + r.getString("PacDom"));
	            }
	        } catch (SQLException ex) {
	      
	        } }  
	        
	    ResultSet buscar(String sql) {
	        try {
	            sentencia = conexion.createStatement(); 
	           
	            return sentencia.executeQuery(sql); 
	        } catch (SQLException ex) {
	            Logger.getLogger(ClinicaDelSol.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return null;
	        }
      
	        private void agregarTablaPacientes() {
	        	String usuario="root";
	            String password="Vacano@1991";
	            Scanner sc = new Scanner(System.in);
	            
	            System.out.println("Escriba el DNI del Paciente: ");
	            int PacDNI  = sc.nextInt(); 
	            
	            System.out.println("Ingrese el nombre del Paciente:  ");
	            String PacNom = sc.next(); 
	            System.out.println("Ingrese el Domicilio del Paciente:  ");
	            String PacDom = sc.next(); 
	                    
	            String sql = "insert into pacientes (PacDNI,PacNom,PacDom) values ('"+PacDNI+"','"+PacNom+"','"+PacDom+"')";
	            Connection con=null;
	                try{
	            
	           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/consultorioclinicadelsol", usuario, password);  
	           Statement sentencia = con.createStatement();    
	           int m = sentencia.executeUpdate(sql); 
	             if (m == 1)
	                 System.out.println("Se realizo correctamente la insercion : "+sql);
	             else
	                 System.out.println("fallo la insercion");
	          con.close(); 
	        }
	        catch(Exception e)
	        {
	           e.printStackTrace();
	        }
	    }
	            private void eliminarRegistoPaciente() {
	            	String usuario="root";
	                String password="Vacano@1991";
	                Scanner sc = new Scanner(System.in);

	                System.out.println("Escriba el DNI del Paciente a eliminar:...");
	                int PacDNI  = sc.nextInt();
	                
	                String sql ="DELETE FROM pacientes WHERE PacDNI = '"+PacDNI+"'";
	                Connection con=null;
	                
	                try {
	                	    
	                	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/consultorioclinicadelsol", usuario, password);  
	                    Statement sentencia = conexion.createStatement();
	                    sentencia.execute(sql);   
	                    System.out.println("El registro se elimino!!");
	                } catch (Exception e) {  
	                  e.printStackTrace();
	                  System.out.println("Error en el borrado del registro!!");
	                }
	              }
	            ///////////////////////MEDICOS/////////////
	            private void consultarTablaMedicos() {
	     	       
	    	        ResultSet r = buscar("select MedMat,MedNom,MedEsp from medicos"); 
	    	        try {
	    	            System.out.println("REGISTROS DE LA TABLA MEDICOS");
	    	           
	    	            while (r.next()) {
	    	                
	    	                System.out.println
	    	                (r.getInt("MedMat") + " | " + r.getString("MedNom") + " | " + r.getString("MedEsp"));
	    	            }
	    	        } catch (SQLException ex) {
	    	      
	    	        } }  
	    	        
	    	    ResultSet buscar1(String sqlm) {
	    	        try {
	    	            sentencia = conexion.createStatement(); 
	    	           
	    	            return sentencia.executeQuery(sqlm); 
	    	        } catch (SQLException ex) {
	    	            Logger.getLogger(ClinicaDelSol.class.getName()).log(Level.SEVERE, null, ex);
	    	        }
	    	        return null;
	    	        }
	    	    
	    	        private void agregarTablaMedicos() {
	    	        	String usuario="root";
	    	            String password="Vacano@1991";
	    	            Scanner sc = new Scanner(System.in);
	    	            
	    	            System.out.println("Escriba La Matricula Del Medico: ");
	    	            int MedMat  = sc.nextInt(); 
	    	            
	    	            System.out.println("Ingrese el nombre del Medico:  ");
	    	            String MedNom = sc.next(); 
	    	            System.out.println("Ingrese la Especialidad del Medico:  ");
	    	            String MedEsp = sc.next(); 
	    	                    
	    	            String sqlm = "insert into medicos (MedMat,MedNom,MedEsp) values ('"+MedMat+"','"+MedNom+"','"+MedEsp+"')";
	    	            Connection con=null;
	    	                try{
	    	            
	    	           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/consultorioclinicadelsol", usuario, password);  
	    	           Statement sentencia = con.createStatement();    
	    	           int m = sentencia.executeUpdate(sqlm); 
	    	             if (m == 1)
	    	                 System.out.println("Se realizo correctamente la insercion : "+sqlm);
	    	             else
	    	                 System.out.println("fallo la insercion");
	    	          con.close(); 
	    	        }
	    	        catch(Exception e)
	    	        {
	    	           e.printStackTrace();
	    	        }
	    	    }
	    	            private void eliminarRegistoMedicos() {
	    	            	String usuario="root";
	    	                String password="Vacano@1991";
	    	                Scanner sc = new Scanner(System.in);

	    	                System.out.println("Escriba la Matricula del Medico a eliminar:...");
	    	                int MedMat  = sc.nextInt();
	    	                
	    	                String sqlm ="DELETE FROM medicos WHERE MetMat = '"+MedMat+"'";
	    	                Connection con=null;
	    	                
	    	                try {
	    	                	    
	    	                	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/consultorioclinicadelsol", usuario, password);  
	    	                    Statement sentencia = conexion.createStatement();
	    	                    sentencia.execute(sqlm);   
	    	                    System.out.println("El registro se elimino!!");
	    	                } catch (Exception e) {  
	    	                  e.printStackTrace();
	    	                  System.out.println("Error en el borrado del registro!!");
	    	                }
	    	              }
	
	}