/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import Datos.Conexion;

/**
 *
 * @author Felipe
 */
public class boleta {
    public int num_boleta;
    public String fecha;
    public String hora;
    public int total;
    public int codigo_pro_fk;
    public String rut_vend_fk;

    public boleta(int num_boleta, String fecha, String hora, int total, int codigo_pro_fk, String rut_vend_fk) {
        this.num_boleta = num_boleta;
        this.fecha = fecha;
        this.hora = hora;
        this.total = total;
        this.codigo_pro_fk = codigo_pro_fk;
        this.rut_vend_fk = rut_vend_fk;
    }

    public boleta() {
    }

    public int getNum_boleta() {
        return num_boleta;
    }

    public void setNum_boleta(int num_boleta) {
        this.num_boleta = num_boleta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCodigo_pro_fk() {
        return codigo_pro_fk;
    }

    public void setCodigo_pro_fk(int codigo_pro_fk) {
        this.codigo_pro_fk = codigo_pro_fk;
    }

    public String getRut_vend_fk() {
        return rut_vend_fk;
    }

    public void setRut_vend_fk(String rut_vend_fk) {
        this.rut_vend_fk = rut_vend_fk;
    }
   //metodo insetarPersona , que ingresa el registro a la base de dato
  
}
