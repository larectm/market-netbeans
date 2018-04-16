/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
/*
 *PERMITE CONECTAR EL PROGRAMA CON LA BASE DE DATOS
 */
/**
 *
 * @author felipe
 * @version 1.0
 * Clase conexion
 */

//importacion del package Datos 
package Datos;
import java.sql.*;

public class Conexion {

  
    //Declaracion de variables para mi MYSQL
    static final String DRIVER = "com.postgresql.jdbc.Driver";
    Statement instruccion = null;
    public static Statement sentencia;
    //CONTRUCTOR SIN PARAMENTROS
    public Conexion() { }
    //CONTRUCTOR CON PARAMENTROS DE TIPO USUARIO CLAVE
    public Connection abrirConeccionBd(String pUsuario, String pClave) {
        String lUrl = " ";
        Connection objConectar = null;
        String lMensaje = " ";
        try {
            Class.forName(DRIVER);
            try {
                objConectar = DriverManager.getConnection("jdbc:postgresql://localhost:5432/market", "postgres", "");
                instruccion = objConectar.createStatement();
            } catch (SQLException e) {
                if (objConectar == null) {
                    lMensaje = "objConectar NULO ";
                } else {
                    lMensaje = "objConectar " + objConectar;
                }
                throw new NullPointerException("ERROR ... NO SE PUDO EFECTUAR CONECCION A LA BASE DE DATOS " + lUrl + " " + pUsuario + " " + pClave + " " + lMensaje);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex + "Error...");
            throw new NullPointerException("ERROR ... ClassNotFoundException ");

        }
        return objConectar;
    }
/**
     * ************************************************************************************
     * Metodo que ejecuta sentencia SQL correspondiente a una consulta a la Base
     * de Datos. El resultado de la consultado es almacenado en una variable de
     * tipo ResultSet
     * *************************************************************************************
     * @param pSql
     * @param pConectar
     * @param pSentencia
     * @return 
     */
    public ResultSet ejecutarConsulta(String pSql, Connection pConectar, PreparedStatement pSentencia) {
        ResultSet objResultado = null;
        try {
            objResultado = pSentencia.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return objResultado;
    }

    /**
     * ************************************************************************************
     * Metodo que ejecuta sentencia SQL correspondiente a una transaccion de
     * Base de Datos (update, delete, insert) Este metodo NO retorna resultado
     * ****************************************************
     * @param pSql*********************************
     * @param pConectar
     */
    public void ejecutarTransaccion(String pSql, Connection pConectar) {
        Statement objSentencia = null;
        try {
            objSentencia = pConectar.prepareStatement(pSql);
            try {
                objSentencia.execute(pSql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * ************************************************************************************
     * Metodo que Cierra la consulta (resultado del SQL ejecutado) que
     * corresponde al tipo ResultSet
     * ************************************************************************************
     * @param pResul
     */
    public void cerrarConsulta(ResultSet pResul) {
        try {
            pResul.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * ************************************************************************************
     * Metodo que cierra la sentencia SQL ejecutada
     * *************************************************************************************
     * @param pSentencia
     */
    public void cerrarSentencia(PreparedStatement pSentencia) {
        try {
            try {
                pSentencia.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (NullPointerException e) {
            throw new NullPointerException("ERROR EN CLOSE SENTENCIA NULL");
        }
    }

    /**
     * ************************************************************************************
     * Metodo que cierra la conecciï¿½n a la Base de datos
     * *************************************************************************************
     * @param pConexion
     */
    public void cerrarConeccionBd(Connection pConexion) {
        try {
            pConexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) {
        Conexion conex = new Conexion ();
        conex.abrirConeccionBd("postgres", "1234");
    }
}

    

