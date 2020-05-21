
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


public void agregarUsuario(long user, String passwd, boolean role)throws ClassNotFoundException{
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("INSERT INTO usuario (userName,password,role) VALUES(?,?,?)");
        
        ps.setLong(1, user);
        ps.setString(2, passwd);
        ps.setBoolean(3, role);
        
        ps.executeUpdate();
        ps.close();
        
        JOptionPane.showMessageDialog(null, "Se ha creado el usuario con exito");
        
    }catch(SQLException e){
          mensajeErrorSQL(e);       
    }
        
    
}


public ResultSet buscarUsuario(long user)throws ClassNotFoundException{
    
    ResultSet rs = null; 
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("SELECT *FROM usuario WHERE userName=?");
        
        ps.setLong(1, user);
        
        rs = ps.executeQuery();
        
    }catch(SQLException e){
        mensajeErrorSQL(e); 
    }
    
    return rs;
}


public void cambiarContrasenaUser(String nueva, long user)throws ClassNotFoundException{
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("UPDATE usuario SET password=? WHERE userName=?");
        
        ps.setString(1, nueva);
        ps.setLong(2, user);
        
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


public void eliminarUsuario(long user)throws ClassNotFoundException{
    
    try{
      
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("DELETE FROM usuario WHERE userName=?");
        
        ps.setLong(1, user);
        
        ps.executeUpdate();
        
        ps.close();
        
        JOptionPane.showMessageDialog(null, "Se ha eliminado el usuario");
        
    }catch(SQLException e){
       mensajeErrorSQL(e);   
    }
    
}


/**
 * 
 *  CRUD PARA EL INGRESO DE UN VEHICULO AL TALLER, LOS DATOS LLEGAN EN UN OBJETO (NUEVO)
 *  DE LA CLASE HISTORIAL
 * 
     * @param nuevo
     * @throws java.lang.ClassNotFoundException
 **/


public void registrarHistorialVehiculo(Historial nuevo)throws ClassNotFoundException{
    
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


/**
 *  MÉTODO QUE RETORNA EL HISTORIAL DE UN VEHÍCULO, ES DECIR, TODAS LAS REPARACIONES
 *  QUE ÉSTE HA RECIBIDO CON SUS RESPECTIVAS FECHAS
 * 
     * @param numInterno
     * @return 
     * @throws java.lang.ClassNotFoundException
 **/

public ResultSet obtenerHistorialVehiculo(int numInterno)throws ClassNotFoundException{
    
    ResultSet rs = null;
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("SELECT *FROM historial WHERE numInterno=?");
        
        ps.setInt(1, numInterno);
        rs = ps.executeQuery();
        
    }catch(SQLException e){
        mensajeErrorSQL(e);
    }
    
    return rs;
}


/**
 *  MÉTODO PARA CAMBIAR CÓDIGO NFC EN LA BASE DE DATOS, EN CASO DE QUE EL
 *  ORIGINAL SE HAYA PERDIDO
 * 
     * @param numInterno
     * @param nuevo
     * @throws java.lang.ClassNotFoundException
 **/



public void cambiarNFCenHistorial(int numInterno, String nuevo)throws ClassNotFoundException{
    
    try{
      
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("UPDATE codigosnfc SET(codigo) WHERE numInterno=?");
        
        ps.setInt(1, numInterno);
        ps.setString(2, nuevo);
        
        ps.executeUpdate();
        
        ps.close();
        
        JOptionPane.showMessageDialog(null, "Se ha cambiado el código");
        
    }catch(SQLException e){
        mensajeErrorSQL(e);
    }
    
}





/**
 * 
 *  CRUD REGISTRO DE INGRESO DE UN VEHICULO EN LA TABLA "ingreso"
 * 
     * @param nfc
     * @param numInterno
     * @param fecha
     * @param estado
     * @throws java.lang.ClassNotFoundException
 **/


public void registrarIngresoVehiculo(String nfc, int numInterno, String fecha, boolean estado)throws ClassNotFoundException{
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("INSERT INTO ingreso (codigo,numInterno,fecha,salida) VALUES (?,?,?,?)");
        
        ps.setString(1, nfc);
        ps.setInt(2, numInterno);
        ps.setString(3, fecha);
        ps.setBoolean(4, estado);
        
        ps.executeUpdate();
        ps.close();
        
        JOptionPane.showMessageDialog(null, "Se ha registrado el ingreso");
        
    }catch(SQLException e){
        mensajeErrorSQL(e);
    }
}


/**
 *  MÉTODO PARA BUSCAR EL INGRESO DE UN VEHICULO POR MEDIO DE SU CÓDIGO NFC,
 *  EL MÉTODO ARROJA EL ESTADO DE SALIDA (SALIÓ O NO SALIÓ DEL TALLER) Y
 *  LA FECHA EN QUE ÉSTE INGRESÓ
 * 
     * @param nfc
     * @return 
     * @throws java.lang.ClassNotFoundException
 **/


public ResultSet obetenerIngresoVehiculo(String nfc)throws ClassNotFoundException{
    
    ResultSet rs = null;
    
        try{

            Connection con = conectar();
            PreparedStatement ps;

            ps = con.prepareStatement("SELECT *FROM ingreso WHERE codigo=?");

            ps.setString(1, nfc);

            rs = ps.executeQuery();

        }catch(SQLException e){
            mensajeErrorSQL(e);
        }
 
    return rs;
}


/**
 *  MÉTODO QUE OBTIENE TODOS LOS REGISTROS DE LA TABLAS "ingreso" CON EL
 *  FIN DE VER TODOS LOS VEHÍCULOS QUE AÚN NO HAN SIDO DADO DE ALTA
 * 
     * @return 
     * @throws java.lang.ClassNotFoundException
 **/


public ResultSet obtenerVehiculosIngresados()throws ClassNotFoundException{
    
    ResultSet rs = null;
    
    
     try{
         
         Connection con = conectar();
         PreparedStatement ps;
         
         ps = con.prepareStatement("SELECT *FROM ingreso WHERE salida=false");
         
         rs = ps.executeQuery();
         
     }catch(SQLException e){
         mensajeErrorSQL(e);
     }
    
    
    
    return rs;
}


/**
 *  MÉTODO PARA ELIMINAR UN INGRESO DE UN VEHÍCULO REGISTRADO EN LA TABLA
 *  "ingreso"
 * 
     * @param numInterno
     * @throws java.lang.ClassNotFoundException
 **/


public void eliminarIngresoVehiculo(int numInterno)throws ClassNotFoundException{
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;

            ps = con.prepareStatement("DELETE FROM ingreso WHERE numInterno=?");

            ps.setInt(1, numInterno);

            ps.executeUpdate();

        ps.close();
        
        JOptionPane.showMessageDialog(null, "El vehículo fue eliminado de la lista de ingresados");
        
    }catch(SQLException e){
         mensajeErrorSQL(e);
    }
    
}


/**
 *  MÉTODO PARA CAMBIAR EL ESTADO DE SALIDA DE UN VEHÍCULO EN LA TABLA 
 *  "ingreso"
 * 
     * @param numInterno
     * @param salida
     * @throws java.lang.ClassNotFoundException
 **/


public void cambiarEstadoSalida(int numInterno, boolean salida )throws ClassNotFoundException{
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        
            ps = con.prepareStatement("UPDATE ingreso SET(salida) WHERE numInterno=?");

            ps.setBoolean(1, salida);

            ps.executeUpdate();
        
    }catch(SQLException e){
        mensajeErrorSQL(e);   
    }
    
    
}




/**
 * 
 *  MÉTODO PARA REGISTRAR LOS CÓDIGOS NFC ASOCIADOS A CADA VEHÍCULO Y A SU HISTORIAL
 *  DE REPARACIONES
 * 
     * @param nfc
     * @param numInterno
     * @param disponible
     * @throws java.lang.ClassNotFoundException
 **/


public void registrarNFCs(String nfc, int numInterno, boolean disponible)throws ClassNotFoundException{
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("INSERT INTO codigosnfc (codigo,numInterno,disponible) VALUES (?,?,?)");
        
        ps.setString(1, nfc);
        ps.setInt(2, numInterno);
        ps.setBoolean(3, disponible);
        
        ps.executeUpdate();
        
        ps.close();
        
        JOptionPane.showMessageDialog(null, "Se ha asociado el código al vehículo");
        
    }catch(SQLException e){
        mensajeErrorSQL(e);
    }
    
}

/**
 *  MÉTODO QUE VERIFICA SI UN CÓDIGO NFC YA ESTÁ REGISTRADO Y ASOCIADO A UN 
 *  VEHÍCULO
 * 
     * @param nfc
     * @return 
     * @throws java.lang.ClassNotFoundException
 **/


public boolean verificarDisponibilidadNFC(String nfc)throws ClassNotFoundException{
    
    boolean disponible = true;
    
        try{

                Connection con = conectar();
                PreparedStatement ps;
                ResultSet rs;

                ps = con.prepareStatement("SELECT *FROM codigosnfc WHERE codigo=?");

                ps.setString(1, nfc);
                rs = ps.executeQuery();

                while(rs.next()){

                    disponible = rs.getBoolean("disponible");
                }

            rs.close();

        }catch(SQLException e){
            mensajeErrorSQL(e);
        }
    
    return disponible;
}



/**
 *  MÉTODO PARA VERIFICAR SI UN VEHÍCULO YA TIENE ASOCIADO UN CÓDIGO NFC, PUESTO
 *  QUE NO PUEDE TENER MÁS DE UN CÓDIGO NFC
 * 
 * 
     * @param numInterno
     * @return 
     * @throws java.lang.ClassNotFoundException
 **/


public ResultSet verificarCodigoEnVehiculo(int numInterno)throws ClassNotFoundException{
    
    ResultSet rs = null;
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("SELECT *FROM codigosnfc WHERE numInterno=?");
        
        ps.setInt(1, numInterno);
        
        rs = ps.executeQuery();
        
    }catch(SQLException e){
        mensajeErrorSQL(e);
    }
    
    return rs;
}


/**
 * 
 *  MÉTODO PARA OBTENER EL NÚMERO INTERNO DE UN VEHÍCULO EN LA TABLA "codigosnfc"
 * 
     * @param nfc
     * @return 
     * @throws java.lang.ClassNotFoundException
 **/


public int obtenerNumInternoingresado(String nfc)throws ClassNotFoundException{
    
    int numInterno = 0;
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        ResultSet rs;
        
        ps = con.prepareStatement("SELECT *FROM codigosnfc WHERE codigo=?");
        
          ps.setString(1, nfc);
        
             rs = ps.executeQuery();
        
                while(rs.next()){

                    numInterno = rs.getInt("numInterno");
                }

        rs.close();
        
    }catch(SQLException e){
        mensajeErrorSQL(e);
    }
    
    
    return numInterno;
}



/**
 *  MÉTODO QUE MUESTRA TODOS LOS CÓDIGOS NFC REGISTRADOS EN LA BASE DE DATOS, EN 
 *  LA TABLA "codigosnfc"
 *  
 * 
 * 
     * @return 
     * @throws java.lang.ClassNotFoundException
 **/



public ResultSet obtenerNFCsRegistrados()throws ClassNotFoundException{
    
    ResultSet rs = null;
    
      try{
          
          Connection con = conectar();
          PreparedStatement ps;
          
          ps = con.prepareStatement("SELECT *FROM codigosnfc");
          
          rs = ps.executeQuery();
          
      }catch(SQLException e){
          mensajeErrorSQL(e);
      }
    
    return rs;
}


/**
 *  MÉTODO QUE ELIMINA UN CÓDIGO NFC DE LA BASE DE DATOS, EN LA TABLA
 *  "codigosnfc"
 * 
 *
     * @param numInterno
     * @throws java.lang.ClassNotFoundException
 **/



public void eliminarNFC(int numInterno)throws ClassNotFoundException{
    
    try{
        
        Connection con = conectar();
        PreparedStatement ps;
        
        ps = con.prepareStatement("DELETE *FROM codigosnfc WHERE numInterno=?");
        
        ps.setInt(1, numInterno);
        
        ps.executeUpdate();
        
        ps.close();
        
        JOptionPane.showMessageDialog(null, "Se ha eliminado el código");
        
    }catch(SQLException e){
        mensajeErrorSQL(e);
    }
    
}



public int contarRegistrosVehiculos()throws ClassNotFoundException{
    
        int cont = 0;

        try{

            Connection con = conectar();    
            PreparedStatement ps;  
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT *FROM vehiculo");

            rs = ps.executeQuery();

            while(rs.next()){
                cont++;
            }
            
            ps.close();

        }catch(SQLException e){
            mensajeErrorSQL(e);
        }
    
    return cont;
}



public int contarRegistrosReparaciones()throws ClassNotFoundException{
    
        int cont = 0;

        try{

            Connection con = conectar();    
            PreparedStatement ps;  
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT *FROM reparaciones");

            rs = ps.executeQuery();

            while(rs.next()){
                cont++;
            }
            
            ps.close();

        }catch(SQLException e){
            mensajeErrorSQL(e);
        }
    
    return cont;
}


public int contarRegistrosUsuarios()throws ClassNotFoundException{
    
        int cont = 0;

        try{

            Connection con = conectar();    
            PreparedStatement ps;  
            ResultSet rs;
            
            ps = con.prepareStatement("SELECT *FROM usuario");

            rs = ps.executeQuery();

            while(rs.next()){
                cont++;
            }
            
            ps.close();

        }catch(SQLException e){
            mensajeErrorSQL(e);
        }
    
    return cont;
}




}
