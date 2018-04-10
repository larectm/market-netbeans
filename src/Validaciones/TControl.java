/*
 * PERMITE VALIDAR LOS ATRIBUTOS DE LA CLASE CONTROL 
 */
package Validaciones;
/**
 *
 * @author FELIPE TORRES ASENCIO
 * @version 1.0
 */
import Datos.Conexion;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TControl  {
  
    static int cont=0;
    static Conexion conex=new Conexion();
    static Connection canal=null;
    static Statement  orden=null;
    static ResultSet  resul=null;
    /******************/
    private final String usuario = "root";
    private final String clave = "";
    //METODO UTILIZADO PARA AGREGAR DATOS A LA TABLA CONTROL , DE ESTA MANERA GREAR LOS USUARIOS PARA EL PROGRAMA
    public void agregarDatosControl(Control control)
    {  try {
          canal=conex.abrirConeccionBd(usuario, clave);
          String sql="INSERT INTO CONTROL VALUES('"+control.getUsuario()+"',"
                  + " '"+control.getClave()+"','"+control.getPerfil()+"')";
          conex.ejecutarTransaccion(sql, canal);
         JOptionPane.showMessageDialog(null,"USUARIO REGISTRADO");
        } catch (HeadlessException e) {JOptionPane.showMessageDialog(null,"FALLO METODO INSERTAR "+e); }
    }
    //METODO QUE MODIFICA LOS USUARIOS YA INGRESADOS
    public void modificarDatosControl(Control control)
    { try {
        canal=conex.abrirConeccionBd(usuario, clave);
        String sql="UPDATE CONTROL SET "+"CLAVE='"+control.getClave()+"',PERFIL='"+control.getPerfil()+"'"
                + " WHERE (USUARIO='"+control.getUsuario()+"')";
        conex.ejecutarTransaccion(sql, canal);
        JOptionPane.showMessageDialog(null,"MODIFICACION ENVIADA A LA BD");
        } catch (HeadlessException e) {JOptionPane.showMessageDialog(null,"FALLO METODO MODIFICAR"); }
    }
    //METODO QUE ELIMINA DEL REGISTRO A LOS USUARIOS
    public boolean eliminarDatosControl(String us) throws Exception
    {  boolean elim=false;
       orden=conex.abrirConeccionBd(usuario, clave).createStatement();
       int el=orden.executeUpdate("DELETE FROM CONTROL WHERE (USUARIO='"+us+"')");
       if (el==1)
       {  elim=true;
         JOptionPane.showMessageDialog(null,"SE HA ELIMINADO DE LA BD");
       }
       else
       {  elim=false;
          JOptionPane.showMessageDialog(null,"FALLO METODO ELIMINAR");
       }
       return elim;
    }        
    //METODO QUE PERMITE LLAMAR LOS DATOS DE LOS USUARIOS , PARA SU UTILIZACION
    public String[] buscarDatosUsuario(String usu) throws Exception
    {   String[] user=new String[3];
        orden=conex.abrirConeccionBd(usuario, clave).createStatement();
        resul=orden.executeQuery("SELECT * FROM CONTROL WHERE (USUARIO='"+usu+"')");
        if (resul.next())
        {  user[0]=resul.getString(1);
           user[1]=resul.getString(2);
           user[2]=resul.getString(3);
        }
        else
        {  user[0]="";
           user[1]="";
           user[2]="";
        }
        return user;
    }        
       //ME TODO QUE PERMISTE LISTAR TODO LOS USARIOS ENOCNTRADOS EN LA TABLA CONTROL
    public List<Control> listarDatosUsuarios() throws Exception
    {   List<Control> usuarios=new ArrayList<>(); 
        orden=conex.abrirConeccionBd(usuario, clave).createStatement();
        resul=orden.executeQuery("SELECT * FROM CONTROL");
        while (resul.next())
        { String usuari=resul.getString("usuario");
          String claves=resul.getString("clave");
          String perfil=resul.getString("perfil");
          usuarios.add(new Control(usuari,claves,perfil));     
        }
        return usuarios;
    }        
    
}
