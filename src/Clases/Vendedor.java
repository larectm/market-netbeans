/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Felipe
 */
public class Vendedor {
   public String rut,nombre,apellido,direccion;
   public int fono;
   public double porcenteaje,sueldo;

    public Vendedor(String rut, String nombre, String apellido, String direccion, int fono, double porcenteaje, double sueldo) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fono = fono;
        this.porcenteaje = porcenteaje;
        this.sueldo = sueldo;
    }

    public Vendedor() {
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    public double getPorcenteaje() {
        return porcenteaje;
    }

    public void setPorcenteaje(double porcenteaje) {
        this.porcenteaje = porcenteaje;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
   
    
}
