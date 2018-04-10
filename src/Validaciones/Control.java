/*
 * Permite almacenar los usuarios del sistema
 */
package Validaciones;
/**
 *
 * @author FELIPE TORRES ASENCIO
 * @version 1.0
 */

public class Control {
    //DECLARACION DE VARIABLES
    public String usuario,clave,perfil;
    
 // CONTRUCTOR SIN PARAMENTROS

    public Control() {
       
    }
//METODO CONTRUCTOR CON PARAMENTROS
    public Control(String usuario, String clave, String perfil) {
        this.usuario = usuario;
        this.clave = clave;
        this.perfil = perfil;
    }
 
//ACCESADORES
    public String getClave() {
        return clave;
    }

    public String getPerfil() {
        return perfil;
    }

    public String getUsuario() {
        return usuario;
    }
//MUTADORES
    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
