/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Felipe
 */
public class Calculo {
    
    public static boolean esMultiplo(int n1,int n2){
	if (n1%n2==0)
		return true;
	else
		return false;
}
    public static void main (String arg [])
    {
       int multiplo = 20000;
            System.out.print("Los multiplos de " + multiplo + " son");
                for (int x=1;x<multiplo;x++){
                    if (esMultiplo(multiplo,x)){ 
                        System.out.print(" " + x);}
                    }
    }
}
