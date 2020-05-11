
package Clases;

import javax.swing.JOptionPane;
import java.sql.Connection;      
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/** 
 *
 * @author Luis Carlos
 */
public class Conexion {
    


/**
 *  Variable global conexión de tipo Connection, ésta variable tiene la función
 *  de recibir el estado de la conexión a la base de datos, para dicha conexión 
 *  se da mediente el Driver JDBC y las credenciales para el acceso a la base de 
 *  datos, como lo es el usuario y la contraseña
 **/
    
    
/**
 * También se hace el uso de excepciones SQL para dicha conexión, éstas son para
 * el caso de que hayan errores y estos sean atrapados por las excepciones y así
 * el aplicativo no tenga fallas que conlleven a finalizar su ejecución
 **/    
    
public static Connection conexion = null;    
    
    
 public Connection conectar() throws ClassNotFoundException{
     
     try{
         
         Class.forName("com.mysql.jdbc.Driver");
         
        conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:33067/reparacionesmejia","root","");
         
     }catch(SQLException e){
      
         JOptionPane.showMessageDialog(null, "Error al establecer la conexión: "+e.getMessage());
     }
     
     return conexion;
     
 }
 
 
 /**
  * 
  **/
 
 public void mensajeErrorSQL(SQLException e){
     
     JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
 }
 
    
 public boolean agregarVehiculo(Vehiculo datos)throws ClassNotFoundException{
     
     boolean agregado = false;
     
     try{
         
         PreparedStatement ps;
         Connection con = conectar();
      
         ps = con.prepareStatement("INSERT INTO vehiculo (numInterno,placa,modelo,cilindraje) VALUES (?,?,?,?)");
         
         ps.setInt(1, datos.getNumeroInterno());
         ps.setString(2, datos.getPlaca());
         ps.setInt(3, datos.getModelo());
         ps.setInt(4, datos.getCilindraje());
         
         ps.executeUpdate();
         
         agregado = true;
         
         con.close();
         
     }catch(SQLException e){
         mensajeErrorSQL(e);
     }
     
     
     
     return agregado;
 }
 
 
 public Vehiculo buscarVehiculo(String placa)throws ClassNotFoundException{
     
     Vehiculo aux = new Vehiculo();
     
     try{
         
         ResultSet rs;
         PreparedStatement ps;
         Connection con = conectar();
         
         ps = con.prepareStatement("SELECT *FROM vehiculo WHERE placa=?");
         
         ps.setString(1, placa);
         
         rs = ps.executeQuery();
         
         while(rs.next()){
         aux.setNumeroInterno(Integer.parseInt(rs.getString("numInterno")));
         aux.setPlaca(rs.getString("placa"));
         aux.setModelo(Integer.parseInt(rs.getString("modelo")));
         aux.setCilindraje(Integer.parseInt(rs.getString("cilindraje")));
        }
         
         con.close();
         
     }catch(SQLException e){
         mensajeErrorSQL(e);
     }
     
     return aux;
 }
 
 
 public Vehiculo buscarVehiculo(int numInterno)throws ClassNotFoundException{
     
     Vehiculo aux = new Vehiculo();
     
     try{
         
         ResultSet rs;
         PreparedStatement ps;
         Connection con = conectar();
         
         ps = con.prepareStatement("SELECT *FROM vehiculo WHERE numInterno=?");
         
         ps.setInt(1, numInterno);
         
         rs = ps.executeQuery();
         
         
        while(rs.next()){
            aux.setNumeroInterno(Integer.parseInt(rs.getString("numInterno")));
            aux.setPlaca(rs.getString("placa"));
            aux.setModelo(Integer.parseInt(rs.getString("modelo")));
            aux.setCilindraje(Integer.parseInt(rs.getString("cilindraje")));
        } 
         
        
         
         con.close();
         
     }catch(SQLException e){
         mensajeErrorSQL(e);
     }
     
     return aux;
 }
 
 
 
 
 public boolean editarTodosDatos(Vehiculo nuevos, int numInterno)throws ClassNotFoundException{
     
     boolean actualizado = false;
     
     try{
         
         PreparedStatement ps;
         Connection con = conectar();
         
         ps = con.prepareStatement("UPDATE vehiculo SET numInterno=?,placa=?,modelo=?,cilindraje=? WHERE numInterno=?");
         
         ps.setInt(1, nuevos.getNumeroInterno());
         ps.setString(2, nuevos.getPlaca());
         ps.setInt(3, nuevos.getModelo());
         ps.setInt(4, nuevos.getCilindraje());
         ps.setInt(5, numInterno);
         
         ps.executeUpdate();
         
         actualizado = true;
         
         JOptionPane.showMessageDialog(null, "Se han actualizado los datos exitosamente");
         
         con.close();
         
     }catch(SQLException e){
         mensajeErrorSQL(e);
     }
     
     return actualizado;
 }
 
 
 
public ResultSet obtenerDatosTodos()throws ClassNotFoundException{
    
    ResultSet rs = null;
    PreparedStatement ps;
    Connection con = conectar();
    
    try{
        
        ps = con.prepareStatement("SELECT *FROM vehiculo");
        rs = ps.executeQuery();
        
        
    }catch(SQLException e){
        mensajeErrorSQL(e);
    }
    return rs;
} 
 

public void eliminarRegistro(int numInterno)throws ClassNotFoundException{
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("DELETE FROM vehiculo WHERE numInterno=?");
        
        ps.setInt(1, numInterno);
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Se ha eliminado el registro");
        
        con.close();
        
    }catch(SQLException e){
        mensajeErrorSQL(e);
    }
    
}

 

public void guardarCategoria(String nueva)throws ClassNotFoundException{
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("INSERT INTO reparaciones (categoria) VALUES(?)");
        
        ps.setString(1, nueva);
        
        ps.executeUpdate();
        ps.close();
                
        JOptionPane.showMessageDialog(null, "Registro de categoria exitoso");
        
    }catch(SQLException e){
        mensajeErrorSQL(e);
    }
    
}


public void editarCategoria(String nuevo, int ide)throws ClassNotFoundException{
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("UPDATE reparaciones SET categoria=? WHERE ideCategoria=?");
        
        ps.setString(1, nuevo);
        ps.setInt(2, ide);
    
        ps.executeUpdate();
        ps.close();
        
        JOptionPane.showMessageDialog(null, "Se ha realizado el cambio exitosamente");
        
    }catch(SQLException e){
     mensajeErrorSQL(e);   
    }
    
}


public String buscarIdeCategoria(int ide)throws ClassNotFoundException{
   
    String categoria = "";
    
    try{
        Connection con = conectar();
        PreparedStatement ps;
        ResultSet rs;

        ps = con.prepareStatement("SELECT *FROM reparaciones WHERE ideCategoria=?");
        ps.setInt(1, ide);
        rs = ps.executeQuery();
        
        while(rs.next()){
            categoria = rs.getString("categoria");
        }
        
        ps.close();
        
    }catch(SQLException e){
     mensajeErrorSQL(e);   
    }
 
    return categoria;
}


public void eliminarCategoria(int ide)throws ClassNotFoundException{
    
    try{
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("DELETE FROM reparaciones WHERE ideCategoria=?");
        ps.setInt(1, ide);
        ps.executeUpdate();
        ps.close();
        
        JOptionPane.showMessageDialog(null, "Se ha eliminado el registro");
        
    }catch(SQLException e){
        mensajeErrorSQL(e);
    }
}


public ResultSet obtenerDatosCategorias()throws ClassNotFoundException{
    
    ResultSet rs = null;
    Connection con = conectar();
    PreparedStatement ps;
    
    try{
        
        ps = con.prepareStatement("SELECT *FROM reparaciones");
        rs = ps.executeQuery();
        
        
    }catch(SQLException e){
        mensajeErrorSQL(e);
    }
    
    return rs;
}


public void agregarUsuario(int user, String passwd, boolean role)throws ClassNotFoundException{
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("INSERT INTO usuario (userName,password,role) VALUES(?,?,?)");
        
        ps.setInt(1, user);
        ps.setString(2, passwd);
        ps.setBoolean(3, role);
        
        ps.executeUpdate();
        ps.close();
        
        JOptionPane.showMessageDialog(null, "Se ha creado el usuario con exito");
        
    }catch(SQLException e){
          mensajeErrorSQL(e);       
    }
        
    
}


public ResultSet buscarUsuario(int user)throws ClassNotFoundException{
    
    ResultSet rs = null; 
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("SELECT *FROM usuario WHERE userName=?");
        
        ps.setInt(1, user);
        
        rs = ps.executeQuery();
        
    }catch(SQLException e){
        mensajeErrorSQL(e); 
    }
    
    return rs;
}


public void cambiarContrasenaUser(String nueva, int user)throws ClassNotFoundException{
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("UPDATE usuario SET password=? WHERE userName=?");
        
        ps.setString(1, nueva);
        ps.setInt(2, user);
        
        ps.executeUpdate();
        
        ps.close();
        
        JOptionPane.showMessageDialog(null, "Se ha cambiado la contraseña");
        
    }catch(SQLException e){
        mensajeErrorSQL(e);
    }
    
}


public ResultSet datosUsuarios()throws ClassNotFoundException{
    
    ResultSet rs = null;
    
    try{
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("SELECT *FROM usuario");
        
        rs = ps.executeQuery();
        
    }catch(SQLException e){
        mensajeErrorSQL(e);
    }
    
    return rs;
}


public void eliminarUsuario(int user)throws ClassNotFoundException{
    
    try{
      
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("DELETE FROM usuario WHERE userName=?");
        
        ps.setInt(1, user);
        
        ps.executeUpdate();
        
        ps.close();
        
        JOptionPane.showMessageDialog(null, "Se ha eliminado el usuario");
        
    }catch(SQLException e){
       mensajeErrorSQL(e);   
    }
    
}



public void registrarIngresoVehiculo(Historial nuevo)throws ClassNotFoundException{
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("INSERT INTO historial (codigo,tipo_reparacion,fechaIngreso,fechaSalida) VALUES (?,?,?,?)");
        
        ps.setString(1, nuevo.getCodigo());
        ps.setString(2, nuevo.getTipo_reparacion());
        ps.setString(3, nuevo.getFechaIngreso());
        ps.setString(4, nuevo.getFechaSalida());
        
        ps.executeUpdate();
        ps.close();
        
        JOptionPane.showMessageDialog(null, "Se ha registrado el ingreso exitosamente");
        
    }catch(SQLException e){
        mensajeErrorSQL(e);
    }
    
    
}


public ResultSet obtenerVehiculosIngresados()throws ClassNotFoundException{
    
    ResultSet rs = null;
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("SELECT *FROM historial");
        
        rs = ps.executeQuery();
        
    }catch(SQLException e){
        mensajeErrorSQL(e);
    }
    
    return rs;
}



}
