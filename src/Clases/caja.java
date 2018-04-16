/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Date;

/**
 *
 * @author Felipe
 */
public class caja {
    public Date fecha_caja;
    public int veinte_mil,diez_mil,cinco_mil,dos_mil,mil,kina,gambo,cincuenta,diez,ini_caja,fin_caja;
    public String rut_fk;

    public caja(Date fecha_caja, int veinte_mil, int diez_mil, int cinco_mil, int dos_mil, int mil, int kina, int gambo, int cincuenta, int diez, int ini_caja, int fin_caja, String rut_fk) {
        this.fecha_caja = fecha_caja;
        this.veinte_mil = veinte_mil;
        this.diez_mil = diez_mil;
        this.cinco_mil = cinco_mil;
        this.dos_mil = dos_mil;
        this.mil = mil;
        this.kina = kina;
        this.gambo = gambo;
        this.cincuenta = cincuenta;
        this.diez = diez;
        this.ini_caja = ini_caja;
        this.fin_caja = fin_caja;
        this.rut_fk = rut_fk;
    }

    public Date getFecha_caja() {
        return fecha_caja;
    }

    public void setFecha_caja(Date fecha_caja) {
        this.fecha_caja = fecha_caja;
    }

    public int getVeinte_mil() {
        return veinte_mil;
    }

    public void setVeinte_mil(int veinte_mil) {
        this.veinte_mil = veinte_mil;
    }

    public int getDiez_mil() {
        return diez_mil;
    }

    public void setDiez_mil(int diez_mil) {
        this.diez_mil = diez_mil;
    }

    public int getCinco_mil() {
        return cinco_mil;
    }

    public void setCinco_mil(int cinco_mil) {
        this.cinco_mil = cinco_mil;
    }

    public int getDos_mil() {
        return dos_mil;
    }

    public void setDos_mil(int dos_mil) {
        this.dos_mil = dos_mil;
    }

    public int getMil() {
        return mil;
    }

    public void setMil(int mil) {
        this.mil = mil;
    }

    public int getKina() {
        return kina;
    }

    public void setKina(int kina) {
        this.kina = kina;
    }

    public int getGambo() {
        return gambo;
    }

    public void setGambo(int gambo) {
        this.gambo = gambo;
    }

    public int getCincuenta() {
        return cincuenta;
    }

    public void setCincuenta(int cincuenta) {
        this.cincuenta = cincuenta;
    }

    public int getDiez() {
        return diez;
    }

    public void setDiez(int diez) {
        this.diez = diez;
    }

    public int getIni_caja() {
        return ini_caja;
    }

    public void setIni_caja(int ini_caja) {
        this.ini_caja = ini_caja;
    }

    public int getFin_caja() {
        return fin_caja;
    }

    public void setFin_caja(int fin_caja) {
        this.fin_caja = fin_caja;
    }

    public String getRut_fk() {
        return rut_fk;
    }

    public void setRut_fk(String rut_fk) {
        this.rut_fk = rut_fk;
    }
    
    
    
}
