/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import Datos.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Felipe
 */
public class producto {
    public int codigo, stock, precio;
    public String nom_pro;
    static Conexion conex=new Conexion();
    static Connection canal=null;
    static Statement  orden=null;
    static ResultSet  resul=null;
    Connection objconexion = null;
    final String usuario = "postgres";
    final String clave = "1234";

    public producto(int codigo, int stock, int precio, String nom_pro) {
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
        this.nom_pro = nom_pro;
    }
    public producto ()
    {}
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNom_pro() {
        return nom_pro;
    }

    public void setNom_pro(String nom_pro) {
        this.nom_pro = nom_pro;
    }
    /*
    
   
   //metodo insetarPersona , que ingresa el registro a la base de dato
    public void  insertrPro(String nom_pro,int stock,int precio)
    {      try {
           canal=conex.abrirConeccionBd(usuario, clave);
           String sql = "insert into producto (nom_pro,stock,precio) values('"+nom_pro + "',"+stock+","+precio+")";
           conex.ejecutarTransaccion(sql, canal);
           try {
                //JOptionPane.showMessageDialog(null, "Se ingreso el usuario :"+nombre+' '+apellido_paterno+" correctamente..");
                System.out.println("Transaccion realizada a la tabla producto");
                        }
            catch (HeadlessException e){
                 //JOptionPane.showMessageDialog(null, "Se ingreso el usuario :"+nombre+' '+apellido_paterno+" correctamente..");   
                }
                System.out.println("error metodo insertar producto exception 1");
                }
            catch (Exception e) {
            }
                
                System.out.println("error metodo insertar producto exception2");
                
            }*/
    }
